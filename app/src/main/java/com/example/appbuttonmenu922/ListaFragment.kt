package com.example.appbuttonmenu922

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ListaFragment : Fragment() {
    private lateinit var listView: ListView
    private lateinit var arrayList: ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_lista, container, false)

        listView = view.findViewById(R.id.lstAlumnos)

        val items = resources.getStringArray(R.array.alumnos)

        arrayList = ArrayList()
        arrayList.addAll(items)

        adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, arrayList)

        listView.adapter = adapter

        return view
    }
}
