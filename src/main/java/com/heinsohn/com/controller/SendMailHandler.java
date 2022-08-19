package com.heinsohn.com.controller;

import com.heinsohn.com.model.MailParameterDto;
import com.heinsohn.com.service.manager.ISendMailService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("/send/mail")
@Singleton
@Slf4j
@PermitAll
public class SendMailHandler {

    @Inject
    ISendMailService iSendMailService;

    @POST
    @Path("/attachment")
    public Response sendEmailWithAttachment(@Valid MailParameterDto mailParameterDto) throws Exception {
       iSendMailService.sendEmailWithAttachment(mailParameterDto);
       return Response.ok().build();
    }



}