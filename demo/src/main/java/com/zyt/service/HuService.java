package com.zyt.service;

import cn.hutool.core.lang.Console;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.sax.handler.RowHandler;

import java.util.List;
import java.util.Map;

public interface HuService {

    public static void main(String[] args) {

        //ExcelUtil.readBySax("明确套餐民生.xlsx", 0, createRowHandler());

    }

    static RowHandler createRowHandler() {
        return new RowHandler() {
            @Override
            public void handle(int sheetIndex, long rowIndex, List<Object> rowList) {
                Console.log("[{}] [{}] {}", sheetIndex, rowIndex, rowList);
            }
        };
    }


}
