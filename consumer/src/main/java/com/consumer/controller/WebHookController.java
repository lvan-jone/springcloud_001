package com.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Slf4j
@RestController
@RequestMapping("/webhook")
public class WebHookController {

    private static final String SECRET = "12345"; // 在GitHub设置Webhook时填写的密钥1
    private static final String HEADER_X_HUB_SIGNATURE_256 = "X-Hub-Signature-256";

    @PostMapping
    public ResponseEntity<String> receiveWebhook(
            @RequestHeader HttpHeaders headers,
            @RequestBody String payload) {
        log.info("come");
        log.info("payload:{},headers:{}", payload, headers);
        // 验证签名
        boolean success = verifySignature(headers, payload);
        log.info("success...:" + success);
//        if (!success) {
//            return new ResponseEntity<>("Invalid signature", HttpStatus.UNAUTHORIZED);
//        }
        log.info("payload" + payload);
        // 处理 Webhook 事件
        // 这里可以根据需要解析 payload 并执行相应的逻辑
        //....
        return new ResponseEntity<>("Webhook received", HttpStatus.OK);
    }

    private boolean verifySignature(HttpHeaders headers, String payload) {
        String headerValue = headers.getFirst(HEADER_X_HUB_SIGNATURE_256);
        log.info("headerValue:{}", headerValue);
        if (headerValue == null || !headerValue.startsWith("sha256=")) {
            return false;
        }
        String[] parts = headerValue.split("=", 2);
        if (parts.length != 2) {
            return false;
        }
        String signature = parts[1];
        log.info("signature:{}", signature);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec keySpec = new SecretKeySpec(SECRET.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            mac.init(keySpec);
            byte[] hmacBytes = mac.doFinal(payload.getBytes(StandardCharsets.UTF_8));
            String calculatedSignature = "sha256=" + Base64.getEncoder().encodeToString(hmacBytes);
            log.info("calculatedSignature:{},headerValue:{}", calculatedSignature, headerValue);
            return calculatedSignature.equals(headerValue);
        } catch (Exception e) {
            log.error("Error verifying signature", e);
            return false;
        }
    }
}