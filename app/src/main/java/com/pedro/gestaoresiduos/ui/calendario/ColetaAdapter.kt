package com.pedro.gestaoresiduos.ui.calendario

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pedro.gestaoresiduos.data.model.Coleta
import com.pedro.gestaoresiduos.databinding.ItemColetaBinding

class ColetaAdapter : RecyclerView.Adapter<ColetaAdapter.VH>() {
    private val itens = mutableListOf<Coleta>()

    class VH(val b: ItemColetaBinding) : RecyclerView.ViewHolder(b.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemColetaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }
    override fun onBindViewHolder(holder: VH, position: Int) {
        val c = itens[position]
        holder.b.tvTitulo.text = "${c.dia} – ${c.tipo}"
        holder.b.tvDescricao.text = c.bairro
    }
    override fun getItemCount() = itens.size

    fun submit(novos: List<Coleta>) {
        itens.clear(); itens.addAll(novos); notifyDataSetChanged()
    }
}
