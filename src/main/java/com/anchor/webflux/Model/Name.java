package com.anchor.webflux.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
public class Name {
    @JSONField(name = "Title")
    private String title;

    @JSONField(name = "First Name")
    private String firstName;

    @JSONField(name = "Middle Name")
    private String middleName;

    @JSONField(name = "Last Name")
    private String lastName;

    @JSONField(name = "Suffix")
    private String suffix;
}
