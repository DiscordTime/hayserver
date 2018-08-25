package br.com.hay.hayserver.controller

import br.com.hay.hayserver.model.User
import br.com.hay.hayserver.service.resgister.IRegisterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterController {

    @Autowired
    private lateinit var registerService: IRegisterService

    @PostMapping("/register")
    fun login(@RequestBody user: User): Boolean {
        return registerService.registerUser(user)
    }

}