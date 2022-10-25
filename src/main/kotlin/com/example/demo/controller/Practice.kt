package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.InputMismatchException

@RestController
@RequestMapping("/hello")
class Practice {
    @GetMapping()
    fun index(): String {

        val age: Int = 19
        if (age == 18) {
            return ("soy mayor de edad tengo $age anios")
        } else {
            return ("soy menor de edad TENGO $age anios")
        }
    }

    @GetMapping("/{age}")


fun indexAge(@PathVariable age:Int): String =
    when (age) {

        in 0..11   -> "ni"
        in 12..17  -> "adolecesente"
        in 18..21 -> "adulto joven"
        in 22..64 -> "adulto"
        in 65..80 ->"3ra edad"

        else -> "Unknown"
    }
}


