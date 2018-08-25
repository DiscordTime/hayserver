package br.com.hay.hayserver.controller

import br.com.hay.hayserver.service.recover.IRecoverService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RecoverController {

    @Autowired
    private lateinit var recoverService: IRecoverService

    @GetMapping("/recover")
    fun recoverPassword(@RequestParam email: String) {
        return recoverService.recoverPassword(email)
    }


}