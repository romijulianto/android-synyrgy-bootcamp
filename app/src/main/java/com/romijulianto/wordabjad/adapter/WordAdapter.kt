package com.romijulianto.wordabjad.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.romijulianto.wordabjad.R
import com.romijulianto.wordabjad.fragment.WordListFragment

class WordAdapter(private val abjadId: String, context: Context) :
    RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    private val filteredWords: List<String>

    /* initiate value default */
    init {
        val words = context.resources.getStringArray(R.array.words).toList()
        filteredWords = words
            .filter { it.startsWith(abjadId, ignoreCase = true) }
            .shuffled()
            .take(10)
            .sorted()
    }

    /* create ViewHolder Custom */
    class WordViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val btnView = view.findViewById<Button>(R.id.button_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val layoutWords = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.button_view, parent, false)

        layoutWords.accessibilityDelegate = Accessibility

        return WordViewHolder(layoutWords)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val words = filteredWords[position]
        val context = holder.view.context
        holder.btnView.text = words
        holder.btnView.setOnClickListener {
            val queryUrl: Uri = Uri.parse("${WordListFragment.SEARCH_PREFIX}${words}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return filteredWords.size
    }

    /* set companion object with check accesibility service */
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