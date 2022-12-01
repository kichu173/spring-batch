package com.example.model;

public class JobParamsRequest {
    private String paramKey;
    private String paramValue;

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}

//[
//        {
//        "paramKey": "test",
//        "paramValue": "test123"
//        },
//        {
//        "paramKey": "abc",
//        "paramValue": "abc123"
//        }
//        ]
