package br.com.hay.hayserver.service.recover

import br.com.hay.hayserver.dao.UserDao
import br.com.hay.hayserver.wrapper.MailWrapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RecoverService : IRecoverService {

    @Autowired
    private lateinit var userDao: UserDao
    private val emailSender: MailWrapper = MailWrapper()

    override fun recoverPassword(email: String){
        val password = userDao.recoverPassword(email)
        emailSender.sendMail(email, password)
    }

}