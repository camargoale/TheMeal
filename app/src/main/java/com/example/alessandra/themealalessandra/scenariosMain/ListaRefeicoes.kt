package com.example.alessandra.themealalessandra.scenariosMain

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.alessandra.themealalessandra.R
import com.example.alessandra.themealalessandra.entities.Refeicao
import kotlinx.android.synthetic.main.activity_lista_refeicoes.*
import android.widget.ProgressBar

class ListaRefeicoes : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_refeicoes)

        val presenter: MainContract.Presenter = MainPresenter(this)
        presenter.onLoadList()
    }

    override fun showList(refeicoes: List<Refeicao>) {

        val adapter = RefeicaoAdapter(this, refeicoes)

//        adapter.setOnItemClickListener { position ->
//            val openBrowser = Intent(Intent.ACTION_VIEW)
//            openBrowser.data = Uri.parse(meals.get(position).url)
//            startActivity(openBrowser)
//        }

        rvRefeicoes.adapter = adapter
        rvRefeicoes.layoutManager = LinearLayoutManager(this)
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }


}





