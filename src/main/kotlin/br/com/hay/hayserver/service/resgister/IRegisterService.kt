package br.com.hay.hayserver.service.resgister

import br.com.hay.hayserver.model.User

interface IRegisterService {
    fun registerUser(user: User)
}