package com.example.restedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studems = ArrayList<StudentModel>()
        val teachers = ArrayList<TeacherModel>()

        studems.add(StudentModel(1,"Vinay kumar","Mahesh chapra","Android"))
        studems.add(StudentModel(2,"Moti kumar","Mahesh chapra","Android And Kotlin"))
        studems.add(StudentModel(3,"Bipul","Tara Amnour","Kotlin"))
        studems.add(StudentModel(4,"Azim","Tara Amnour","Php"))
        studems.add(StudentModel(5,"Naushad EduGaon","Amnour","Csc"))

        teachers.add(TeacherModel(6,"Rahul Raj","Android","9848957435","Patan",studems))
        teachers.add(TeacherModel(7,"Sudhish EduGaon","Kotlin","9012509830","Amnouer",studems))
        teachers.add(TeacherModel(8,"Vijay Sir","Php","8734907812","New Delhi",studems))
        teachers.add(TeacherModel(9,"Ajay Sir EduGaon","Csc","8747297520","Delhi",studems))

        val teacherList = findViewById<RecyclerView>(R.id.teacherList)
        val adapter = TeacherAdapter(teachers)
        teacherList.adapter = adapter
    }
}