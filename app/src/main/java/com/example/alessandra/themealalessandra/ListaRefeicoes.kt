package com.example.alessandra.themealalessandra

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lista_refeicoes.*

class ListaRefeicoes : AppCompatActivity() {

    val listaRefeicoes: MutableList<Refeicao> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_refeicoes)

        val adapter = RefeicaoAdapter(this, listaRefeicoes)
        val layoutManager = LinearLayoutManager(this)

        rvRefeicoes.adapter = adapter
        rvRefeicoes.layoutManager = layoutManager

    }
}