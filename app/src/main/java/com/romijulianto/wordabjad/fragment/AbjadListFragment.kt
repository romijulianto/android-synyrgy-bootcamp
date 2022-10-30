package com.romijulianto.wordabjad.fragment

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.romijulianto.wordabjad.R
import com.romijulianto.wordabjad.adapter.AbjadAdapter
import com.romijulianto.wordabjad.databinding.FragmentAbjadListBinding

class AbjadListFragment : Fragment() {
    /* initiate bindingAbjad */
    private var _binding: FragmentAbjadListBinding? = null
    private val binding get() = _binding!!

    /* initiate variable recyclerView */
    private lateinit var recyclerView: RecyclerView

    /* to track layout status */
    private var isLinearLayoutManager = true

    /* create function onCreate */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    /* create layout using onCreateView */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAbjadListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    /* create function onViewCreated */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerViewAbjad
        chooseLayout()
    }

    /* create function onDestroyView */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /* create function opntionmenu */
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_item, menu)

        val layoutButton = menu.findItem(R.id.it_switch_menu)
        setIcon(layoutButton)
    }

    /* create function choseLayout and condition */
    private fun chooseLayout() {
        if (isLinearLayoutManager) {
            recyclerView.layoutManager = LinearLayoutManager(context)
        } else {
            recyclerView.layoutManager = GridLayoutManager(context, 2)
        }
        recyclerView.adapter = AbjadAdapter()
    }

    /* cretae function setIcon */
    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null)
            return
        menuItem.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_grid_view)
            else ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_list_view)
    }

    /* create function selectedIcon with boolean */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.it_switch_menu -> {
                isLinearLayoutManager = !isLinearLayoutManager
                chooseLayout()
                setIcon(item)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

