package com.fen.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class Region {
    @ExcelProperty(index = 0)
    private Integer id;
    @ExcelProperty(index = 1)
    private String province;
    @ExcelProperty(index = 2)
    private String city;


}
