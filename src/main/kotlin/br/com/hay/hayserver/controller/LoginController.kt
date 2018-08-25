package br.com.hay.hayserver.controller

import br.com.hay.hayserver.model.User
import br.com.hay.hayserver.service.login.ILoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @Autowired
    private lateinit var loginService: ILoginService

    @GetMapping("/login")
    fun login(@RequestParam email: String, @RequestParam password : String) : User {
        return loginService.authUser(email, password)
    }

}