package com.ua;

public class Main {

    public static void main(String[] args) {
        Generate generate = new CommonGenerate();
        GenerateExcel generateExcel = new GenerateExcel();
        generate.saveToPdf();
        generateExcel.saveToExcel();
    }
}
