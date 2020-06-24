package app.nickname.myoji.bughouse

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class LoadActivity : AppCompatActivity() {
    //onCreateに変更(1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        //Third→Second(2)
        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
        //save→SAVE(3)+""→NoData
        numberTextView.text = sharedPreferences.getString("SAVE", "NoData")

    }
}
