package kr.co.namu.intentpractice_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

// SecondActivity로 새화면 추가
// 메인화면에서 "두번째 화면으로 이동" 문구를 가진 버튼 추가
// 누르면 SecondActivity로 이동

// SecondActivity에 닫기 버튼 배치
// 누르면 기존화면으로 복귀


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstActivityBtn.setOnClickListener {
            //      Intent 객체 생성 => 비행기 티켓 발권
            val myIntent = Intent(this, FirstActivity::class.java)
            //           실제 인텐트 사용=> 비행기 탑승 (출발)
            startActivity(myIntent)

        }
        secondActivityBtn.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }

    }
}