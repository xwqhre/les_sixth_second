package com.example.les_sixth_second

import com.example.les_sixth_second.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initUi() {
        super.initUi()
        supportFragmentManager.beginTransaction().add(
           R.id.container, FirstFragment()
        ).commit()
    }
}

