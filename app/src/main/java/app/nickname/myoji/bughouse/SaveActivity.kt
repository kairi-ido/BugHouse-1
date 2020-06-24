package app.nickname.myoji.bughouse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        //sharedPreferenceという名前でインスタンスを生成
        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        //saveButtonを押されたときの処理
        saveButton.setOnClickListener {
            //textに書かれたことを取得(2)
            val text = input.text.toString()


            //文字入力列をSAVEに書き込む
            editor.putString("SAVE", text)
            //追加(3)
            editor.apply()
        }
        //かっこの場所(1)
    }
}
