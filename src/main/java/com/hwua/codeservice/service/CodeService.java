package com.hwua.codeservice.service;

public interface CodeService {
    //lenth 表示流水号的长度,以便在号码前面追加0
    public String getCode(String prefix,String date,int length);

}
