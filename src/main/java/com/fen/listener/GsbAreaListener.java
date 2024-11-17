package com.fen.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.fen.entity.Region;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GsbAreaListener extends AnalysisEventListener<Region> {

    //    private GsbAreaMapper gsbAreaMapper;
//    private List<GsbArea> list = new ArrayList<>();
    private List<Region> list = new ArrayList<>();

    // 通过构造器注入mapper
//    public GsbAreaListener(GsbAreaMapper gsbAreaMapper) {
//        this.gsbAreaMapper = gsbAreaMapper;
//    }

    @Override
    public void invoke(Region data, AnalysisContext context) {

        log.info("region = {}", data);
        list.add(data);

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        //saveData();
    }

    private void saveData() {
        log.info("------------  开始存储数据  ----------");
        if (list != null && list.size() > 0) {
            //list.stream().forEach(System.out::println);
//            gsbAreaMapper.insertList(list); //批量插入不会插入id
        }
    }

}
