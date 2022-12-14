package com.example.lab6_ppm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNav=findViewById(R.id.bottomNav)
        setCurrentFragment(FirstFragment())
        setListeners()
    }

    private fun setListeners(){
        bottomNav.setOnItemSelectedListener(){
            when(it.itemId){
                R.id.menu_option_home -> setCurrentFragment(FirstFragment())
                R.id.menu_option_search -> setCurrentFragment(SecondFragment())
                R.id.menu_option_library -> setCurrentFragment(ThirdFragment())
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragment_main, fragment)
        }
    }
}