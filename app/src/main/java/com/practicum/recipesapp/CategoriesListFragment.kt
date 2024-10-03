package com.practicum.recipesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CategoriesListFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(): CategoriesListFragment {
            return CategoriesListFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categories_list, container, false)
    }
}