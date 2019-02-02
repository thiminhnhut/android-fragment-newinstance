package io.github.thiminhnhut.fragmentnewinstance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.thiminhnhut.fragmentnewinstance.view.FragmentExample

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = FragmentExample.newInstance("example text ", 123)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }
}
