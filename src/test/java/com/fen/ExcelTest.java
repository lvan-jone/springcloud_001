package com.fen;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.alibaba.excel.EasyExcel;
import com.fen.entity.DemoData;
import org.junit.jupiter.api.Test;

public class ExcelTest {


    @Test
    public void testAddition() {
        int result = 1 + 1;
        assertEquals(2, result, "1 + 1 should equal 2");
    }

    @Test
    public void testSubtraction() {
        int result = 2 - 1;
        assertEquals(1, result, "2 - 1 should equal 1");
    }

    /**
     * 最简单的读
     * <p>1. 创建excel对应的实体对象 参照{@link DemoData }
     * <p>2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link DemoDataListener}
     * <p>3. 直接读即可
     */
    @Test
    public void simpleRead() {
        String fileName = "C:\\Users\\admin\\Desktop\\12.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet().doRead();
    }

}
