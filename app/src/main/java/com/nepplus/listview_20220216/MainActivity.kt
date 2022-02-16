package com.nepplus.listview_20220216

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.listview_20220216.datas.studentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<studentData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(studentData("조경진", 1988,"서울시 동대문구"))
        mStudentList.add(studentData("고재천", 1988,"서울시 중랑구"))
        mStudentList.add(studentData("방우진", 1983,"경기도 고양시"))
        mStudentList.add(studentData("서정민", 1984,"서울시 동대문구"))
        mStudentList.add(studentData("이승민", 1994,"서울시 동대문구"))
        mStudentList.add(studentData("이영종", 1991,"서울시 동대문구"))
        mStudentList.add(studentData("이윤주", 1989,"서울시 동대문구"))
        mStudentList.add(studentData("이진실", 1994,"서울시 동대문구"))
        mStudentList.add(studentData("정동준", 1988,"서울시 동대문구"))
        mStudentList.add(studentData("최재훈", 1988,"서울시 동대문구"))
        mStudentList.add(studentData("이성노", 1988,"서울시 동대문구"))

    }
}