package com.nepplus.listview_20220216.datas

class studentData(
    val name: String,
    //멤버 변수임
    val birthYear: Int,
    val address: String,
    )
    {
    fun getKoreanAge(year: Int,): Int{
       val koreanAge = year - this.birthYear + 1
       return koreanAge
    }

    }