/*

package jp.wings.nikkeibp.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import jp.wings.nikkeibp.omikuji.OmikujiBox
import jp.wings.nikkeibp.quiz.databinding.AnsaBinding
import jp.wings.nikkeibp.quiz.databinding.MainBinding
import jp.wings.nikkeibp.quiz.databinding.QuerryaBinding
import jp.wings.nikkeibp.quiz.databinding.QuizBinding
import java.util.Random


class QuizActivity_N : AppCompatActivity() {

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

}

*/