package com.echotrap.commands

import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import org.springframework.shell.standard.ShellOption

@ShellComponent
class HelloCommand {
    @ShellMethod(key = ["hello"])
    fun hello(
        @ShellOption(defaultValue = "World") arg: String
    ):String {
        return "Hello, $arg!"
    }

    @ShellMethod(key = ["bye"])
    fun bye():String {
        return "Goodbye, World!!"
    }
}