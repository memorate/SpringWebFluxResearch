package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class User{

    @JSONField(name = "Full Name")
    private String fullName;

    @JSONField(name = "Name")
    private UserName name;

    @JSONField(name = "Addresses")
    private List<UserAddress> addresses;

    @JSONField(name = "Notes")
    private List<UserNote> notes;

}
