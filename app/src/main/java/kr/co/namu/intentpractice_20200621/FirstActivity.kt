package kr.co.namu.intentpractice_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        closeBtn.setOnClickListener {

//          메인화면으로 돌아가기 => 새화면 호출 x, 지금 화면 종료

 //          val myIntent = Intent(this, MainActivity::class.java)
  //          startActivity(myIntent)

            finish()
        }

    }
}