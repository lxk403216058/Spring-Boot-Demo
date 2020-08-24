package com.huazi.async;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class AsyncApplicationTests {
    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        //一个简单的邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("hello ...");
        mailMessage.setText("welcome ....");

        mailMessage.setTo("403216058@qq.com");
        mailMessage.setFrom("403216058@qq.com");

        mailSender.send(mailMessage);
    }
    @Test
    void contextLoads1() throws MessagingException {

        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        helper.setSubject("邮件测试");
        helper.setText("<p style='color:red'>邮件测试</p>",true);
        //附件
        helper.addAttachment("deshan.jpg",new File("C:\\Users\\lxk\\Pictures\\Saved Pictures\\deshan.jpeg"));
        helper.setTo("403216058@qq.com");
        helper.setFrom("403216058@qq.com");
        mailSender.send(mimeMessage);
    }

    //封装成方法

    /**
     * 发送邮件
     * @param html 是否开启HTML
     * @param subject 主题
     * @param text 内容
     * @param fileName 附件名
     * @param filePath 附件路径
     * @param to 接收者
     * @param from 发送者
     * @throws MessagingException
     */
    public void sendMail(Boolean html, String subject, String text, String fileName, String filePath, String to, String from) throws MessagingException {
        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,html);

        helper.setSubject(subject);
        helper.setText(text,html);
        //附件
        helper.addAttachment(fileName,new File(filePath));
        helper.setTo(to);
        helper.setFrom(from);
        mailSender.send(mimeMessage);
    }

}
