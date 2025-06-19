package vcmsa.ci.jamjuice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.collections.ArrayList

// parallel arrays to store different songs
private val songName = mutableListOf<String>()
private val songArtist = mutableListOf<String>()
private val songRate = mutableListOf<Int>()
private val userComments = mutableListOf<String>()



class Song(
    songName: String,
    songArtist: String,
    songRate: Int,
    userComments: String,){

    // properties
    var name: String = ""
    var artist: String = ""
    var rate: Int = 0
    var comments: String = ""

    init {
        name = songName
        artist = songArtist
        rate = songRate
        comments = userComments
    }
}

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        var song1 = Song("YES IT IS", "Leon Thomas",8, "Feel good" )
        var song2 = Song("Anchor", "Madison Ryann Ward", 9, "Christian RnB")
        var song3 = Song("Role Model", "Brent Faiyaz", 10, "Pump up jam")
        var song4 = Song("Inhale", "Bryson Tiller", 10, "Chill")

        val songName = findViewById<EditText>(R.id.edtSongName)
        val songArtist = findViewById<EditText>(R.id.edtSongArtist)
        val songRate = findViewById<EditText>(R.id.edtRate)
        val userComments = findViewById<TextView>(R.id.txtUserComments)
        val addButton = findViewById<Button>(R.id.btnAdd)
        val moveButton = findViewById<Button>(R.id.btnMove)
        val exitButton = findViewById<Button>(R.id.btnExit)

        addButton.setOnClickListener {
            val name = songName.text.toString()
            val artist = songArtist.text.toString()
            val rate = songRate.text.toString()
            val comments = userComments.text.toString()

            // error
            if (name.isEmpty() || artist.isEmpty() || rate.isEmpty() || comments.isEmpty()){
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (name.isNotEmpty() || artist.isNotEmpty() || rate.isNotEmpty() || comments.isNotEmpty()){
                Toast.makeText(this, "Added!", Toast.LENGTH_SHORT).show()
            }
        }


        moveButton.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            intent.putStringArrayListExtra("song Name", songName)
            intent.putStringArrayListExtra("song Artist", songArtist)
            intent.putStringArrayListExtra("song Rate", songRate)
            intent.putStringArrayListExtra("user Comments", userComments)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finish()
        }





















       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
         //   insets
        }
    }

private fun Intent.putStringArrayListExtra(s: String, userComments: TextView?) {

}

private fun Intent.putStringArrayListExtra(s: String, songName: EditText?) {

}

