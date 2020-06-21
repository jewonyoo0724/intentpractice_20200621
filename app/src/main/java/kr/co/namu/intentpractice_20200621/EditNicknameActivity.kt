package kr.co.namu.intentpractice_20200621

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {
            //새화면을 실행 x, 기존 화면으로 복귀 + 입력한 닉네임을 결과로 가지고 복귀

            // 입력한 닉네임?
            val nick = nickNameEdt.text.toString()

            // 돌아갈 때 데이터를 첨부하는 용도의 Intent => 복귀시에는 출발지/ 도착지 명시하지 않음 -> 빈칸으로 놔둠
            val myIntent = Intent()

            // 데이터 첨부? putExtra
            myIntent.putExtra("newNickName", nick)

            // 정말 반영해달라고 결과를 설정. (최종 Ok) + 왕복 티켓 첨부 (이 내부에 newNickName이 들어있다)
            setResult(Activity.RESULT_OK, myIntent)
            finish()
            // 모든 작업이 끝나면 복귀
        }
    }
}