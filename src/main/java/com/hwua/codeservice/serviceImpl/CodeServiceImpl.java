package com.hwua.codeservice.serviceImpl;

import com.hwua.codeservice.dao.CodeDao;
import com.hwua.codeservice.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CodeServiceImpl implements CodeService {
    @Autowired
    private CodeDao codeDao;

    @Override
    public String getCode(String prefix, String date, int length) {
        Map<String,Object> map=codeDao.queryCode(prefix,date);
        StringBuffer code=new StringBuffer(prefix);
        code.append(date);
        if(map!=null){
            codeDao.updateCode(prefix,date);
            map=codeDao.queryCode(prefix,date);
            String num=map.get("num").toString();
            for(int i=0; i<length-num.length(); i++){
                code.append("0");
            }
            code.append(num);
        }else{
            codeDao.addCode(prefix,date);
            for(int i=0; i<length-1; i++){
                code.append("0");
            }
            code.append("1");
        }
        return code.toString();
    }
}
