package br.com.hay.hayserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HayServerApplication

fun main(args: Array<String>) {
    runApplication<HayServerApplication>(*args)
}
