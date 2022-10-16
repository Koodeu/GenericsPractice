package com.example.genericspractice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GenericsPracticeApplication

fun main(args: Array<String>) {
    runApplication<GenericsPracticeApplication>(*args)
}
