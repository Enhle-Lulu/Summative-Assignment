package vcmsa.ci.jamjuice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

private var index = 0



class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val songName = intent.getStringArrayListExtra("Song Name")
        val songArtist = intent.getStringArrayListExtra("Song Artist")
        val songRate = intent.getStringArrayListExtra("Song Rate")
        val userComments = intent.getStringArrayListExtra("user Comments")

        val songList = findViewById<TextView>(R.id.txtSongList)
        val display = findViewById<Button>(R.id.btnDisplay)
        val calculate = findViewById<Button>(R.id.btnCalculate)
        val btnReturn = findViewById<Button>(R.id.btnReturn)

        val displayList = mutableListOf<String>()

        calculate.setOnClickListener {
            for (i in songName?.indices!!){
                var i = 1
                if (songRate >= 2) {
                    val songDetail = "${songName?.get(i)} - ${songArtist?.get(i)} (x ${songRate?.get(i)}) : ${userComments?.get(i)}"
                }
            }
        }

        btnReturn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }























































        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

private operator fun <E> ArrayList<E>?.compareTo(i: Int): Int {

    return TODO("Provide the return value")
}
