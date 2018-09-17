package com.example.rui.templatemethod

abstract class AbstractCapture {
    abstract fun encount(pokemon: Pokemon)
    abstract fun ballThrow()
    abstract fun result(pokemon: Pokemon)

    fun capture(pokemon: Pokemon) {
        encount(pokemon)
        ballThrow()
        result(pokemon)
    }
}