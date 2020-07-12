package app.nickname.myoji.bughouse

import android.app.Activity
import android.app.Activity.RESULT_CANCELED
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.net.Uri
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import kotlinx.android.synthetic.main.activity_image_view.*

class ImageViewActivity : AppCompatActivity() {
    //persistentState: PersistableBundle?消した???
    override fun onCreate(savedInstanceState: Bundle? ) {
        //persistentState???
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

       //読み込むよ
        imageView.load("https://life-is-tech.com/materials/images/summer2019_desktop_3.jpg")

        //ボタンを押したらギャラリーに行く
        getImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.type = "image/*"
            startActivityForResult(intent, 100)

        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //RESULT_CANCELEDからRESULT_OKに変えた
        if (requestCode == 100 && resultCode == Activity.RESULT_OK) {
            imageView.load(data?.data)
        }
    }
}
