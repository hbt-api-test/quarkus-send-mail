package com.heinsohn.com.service.manager;

import com.heinsohn.com.model.MailParameterDto;

public interface ISendMailService {

    void sendEmailWithAttachment(MailParameterDto mailParameterDto) throws Exception;


}
