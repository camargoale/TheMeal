package com.example.alessandra.themealalessandra.scenariosMain

import com.example.alessandra.themealalessandra.entities.RefeicaoList
import com.example.alessandra.themealalessandra.network.RetrofitInicializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val view: MainContract.View) : MainContract.Presenter {

    override fun onLoadList() {

        view.showLoading()

        val TheMealService = RetrofitInicializer().createTheMealService()

        val call = TheMealService.getLatest()

        call.enqueue(object : Callback<RefeicaoList> {
            override fun onFailure(call: Call<RefeicaoList>, t: Throwable) {
                view.hideLoading()
                view.showMessage("Falha na conexão. Verifique o acesso a internet")
            }

            override fun onResponse(call: Call<RefeicaoList>, response: Response<RefeicaoList>) {
                view.hideLoading()
                if (response.body() != null) {
                   view.showList(response.body()!!.meals)
                }else{
                    view.showMessage("Nenhuma recente.")
                }
            }
        })


    }
}