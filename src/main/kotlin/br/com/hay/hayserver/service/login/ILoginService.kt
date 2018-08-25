package br.com.hay.hayserver.service.login

import br.com.hay.hayserver.model.User

interface ILoginService {
    fun authUser(email: String, password: String) : User
}