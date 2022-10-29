package com.romijulianto.wordabjad

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AbjadAdapter(

    private val context: Context,
    private val listAbjad: List<String>

): RecyclerView.Adapter<AbjadAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbjadAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from( parent.context ).inflate( R.layout.adapter_abjad, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AbjadAdapter.ViewHolder, position: Int) {
        val abjads = listAbjad[position]
        holder.btnView.text = abjads
        holder.btnView.setOnClickListener{
             // Log.e("AbjadAdapter", abjads) // for testing to logcat
            Toast.makeText( context, abjads, Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return listAbjad.size
    }

    class ViewHolder( view: View): RecyclerView.ViewHolder( view ) {
        val btnView = view.findViewById<Button>(R.id.abjad_text)
    }

}