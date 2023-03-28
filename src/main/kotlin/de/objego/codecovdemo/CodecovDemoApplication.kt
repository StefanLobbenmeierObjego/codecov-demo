package de.objego.codecovdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodecovDemoApplication

fun main(args: Array<String>) {
	runApplication<CodecovDemoApplication>(*args)
}
