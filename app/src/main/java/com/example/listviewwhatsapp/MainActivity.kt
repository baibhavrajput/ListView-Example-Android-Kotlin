package com.example.listviewwhatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_items.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf<String>(
            "Rahul","Rohit","Baibhav","Aman","Ankit","Anshu","Anand","Sajal","Rajat","Abhi","Rohan"
        )

        val imageId = arrayOf<Int>(
            R.drawable.img_1300031901,R.drawable.img_1300031902,R.drawable.img_1300031903,R.drawable.img_1300031904,
            R.drawable.img_1300031905,R.drawable.img_1300031906,R.drawable.img_1300031907,R.drawable.img_1300031908,
            R.drawable.img_1300031909,R.drawable.img_13000319010,R.drawable.img_13000319011
        )

        val message = arrayOf<String>(
            "Hey, how are you ??","Hey, how are you ??","Hey, how are you ??","Hey, how are you ??","Hey, how are you ??",
            "Hey, how are you ??","Hey, how are you ??","Hey, how are you ??","Hey, how are you ??","Hey, how are you ??",
            "Hey, how are you ??"
        )

        val myListAdapter = MyListAdapter(
            this,
            name,
            message,
            imageId
        )

        listView.adapter = myListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"text: ${view.tv_message.text} by ${view.tv_name.text}", Toast.LENGTH_LONG).show()
        }

    }
}