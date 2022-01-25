package com.ua;

public class CommonGenerate implements Generate {

    @Override
    public void saveToPdf() {
        System.out.println("Saving file to .pdf format");
    }

    @Override
    public void saveToExcel() {
        System.out.println("Saving file to .xlsx format");
    }
}
