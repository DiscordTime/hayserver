package br.com.hay.hayserver.service.recover

import br.com.hay.hayserver.dao.UserDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class RecoverService : IRecoverService {

    @Autowired
    private lateinit var userDao: UserDao
    @Autowired
    private lateinit var mailSender: JavaMailSender
    
    private val preparedMail: SimpleMailMessage = SimpleMailMessage()

    override fun recoverPassword(email: String){
        val password = userDao.recoverPassword(email)
        sendMail(email, password)
    }

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