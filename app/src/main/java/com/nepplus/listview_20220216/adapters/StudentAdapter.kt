package com.nepplus.listview_20220216.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.listview_20220216.R
import com.nepplus.listview_20220216.datas.studentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<studentData>
) : ArrayAdapter<studentData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null){
            tempRow =  LayoutInflater.from(mContext).inflate(R.layout.student_list_item,null)
        }
        val row = tempRow!!

        return row
    }
}