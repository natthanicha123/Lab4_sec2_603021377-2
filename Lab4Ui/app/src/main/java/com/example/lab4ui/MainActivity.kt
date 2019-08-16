package com.example.lab4ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.widget.DecorContentParent
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    var subject: String=" "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val subjectSpinner: Spinner = spiner_subject;
        val subjectArray = resources.getStringArray(R.array.subjectName_array)

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,subjectArray)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        subjectSpinner.adapter=arrayAdapter

        subjectSpinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>,view: View,position: Int,id: Long){
                subject = subjectArray[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
            }
        }
}
