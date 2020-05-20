package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserPhone {

    @JSONField(name = "TypeOfPhone")
    private String typeOfPhone;

    @JSONField(name = "DiallingNumber")
    private String diallingNumber;

    @JSONField(name = "Dates")
    private PhoneDates dates;

    @Data
    @NoArgsConstructor
    public static class PhoneDates {
        @JSONField(name = "From", format = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        private Date from;

        @JSONField(name = "To", format = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        private Date to;
    }

}
