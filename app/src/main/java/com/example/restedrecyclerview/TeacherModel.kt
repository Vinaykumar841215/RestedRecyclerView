package com.example.restedrecyclerview

data class TeacherModel(
    val id:Int ?= null,
    val name: String?=null,
    val subject: String?=null,
    val phone:String?=null,
    val address:String?=null,
    val students : List<StudentModel>,
)
data class StudentModel(
    val s_id: Int?= null,
    val s_Name: String?= null,
    val s_Address: String?= null,
    val s_Batch: String?= null
)
