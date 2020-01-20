package com.unknown.board

import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.testcontainers.containers.GenericContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@Testcontainers
class BoardApplicationTests {

//	@Container
//	val postgres = GenericContainer<>().withExposedPorts(5432)
	@Test
	fun contextLoads() {
	}

}
