package sk.tasnv.wosy.quetek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listView ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById<ListView>(R.id.list_view)

        val moduleTitles = arrayOf("Rozvrh", "Hodiny", "Chat", "Bugy")

        // Adaptér pre ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, moduleTitles)
        listView.adapter = adapter
    }
}