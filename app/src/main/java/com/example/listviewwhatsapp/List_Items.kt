package com.example.listviewwhatsapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext

class MyListAdapter(private val context: Activity , private val name: Array<String> , private val message: Array<String> , private val imageId:Array<Int>)
    :ArrayAdapter<String>(context,R.layout.activity_list_items,name){
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_list_items,null,true)

        val nameText = rowView.findViewById<TextView>(R.id.tv_name)
        val messageText = rowView.findViewById<TextView>(R.id.tv_message)
        val dpImage = rowView.findViewById<ImageView>(R.id.iv_dp)

        nameText.text = name[position]
        messageText.text = message[position]
        dpImage.setImageResource(imageId[position])

        return rowView
    }
    }
