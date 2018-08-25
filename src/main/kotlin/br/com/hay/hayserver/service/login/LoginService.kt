package br.com.hay.hayserver.service.login

import br.com.hay.hayserver.dao.UserDao
import br.com.hay.hayserver.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class LoginService : ILoginService {

    @Autowired
    private lateinit var userDao: UserDao

    override fun authUser(email: String, password: String) : User {
        return userDao.userAuth(email, password)
    }

}