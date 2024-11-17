package com.fen.controller;

import com.alibaba.excel.EasyExcel;
import com.fen.entity.Region;
import com.fen.listener.GsbAreaListener;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController("/v1/excel")
@Tag(name = "gsbArea", description = "gsb区域信息")
public class GsbAreaController {

//    @Autowired
//    private GsbAreaMapper gsbAreaMapper;

    @Operation(summary = "上传excel", description = "上传表格信息")
    @PostMapping("/importExcel")
    public List<Region> importExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            List<Region> list = new ArrayList<>();
            if (file != null) {
                list = EasyExcel.read(file.getInputStream(), Region.class, new GsbAreaListener()).sheet().doReadSync();
//            EasyExcel.read(file.getInputStream(), Region.class, new GsbAreaListener(gsbAreaMapper)).sheet().doRead();
            }
            return list;
        } catch (Exception e) {
            log.warn("exception occurred:", e);
            return Collections.emptyList();
        }
    }

    @GetMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) {
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String fileName = "gsb_area_" + System.currentTimeMillis();
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            List<Region> list = new ArrayList<>();
            Region region = new Region();
            region.setId(1);
            region.setProvince("广东省");
            region.setCity("深圳市");
            list.add(region);
            EasyExcel.write(response.getOutputStream(), Region.class).sheet("sheet1").doWrite(list);
        } catch (Exception e) {
            log.warn("exception occurred:", e);
        }
    }


}
