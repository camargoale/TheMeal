package com.example.alessandra.themealalessandra.scenariosMain

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.ProgressBar
import android.widget.Toast
import com.example.alessandra.themealalessandra.R
import com.example.alessandra.themealalessandra.entities.Refeicao
import com.example.alessandra.themealalessandra.refeicao_detalhada
import kotlinx.android.synthetic.main.activity_lista_refeicoes.*

class ListaRefeicoes : AppCompatActivity(), MainContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_refeicoes)

        val presenter: MainContract.Presenter = MainPresenter(this)
        presenter.onLoadList()
    }

    override fun showList(refeicoes: List<Refeicao>) {

        val adapter = RefeicaoAdapter(this, refeicoes)

        adapter.setOnItemClickListener { position ->
            val detalheRefeicao = Intent(this, refeicao_detalhada::class.java)
            //detalheRefeicao.putExtra("openRefNome", refeicoes[position].strMeal)
            //detalheRefeicao.putExtra("openRefPreparo", refeicoes[position].strInstructions)
            //detalheRefeicao.putExtra("openRefImg", refeicoes[position].strMealThumb)
            startActivity(detalheRefeicao)
        }
        rvRefeicoes.adapter = adapter
        rvRefeicoes.layoutManager = LinearLayoutManager(this)
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        pbLoading.visibility = ProgressBar.VISIBLE
    }

    override fun hideLoading() {
        pbLoading.visibility = ProgressBar.INVISIBLE
    }

}





