package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
public class User{

    @JSONField(name = "Full Name")
    private String fullName;
}
