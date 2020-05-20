package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserNote {
    @JSONField(name = "Text")
    private String text;

    @JSONField(name = "Date")
    private Date date;
}
