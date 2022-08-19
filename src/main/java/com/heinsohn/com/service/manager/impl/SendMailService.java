package com.heinsohn.com.service.manager.impl;


import com.heinsohn.com.model.MailParameterDto;
import com.heinsohn.com.service.manager.ISendMailService;
import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.File;

@ApplicationScoped
@Slf4j
@PermitAll
public class SendMailService implements ISendMailService {


    @Inject
    Mailer mailer;


    @Override
    public void sendEmailWithAttachment(MailParameterDto mailParameterDto) throws Exception {

        try {

            File file = mailParameterDto.getFile();


            Mail mail = new Mail();

            mail.setTo(mailParameterDto.getFrom());
            mail.setCc(mailParameterDto.getCc());
            mail.setBcc(mailParameterDto.getBcc());
            mail.setSubject(mailParameterDto.getSubject());
            mail.setText(mailParameterDto.getMailText());
            mail.addAttachment(file.getName(), file, "text/plain");

            mailer.send(mail);

        }catch (Exception e){
            throw new Exception();
        }

    }

}
