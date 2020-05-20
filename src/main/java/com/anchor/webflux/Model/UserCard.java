package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserCard {
    @JSONField(name = "CardNumber")
    private String cardNumber;

    @JSONField(name = "ValidFrom")
    private Date validFrom;

    @JSONField(name = "ValidTo")
    private Date validTo;

    @JSONField(name = "CVC")
    private String cvc;
}
