package com.heinsohn.com.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailParameterDto {

    List<String> from;
    List<String> cc;
    List<String> bcc;
    String subject;
    String mailText;
    File file;

}
