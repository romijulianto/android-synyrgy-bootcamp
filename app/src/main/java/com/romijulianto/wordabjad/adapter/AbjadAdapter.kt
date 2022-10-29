package com.romijulianto.wordabjad.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.romijulianto.wordabjad.R

class AbjadAdapter(

    /* initiate variable */
    private val listAbjad: List<String>,
    private val listener: OnAdapterListener,

    ): RecyclerView.Adapter<AbjadAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from( parent.context ).inflate( R.layout.adapter_abjad, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val abjads = listAbjad[position]
        holder.btnView.text = abjads
        holder.btnView.setOnClickListener{
            listener.onClick( abjads )
        }

    }

    override fun getItemCount(): Int {
        return listAbjad.size
    }

    /* viewHolder to read from id layout xml */
    class ViewHolder( view: View): RecyclerView.ViewHolder( view ) {
        val btnView = view.findViewById<Button>(R.id.abjad_text)
    }

    /* create interface to set OnClick */
    interface OnAdapterListener {
        fun onClick( abjads: String )
    }

}