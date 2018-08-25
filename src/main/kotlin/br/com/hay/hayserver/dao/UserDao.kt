package br.com.hay.hayserver.dao

import br.com.hay.hayserver.model.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserDao : CrudRepository<User, Long> {

    @Query("SELECT user FROM User as user WHERE user.email = :email and user.password = :password")
    fun userAuth(@Param("email") email: String,
                 @Param("password") password: String) : User

    @Query("SELECT password FROM User as user WHERE user.email = :email")
    fun recoverPassword(@Param("email") email: String) : String

}