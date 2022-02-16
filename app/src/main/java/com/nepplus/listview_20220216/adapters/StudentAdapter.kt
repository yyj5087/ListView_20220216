package com.nepplus.listview_20220216.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.listview_20220216.datas.studentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<studentData>
) : ArrayAdapter<studentData>(mContext,resId,mList) {
}