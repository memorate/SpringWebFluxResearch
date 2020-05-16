package com.anchor.webflux.ServiceImpl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WebFluxServiceImpl {

//    private ReactiveMongoTemplate
    public void parseJson() {
        try {
            String json = FileUtil.readUtf8String(new ClassPathResource("data.json").getFile());
            JSONArray jsonArray = JSONUtil.parseArray(json);
            System.out.println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
