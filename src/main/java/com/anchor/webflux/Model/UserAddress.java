package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserAddress {
    @JSONField(name = "type")
    private String type;

    @JSONField(name = "Full Address")
    private String fullAddress;

    @JSONField(name = "County")
    private String county;

    @JSONField(name = "Dates")
    private AddressDates dates;

    @Data
    @NoArgsConstructor
    public static class AddressDates {
        @JSONField(name = "Moved In", format = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        private Date movedIn;

        @JSONField(name = "Moved Out", format = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        private Date movedOut;
    }
}
