package com.example.rui.templatemethod

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pikachu = Pokemon("ピカチュウ")

        val wild: AbstractCapture = WildCapture()
        wild.capture(pikachu)

        val trainer: AbstractCapture = TrainerCapture()
        trainer.capture(pikachu)
    }
}
