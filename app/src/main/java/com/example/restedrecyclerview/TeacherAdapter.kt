package com.example.restedrecyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class TeacherAdapter(val teacherData: List<TeacherModel>) :
    RecyclerView.Adapter<TeacherAdapter.TeacherHolder>() {

    class TeacherHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val heading = itemView.findViewById<TextView>(R.id.headingText)
        val subject = itemView.findViewById<TextView>(R.id.subject)
        val address = itemView.findViewById<TextView>(R.id.address)
        val phone = itemView.findViewById<TextView>(R.id.phone)

         val teacherCard = itemView.findViewById<CardView>(R.id.teacherCard)
        val studentListView = itemView.findViewById<RecyclerView>(R.id.studentList)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherHolder {
        val layout =
            LayoutInflater.from(parent.context).inflate(R.layout.teacher_item_list, parent, false)

        return TeacherHolder(layout)
    }

    override fun getItemCount(): Int {
        return teacherData.size
    }

    override fun onBindViewHolder(holder: TeacherHolder, position: Int) {
        holder.heading.text = teacherData[position].name
        holder.subject.text = teacherData[position].subject
        holder.address.text = teacherData[position].address
         if (position%2==0){

            holder.studentListView.adapter = StudentAdapter(teacherData[position].students)
            holder.teacherCard.setCardBackgroundColor(Color.LTGRAY)
        }
        else{
                holder.studentListView.adapter = StudentAdapter1(teacherData[position].students)
               holder.teacherCard.setCardBackgroundColor(Color.BLUE)
//            holder.heading.text = teacherData[position].name
        }
    }

//StudentAdapter

    class StudentAdapter(val studentData: List<StudentModel>) :
        RecyclerView.Adapter<StudentAdapter.StudentHolder>() {
        class StudentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val s_name = itemView.findViewById<TextView>(R.id.name)
            val s_batch = itemView.findViewById<TextView>(R.id.batch)
            val s_address = itemView.findViewById<TextView>(R.id.address)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
            val layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.student_item_list, parent, false)

            return StudentHolder(layout)
        }

        override fun getItemCount(): Int {
            return studentData.size
        }

        override fun onBindViewHolder(holder: StudentHolder, position: Int) {

            holder.s_name.text ="s_Name :- " + studentData[position].s_Name
            holder.s_batch.text = "s_Batch :- " + studentData[position].s_Batch
            holder.s_address.text ="s_Address :- " + studentData[position].s_Address
        }
    }
    //StudentAdapter1

 class StudentAdapter1(val studentData: List<StudentModel>) :
        RecyclerView.Adapter<StudentAdapter1.StudentHolder1>() {
        class StudentHolder1(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val s_name = itemView.findViewById<TextView>(R.id.name)
            val s_batch = itemView.findViewById<TextView>(R.id.batch)
            val s_address = itemView.findViewById<TextView>(R.id.address)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder1 {
            val layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.student_item, parent, false)

            return StudentHolder1(layout)
        }

        override fun getItemCount(): Int {
            return studentData.size
        }

        override fun onBindViewHolder(holder: StudentHolder1, position: Int) {

            holder.s_name.text ="s_Name :- " + studentData[position].s_Name
            holder.s_batch.text ="s_Batch :- " + studentData[position].s_Batch
            holder.s_address.text ="s_Address :- " + studentData[position].s_Address
        }
    }
}
