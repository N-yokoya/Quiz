package jp.wings.nikkeibp.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import jp.wings.nikkeibp.quiz.databinding.*
import java.util.Random

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: QuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {

            val rnd = Random()
            val number = rnd.nextInt(20)
            if (number == 0) {
                setContentView(R.layout.fortune)
            }

            else if (number < 3) {
                setContentView(R.layout.querrye)
            }

            else if (number < 5) {
                setContentView(R.layout.querryc)
            }

            else if (number < 7) {
                setContentView(R.layout.querryf)
            }

            else if (number < 9) {
                setContentView(R.layout.querryg)
            }

            else if (number < 11) {
                setContentView(R.layout.querryb)
            }

            else if (number < 13) {
                setContentView(R.layout.querryh)
            }

            else if (number < 15) {
                setContentView(R.layout.querrya)
            }

            else if (number < 17) {
                setContentView(R.layout.querryi)
            }

            else if (number < 19) {
                setContentView(R.layout.querryj)
            }

            else {
                setContentView(R.layout.querryd)
            }

            return super.onTouchEvent(event)

        }
        return false
    }

    fun onButtonClick(v: View) {
        val binding: AnsaBinding = AnsaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

