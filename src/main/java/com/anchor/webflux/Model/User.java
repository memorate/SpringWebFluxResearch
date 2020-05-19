package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@NoArgsConstructor
public class User{

    @JSONField(name = "Full Name")
    private String fullName;

    @JSONField(name = "Name")
    private List<Name> name;
}
