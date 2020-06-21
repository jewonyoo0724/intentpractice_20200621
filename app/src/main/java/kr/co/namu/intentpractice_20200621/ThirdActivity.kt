package kr.co.namu.intentpractice_20200621

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // 들어올떄 message 라는 이름이 적힌 String이 있는지 확인 -> 결과를 변수에 저장
        val receivedMessage = intent.getStringExtra("message")

        messageTxt.text = receivedMessage
    }
}