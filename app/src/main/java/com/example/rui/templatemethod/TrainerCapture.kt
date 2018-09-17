package com.example.rui.templatemethod

class TrainerCapture: AbstractCapture() {
    override fun encount(pokemon: Pokemon){
        println("あいては\n${pokemon.name}を くりだした！")
    }

    override fun ballThrow(){
        println("レッドは マスターボールを なげた！")
    }

    override fun result(pokemon: Pokemon) {
        println("トレーナーに ボールを はじかれた！")
        println("ひとの ものを とったら どろぼう！")
    }
}