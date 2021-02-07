package app.motsu.hiromoto.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people  = arrayOf<String>("お座りスティっち","ピアノスティっち","にっこにこスティっち","若かりしスティっち")
    val food = arrayOf<String>("カレー","シチュー","ビーフストロガノフ","だご汁","味噌汁","おでん")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View?){
        val randomName = Random
        val index = randomName.nextInt(people.size)
        val name = people[index]
        nameTextView.text = name + "に"
        foodTextView.text = food[Random.nextInt(food.size)] + "を"

        if(Random.nextInt(100) < 50){
            verbTextView.text = "よそえました＾＾"
        }else{
            verbTextView.text = "よそえませんでした^^;"
        }

    }
}