package com.unknown.board

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@Testcontainers
@ContextConfiguration(initializers = [BoardApplicationTest.])
class BoardApplicationTest {

//	@Container
//	val postgres = GenericContainer<>().withExposedPorts(5432)
	@Test
	fun contextLoads() {
	}

}
