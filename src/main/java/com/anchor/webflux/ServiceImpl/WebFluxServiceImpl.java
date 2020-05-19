package com.anchor.webflux.ServiceImpl;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.anchor.webflux.Model.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class WebFluxServiceImpl {

//    private ReactiveMongoTemplate
    public void parseJson() {
//        try {
//            String json = FileUtil.readUtf8String(new ClassPathResource("data.json").getFile());
//            List<User> users = JSON.parseArray(json, User.class);
//            System.out.println("ok");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        try {
            String json = FileUtil.readUtf8String(new ClassPathResource("data.json").getFile());
            List<User> users = JSON.parseArray(json, User.class);
            System.out.println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
