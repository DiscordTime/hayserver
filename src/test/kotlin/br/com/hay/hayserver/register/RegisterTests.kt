package br.com.hay.hayserver.register

import org.junit.Test
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class RegisterTests {

	@BeforeAll
	fun setup() {
		println(">> Start Register Test")
	}

	@Test
	fun contextLoads() {
	}

	@AfterAll
	fun teardown() {
		println(">> Tests Finish")
	}

}
