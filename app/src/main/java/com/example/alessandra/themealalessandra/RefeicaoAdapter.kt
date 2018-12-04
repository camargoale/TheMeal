package com.example.alessandra.themealalessandra

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_refeicao.view.*

class RefeicaoAdapter(val context: Context, val refeicoes: List<Refeicao>)
    : RecyclerView.Adapter<RefeicaoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_refeicao, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return refeicoes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(context, refeicoes[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(context: Context, refeicao: Refeicao) {
            itemView.refNome.text = refeicao.refNome
            itemView.refDescricao.text = refeicao.refDescricao

            GlideApp.with(context)
                    .load(refeicao.caminhoFoto)
                    //.placeholder(xxx)
                    .centerCrop()
                    .into(itemView.imgRefeicao)

        }

    }
}