package com.enxendra.huf.api;

public enum ExportFormat {
    CSV("CSV"), PDF("PDF"), XLS("XLS"), XLSX("XLSX"), DOCX("DOCX"), RTF("RTF"), ODT("ODT"), ODS("ODS");

    private final String text;

    private ExportFormat(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
