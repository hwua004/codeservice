package com.hwua.codeservice;

import com.hwua.codeservice.service.CodeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeserviceApplicationTests {
    @Autowired
    private CodeService codeService;

    @Test
    public void contextLoads() {
        String prefix="SERVICE";
        Date date= new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd");
        String riqi=sdf.format(date);
        for(int i=0; i<10; i++){
            String code=codeService.getCode(prefix,riqi,4);
            System.out.println(code);
        }



    }

}
