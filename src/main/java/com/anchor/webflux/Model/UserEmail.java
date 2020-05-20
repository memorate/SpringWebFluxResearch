package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserEmail {
    @JSONField(name = "EmailAddress")
    private String emailAddress;

    @JSONField(name = "StartDate", format = "yyyy-MM-dd")
    private Date startDate;

    @JSONField(name = "EndDate", format = "yyyy-MM-dd")
    private Date endDate;
}
