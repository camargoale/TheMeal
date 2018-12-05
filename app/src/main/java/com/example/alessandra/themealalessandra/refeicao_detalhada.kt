package com.example.alessandra.themealalessandra

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_refeicao_detalhada.*

class refeicao_detalhada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refeicao_detalhada)

        //val refNome: String? = intent.getStringExtra(openRefNome)
        //val refPreparo: String? = intent.getStringExtra(openRefPreparo)
        //val refImg: String? = intent.getStringExtra(openRefImg)

        //refNomeDet.setText(refNome)
        //refModoDePreparo.setText(refPreparo)
        //

        //GlideApp.with(this)
               // .load(refImg)
               // .centerCrop()
                //.into(imgRefeicaoDet)
    }
}
