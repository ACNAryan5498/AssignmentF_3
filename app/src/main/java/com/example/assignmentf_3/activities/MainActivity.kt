package com.example.assignmentf_3.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.assignmentf_3.R
import com.example.assignmentf_3.fragments.BookmarkFragment
import com.example.assignmentf_3.fragments.DateFragment
import com.example.assignmentf_3.fragments.HomeFragment
import com.example.assignmentf_3.fragments.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener(
            object : BottomNavigationView.OnNavigationItemSelectedListener {

                override fun onNavigationItemSelected(item: MenuItem): Boolean {

                    when(item.itemId)
                    {
                        R.id.menu_home -> {
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.flBottomNavigationContainer,HomeFragment())
                                .commit()
                        }

                        R.id.menu_search -> {
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.flBottomNavigationContainer,SearchFragment())
                                .commit()
                        }

                        R.id.menu_date_picker -> {
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.flBottomNavigationContainer,DateFragment())
                                .commit()
                        }

                        R.id.menu_bookmark -> {
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.flBottomNavigationContainer,BookmarkFragment())
                                .commit()
                        }
                    }
                    return false
                }
            }
        )

    }
}
