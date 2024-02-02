package com.gabrielpinto.maildemo.service;

import com.gabrielpinto.maildemo.exception.MailSenderException;
import com.gabrielpinto.maildemo.model.MailStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromUsername;

    public void sendMail(String mail, MailStructure mailStructure) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom(fromUsername);
            simpleMailMessage.setSubject(mailStructure.getSubject());
            simpleMailMessage.setText(mailStructure.getMessage());
            simpleMailMessage.setTo(mail);
            simpleMailMessage.setCc();
            mailSender.send(simpleMailMessage);
        } catch (Exception e) {
            throw new MailSenderException("Error while sending mail");
        }
    }
}
