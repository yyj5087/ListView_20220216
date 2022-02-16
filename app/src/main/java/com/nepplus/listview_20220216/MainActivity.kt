package com.nepplus.listview_20220216

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.nepplus.listview_20220216.adapters.StudentAdapter
import com.nepplus.listview_20220216.datas.studentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: StudentAdapter
    val mStudentList = ArrayList<studentData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(studentData("조경진", 1988,"서울시 동대문구"))
        mStudentList.add(studentData("고재천", 1988,"서울시 중랑구"))
        mStudentList.add(studentData("방우진", 1983,"경기도 고양시"))
        mStudentList.add(studentData("서정민", 1984,"경기도 광명시"))
        mStudentList.add(studentData("이승민", 1994,"경기도 안양시"))
        mStudentList.add(studentData("이영종", 1991,"경기도 고양시"))
        mStudentList.add(studentData("이윤주", 1989,"서울시 강서구"))
        mStudentList.add(studentData("이진실", 1994,"서울시 동대문구"))
        mStudentList.add(studentData("정동준", 1992,"서울시 동대문구"))
        mStudentList.add(studentData("최재훈", 1994,"서울시 동대문구"))
        mStudentList.add(studentData("이성노", 1988,"서울시 동대문구"))


        mAdapter = StudentAdapter(this,R.layout.student_list_item,mStudentList)
        studentListView.adapter = mAdapter


        studentListView.setOnItemClickListener { adapterView, view, position, l ->
            val clickStudent = mStudentList[position]

            Toast.makeText(this, "${clickStudent.name}학생 클릭됨", Toast.LENGTH_SHORT).show()
        }

    }
}