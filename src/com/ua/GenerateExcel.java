package com.ua;

public class GenerateExcel implements IExcelGenerate {

    @Override
    public void saveToExcel() {
        System.out.println("Saving file to .xlsx format");
    }
}
