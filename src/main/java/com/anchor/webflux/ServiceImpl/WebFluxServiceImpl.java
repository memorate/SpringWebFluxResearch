package com.anchor.webflux.ServiceImpl;

import cn.hutool.core.io.FileUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class WebFluxServiceImpl {

    public void parseJson(){
        ClassPathResource resource = new ClassPathResource("data.json");
        try {
            String string = FileUtil.readString(resource.getFile(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
