package com.enxendra.huf.api.model.serie;

public class Serie {

    private Long id;
    private String name;
    private String code;
    private String prefix;
    private String suffix;
    private String fill_left;
    private String numbering;
    private String default_series;
    private String reboot_year;
    private String next_number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFillLeft() {
        return fill_left;
    }

    public void setFillLeft(String fillLeft) {
        this.fill_left = fillLeft;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering;
    }

    public String getDefaultSeries() {
        return default_series;
    }

    public void setDefaultSeries(String defaultSeries) {
        this.default_series = defaultSeries;
    }

    public String getRebootYear() {
        return reboot_year;
    }

    public void setRebootYear(String rebootYear) {
        this.reboot_year = rebootYear;
    }

    public String getNextNumber() {
        return next_number;
    }

    public void setNextNumber(String nextNumber) {
        this.next_number = nextNumber;
    }

}
