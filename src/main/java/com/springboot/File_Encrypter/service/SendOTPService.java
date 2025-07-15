package com.springboot.File_Encrypter.service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendOTPService {
    public static void sendOTP(String email, String genOTP) {
        String to = email;

        // Sender's email ID needs to be mentioned
        String from = "Senders email-id";

        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(from, "// Create Application password on google accountans paste here ");

            }

        });

        session.setDebug(true);

        try {

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject("OTP for File Encrypter");

            message.setText("Your One time Password for File Encrypter app is " + genOTP);

            System.out.println("sending...");

            Transport.send(message);
            System.out.println("Message sent successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }

}
