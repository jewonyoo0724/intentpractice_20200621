package kr.co.namu.intentpractice_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstActivityBtn.setOnClickListener {
  //      intent
        val myIntent = Intent(this,FirstActivity::class.java)
            startActivity(myIntent)
        }



    }
}