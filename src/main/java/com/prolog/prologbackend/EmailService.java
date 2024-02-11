package com.prolog.prologbackend;

import com.prolog.prologbackend.DTO.EmailDTO;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * Author : Kim
 * Date : 2024-02-11
 * Description : 이메일 전송 관련 Service 레이어
*/

@Service
@RequiredArgsConstructor
public class EmailService{
    private final JavaMailSender javaMailSender;

    @Async
    public boolean sendMailReject(EmailDTO emailDTO) throws Exception {
        boolean msg = false;
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setTo(emailDTO.getTargetMail());
        simpleMailMessage.setSubject(emailDTO.getSubject());
        simpleMailMessage.setFrom("gwangjeg14@gmail.com");
        simpleMailMessage.setText(emailDTO.getText());
        System.out.println(emailDTO.getTargetMail());
        System.out.println(emailDTO.getSubject());
        System.out.println(emailDTO.getText());

        try{
            javaMailSender.send(simpleMailMessage);
        } catch(Exception e){
            e.printStackTrace();
            return msg;
        }
        return msg = true;
    }
}
