package com.example.lab6_ppm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView


class ThirdFragment : Fragment(R.layout.fragment_third) {
    private var cont: Int = 0
    private lateinit var songs : TextView
    private val song = "Songs"
    private lateinit var msg : String
    private lateinit var add : ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        add = view.findViewById(R.id.add) as ImageView
        songs = view.findViewById(R.id.songs)
        msg = "$cont $song"
        songs.text = msg
        setListeners()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setListeners() {
        add.setOnClickListener(){
            cont++
            msg = "$cont $song"
            songs.text = msg
        }
    }

}