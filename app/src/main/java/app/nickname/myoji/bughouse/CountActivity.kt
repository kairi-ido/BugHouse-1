package app.nickname.myoji.bughouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class CountActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)
        //vel→ver
        var number: Int = 0
        //Idをかえて最初の数字を設定
        numberTextView.text = "0"

        //idを変えた
        plusBotton.setOnClickListener {
            //number=に設定
            number = number + 1
            //string型にするよ
            numberTextView.text = number.toString()
        }

        //{かっこ}の数も合わせるよ
    }
}


