package com.vaibhav.gfgkiitapp.chat

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vaibhav.gfgkiitapp.R

class UserAdapter(val context: Context, val userlist: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textname = itemView.findViewById<TextView>(R.id.txt_name)
    }
}