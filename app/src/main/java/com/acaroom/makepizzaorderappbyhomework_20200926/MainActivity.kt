package com.acaroom.makepizzaorderappbyhomework_20200926

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acaroom.makepizzaorderappbyhomework_20200926.adapters.mainViewPagerAdater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mAdater : mainViewPagerAdater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        mainTabLayout.setupWithViewPager(mainViewPager)
        mAdater = mainViewPagerAdater(supportFragmentManager)
        mainViewPager.adapter = mAdater
    }
}