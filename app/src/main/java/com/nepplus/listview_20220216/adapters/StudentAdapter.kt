package com.nepplus.listview_20220216.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.listview_20220216.R
import com.nepplus.listview_20220216.datas.studentData

class StudentAdapter(
    val mContext: Context, //어느 화면에 사용
    val resId: Int,  //어떤 모양
    val mList: ArrayList<studentData> //어떤 목록에 뿌려줄건가
) : ArrayAdapter<studentData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//   position -> 몇번째 그릴지 convertView -> 재사용에 활용할 View를 담아두는 변수

        var tempRow = convertView
        //temp : 임시
        if(tempRow == null){
            tempRow =  LayoutInflater.from(mContext).inflate(R.layout.student_list_item,null)
            //모자르면 또 그려줘라 (용량 많이 잡는 inflate)
        }
        val row = tempRow!!

        val data = mList[position]

        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)
        txtName.text = data.name
        txtAddress.text = data.address

        val age = 2022 - data.birthYear + 1
        txtAge.text = "(${age}세)"



        return row
    }
}