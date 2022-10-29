package com.romijulianto.wordabjad.adapter

import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.romijulianto.wordabjad.R
import com.romijulianto.wordabjad.activity.WordActivity

class AbjadAdapter :
    RecyclerView.Adapter<AbjadAdapter.AbjadViewHolder>() {

    /* initiate variable */
    private val listAbjad = ('A').rangeTo('Z').toList()

    /* viewHolder to read from id layout xml */
    class AbjadViewHolder( view: View): RecyclerView.ViewHolder( view ) {
        val btnView = view.findViewById<Button>(R.id.abjad_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbjadViewHolder {
        val layoutAbjad = LayoutInflater
            .from( parent.context )
            .inflate( R.layout.adapter_abjad, parent, false)
        layoutAbjad.accessibilityDelegate = Accessibility
        return AbjadViewHolder(layoutAbjad)
    }

    override fun onBindViewHolder(holder: AbjadViewHolder, position: Int) {
        val abjads = listAbjad.get(position)
        holder.btnView.text = abjads.toString()
        holder.btnView.setOnClickListener{
            val context = holder.itemView.context
            val intent = Intent(context, WordActivity::class.java)
            intent.putExtra(WordActivity.ABJAD, holder.btnView.text.toString())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listAbjad.size
    }

    companion object Accessibility : View.AccessibilityDelegate() {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onInitializeAccessibilityNodeInfo(
            host: View,
            info: AccessibilityNodeInfo
        ) {
            super.onInitializeAccessibilityNodeInfo(host, info)
            val customString = host.context?.getString(R.string.search_words)
            val customClick =
                AccessibilityNodeInfo.AccessibilityAction(
                    AccessibilityNodeInfo.ACTION_CLICK,
                    customString
                )
            info.addAction(customClick)
        }
    }
}