package com.example.alessandra.themealalessandra.scenariosMain

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.alessandra.themealalessandra.R
import com.example.alessandra.themealalessandra.entities.Refeicao
import com.example.alessandra.themealalessandra.utils.GlideApp
import kotlinx.android.synthetic.main.activity_refeicao.view.*


class RefeicaoAdapter(val context: Context, val refeicoes: List<Refeicao>)
    : RecyclerView.Adapter<RefeicaoAdapter.ViewHolder>() {

    var itemClickListener: ((index: Int) -> Unit)? = null

    fun setOnItemClickListener(clique: ((index: Int) -> Unit)) {
        this.itemClickListener = clique
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_refeicao, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return refeicoes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(context, refeicoes[position], itemClickListener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(context: Context, refeicao: Refeicao, itemClickListener: ((index: Int) -> Unit)?) {
            itemView.refNome.text = refeicao.strMeal
            itemView.refDescricao.text = refeicao.strCategory

            GlideApp.with(context)
                    .load(refeicao.strMealThumb)
                    //.placeholder(xxx)
                    .centerCrop()
                    .into(itemView.imgRefeicao)

            if (itemClickListener != null) {
                itemView.setOnClickListener {
                    itemClickListener.invoke(adapterPosition)
                }
            }
        }

    }
}