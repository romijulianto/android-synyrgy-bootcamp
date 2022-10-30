package com.romijulianto.wordabjad.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.romijulianto.wordabjad.adapter.WordAdapter
import com.romijulianto.wordabjad.databinding.FragmentWordListBinding


class WordListFragment : Fragment() {

    /* add companion object clean code to use extra abjad in other class */
    companion object {
        const val ABJAD = "abjads"
        const val SEARCH_PREFIX = "https://www.google.com/search?q="
    }

    /* add variable binding */
    private var _binding: FragmentWordListBinding? = null
    private val binding get() = _binding!!

    /* add function onCreateView to inflate Layout */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWordListBinding.inflate(inflater, container, false)
        return binding.root
    }

    /* add function onViewCreated to access intent */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = binding.recyclerViewWord
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = WordAdapter(activity?.intent?.extras?.getString(ABJAD).toString(), requireContext())

        recyclerView.addItemDecoration(
            DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        )
    }

    /* add fun Destroy layout */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
