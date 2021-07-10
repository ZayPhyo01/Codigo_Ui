package com.codigo.codigouitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeFragment(MapsFragment.newInstance())
        setupButtonNavigation()
    }

    private fun setupButtonNavigation() {
         navView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.rentACarFragment-> {
                    changeFragment(MapsFragment.newInstance())
                    true
                }
                R.id.searchResult -> {
                    changeFragment(SearchResultFragment.newInstance())
                    true
                }
                R.id.referAFriendFragment -> {
                    changeFragment(FriendReferFragment.newInstance())
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottom_nav, menu)
        setVisible(true)
        return super.onCreateOptionsMenu(menu)
    }

    private fun changeFragment(fg: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.homeContainer, fg).commit()
    }


}

