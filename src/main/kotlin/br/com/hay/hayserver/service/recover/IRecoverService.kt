package br.com.hay.hayserver.service.recover

interface IRecoverService {
    fun recoverPassword(email: String)
}