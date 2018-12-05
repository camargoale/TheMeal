package com.example.alessandra.themealalessandra.scenariosMain

import com.example.alessandra.themealalessandra.entities.Refeicao

interface MainContract {

    interface View{
        fun showMessage(msg: String)
        fun showList(refeicoes: List<Refeicao>)
        fun showLoading()
        fun hideLoading()

    }

    interface Presenter{
        fun onLoadList()
    }
}