package jp.wings.nikkeibp.quiz

import android.content.Context
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import jp.wings.nikkeibp.omikuji.OmikujiBox
import jp.wings.nikkeibp.quiz.databinding.*
import java.util.Random

class QuizActivity : AppCompatActivity() {

    // おみくじ棚の配列
    val omikujiShelf = Array<OmikujiParts>(20)
    { OmikujiParts(R.drawable.result2, R.string.contents1) }

    // おみくじ番号保管用
    var omikujiNumber = -1

    val omikujiBox = OmikujiBox()

    lateinit var binding: QuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rnd = Random()
        val number = rnd.nextInt(3)
        if (number == 0) {
            fun onButtonClick(v: View) {
                var binding: QuerryaBinding = QuerryaBinding.inflate(layoutInflater)
                setContentView(binding.root)
            }
        }
        else {
            //val str = "a"
            binding.imageView.setImageResource(R.drawable.omikuji2)
        }

/*
        // おみくじ棚の配列
        val omikujiShelf = Array<OmikujiParts>(20)
            { OmikujiParts(R.drawable.result2, R.string.contents1) }

        // おみくじ番号保管用
        var omikujiNumber = -1

        val omikujiBox = OmikujiBox()
*/
        //lateinit var binding: OmikujiBinding
        //override fun onCreate(savedInstanceState: Bundle?) {
        //    super.onCreate(savedInstanceState)
        //    binding = OmikujiBinding.inflate(layoutInflater)
        //    setContentView(binding.root)

/*
            manager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

            val pref = PreferenceManager.getDefaultSharedPreferences(this)
            val value = pref.getBoolean("button", false)

            binding.button.visibility = if (value) View.VISIBLE else View.INVISIBLE
*/


        omikujiBox.omikujiView = binding.imageView
        omikujiBox.omikujiButton = binding.button

        //　おみくじ棚の準備
        omikujiShelf[0].drawID = R.drawable.result1
        omikujiShelf[0].fortuneID = R.string.contents2

        omikujiShelf[1].drawID = R.drawable.result3
        omikujiShelf[1].fortuneID = R.string.contents9

        omikujiShelf[2].fortuneID = R.string.contents3
        omikujiShelf[3].fortuneID = R.string.contents4
        omikujiShelf[4].fortuneID = R.string.contents5
        omikujiShelf[5].fortuneID = R.string.contents6

    }

    // val omikujiBox = OmikujiBox()

    fun onButtonClick(v: View) {
        var binding: QuerryaBinding = QuerryaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //fun onbuttonclick(){}

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN){
            val binding1 = AnsaBinding.inflate(layoutInflater)
            setContentView(binding1.root)
        }
        return super.onTouchEvent(event)

    }

    fun drawResult() {
        // おみくじ番号を取得する
        val rnd = Random()
        val number = rnd.nextInt(20)
        var omikujiNumber = number

        // おみくじ棚の配列から、omikujiPartsを取得する
        val op = omikujiShelf[omikujiNumber]


        val fortuneBinding = FortuneBinding.inflate(layoutInflater)
        setContentView(fortuneBinding.root)

        // 画像とテキストを変更する
        fortuneBinding.imageView2.setImageResource(op.drawID)
        fortuneBinding.textView.setText(op.fortuneID)
    }

}