package com.example.alessandra.themealalessandra.scenariosMain

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.alessandra.themealalessandra.entities.Refeicao
import kotlinx.android.synthetic.main.activity_lista_refeicoes.*

class MainActivity : AppCompatActivity(), MainContract.View {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun showList(refeicoes: List<Refeicao>) {
        val adapter = RefeicaoAdapter(this, refeicoes)
        adapter.setOnItemClickListener { position ->
            val openBrowser = Intent(Intent.ACTION_VIEW)
            //openBrowser.data = Uri.parse(meals.get(position).url)
            startActivity(openBrowser)
        }

        rvRefeicoes.adapter = adapter
        rvRefeicoes.layoutManager = LinearLayoutManager(this)
    }
}
