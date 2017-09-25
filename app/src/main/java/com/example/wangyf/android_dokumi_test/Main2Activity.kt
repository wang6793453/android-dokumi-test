package com.example.wangyf.android_dokumi_test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editor = PreferenceManager.getDefaultSharedPreferences(this).edit()
        editor.commit()

    }
}
