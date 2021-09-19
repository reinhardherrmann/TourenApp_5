package de.orome.tourenapp5.ui.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.orome.tourenapp5.R

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StartFragment.newInstance())
                .commitNow()
        }
    }
}