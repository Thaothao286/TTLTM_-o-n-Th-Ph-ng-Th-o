/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author minhm
 */
public class Bai9 {

    public static void sendmail(String userName, String password, String email2, String content, String title) throws AddressException,
            MessagingException {
        //Taọ đối tượng để thiết lập các thuộc tính cho việc gửi mail
        Properties props = new Properties();
        props.put("mail.debug", "true");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        // port mail thường là 587 hoặc 456
        props.put("mail.smtp.port", "587");
        // Tạo đối tượng Session (phiên làm việc với gmail)
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication
                    getPuserNameasswordAuthentication() {
                //để gửi mail qua SMTP cần có tài khoản hợp lệ của google
                return new PasswordAuthentication(userName, password);
            }
        });
        // Tạo đối tượng chứa thông điệp cần gửi mail
        Message message = new MimeMessage(session);
        // Truyền địa chỉ muốn gửi thông điệp
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(email2));
        message.setSubject(content);
        message.setContent(title, "text/html");
        Transport.send(message, userName, password);
    }

    public static void main(String[] args) throws MessagingException {
        try {
            String username1 = "thesupperman2000";//Tài khoản gmail
            String pass = "minhmoc24lc";//Mật khẩu gmail
            String username2 = "thesupperman2000@gmail.com";//Địa chỉ gmail muốn nhận
            String content = "test xem duoc khong bạn ơi ;";
            String title = "mail from " + username1;
            sendmail(username1, pass, username2, content, title);
            System.out.println("gui thanh cong");
        } catch (Exception e) {
            System.out.println("gui that bai :" + e.getMessage());
            e.printStackTrace();
        }
    }
}
