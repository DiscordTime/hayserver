package br.com.hay.hayserver.model

import javax.persistence.*

@Entity
@Table(name = "TB_USER")
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = -1,
                val name: String = "", val email: String = "",
                val password: String = "", val picture: String = "") {

    companion object {
        fun empty() = User(-1, String.empty(), String.empty(), String.empty(), String.empty())
    }
}

fun String.Companion.empty() = ""