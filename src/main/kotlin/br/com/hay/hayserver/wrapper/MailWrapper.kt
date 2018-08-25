package br.com.hay.hayserver.wrapper

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

class MailWrapper {

    @Autowired
    private lateinit var mailSender: JavaMailSender
    private val preparedMail: SimpleMailMessage = SimpleMailMessage()

    @Bean
    fun sendMail(email: String, password: String) {

        preparedMail.setFrom(email)
        preparedMail.setTo(email)
        preparedMail.setSubject("[HAY] Password Recovery")
        preparedMail.setText("Hello you forget your password, but don't worried Padawan" +
                "Your email is: " + email + "and your password is: "+ password)

        try {
            mailSender.send(preparedMail)
        } catch (e: Exception) {
            e.printStackTrace()
        }


    }
}