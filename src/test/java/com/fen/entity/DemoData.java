package com.fen.entity;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

@Data
public class DemoData {
    private String string;
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private String  date;
    private Double  doubleData;
}
