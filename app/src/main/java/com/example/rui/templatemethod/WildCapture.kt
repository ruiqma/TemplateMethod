package com.example.rui.templatemethod

import java.util.*

class WildCapture: AbstractCapture() {
    override fun encount(pokemon: Pokemon){
        println("あ！ やせいの\n${pokemon.name}が とびだしてきた！")
    }

    override fun ballThrow(){
        println("レッドは モンスターボールを なげた！")
    }

    override fun result(pokemon: Pokemon) {
        val num = Random().nextInt(2)
        println(if(num == 0) "やったー！\n${pokemon.name}を つかまえたぞ！" else "ああ！\nつかまえたと おもったのに！")
    }
}