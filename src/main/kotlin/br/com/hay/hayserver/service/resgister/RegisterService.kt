package br.com.hay.hayserver.service.resgister

import br.com.hay.hayserver.dao.UserDao
import br.com.hay.hayserver.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RegisterService : IRegisterService {

    @Autowired
    private lateinit var userDao: UserDao

    override fun registerUser(user: User): Boolean {
        try {
            userDao.save(user)
            return true;
        } catch (e: Exception) {
            return false;
        }
    }

}