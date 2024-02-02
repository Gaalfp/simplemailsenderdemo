package com.gabrielpinto.maildemo.controller;

import com.gabrielpinto.maildemo.model.MailStructure;
import com.gabrielpinto.maildemo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send/{mail}")
    public ResponseEntity<String> sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure) {
        mailService.sendMail(mail, mailStructure);
        return new ResponseEntity<>("Mail sent successfully", HttpStatus.OK);
    }
}
