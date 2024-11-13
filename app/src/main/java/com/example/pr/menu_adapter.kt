package com.example.pr

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnCreateContextMenuListener
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent

class menu_adapter (val men: ArrayList<String>):RecyclerView.Adapter<menu_adapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_menu,
           parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount()=men.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.itemmenu.text=men.get(position)
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemmenu: TextView=itemView.findViewById(R.id.itemmenu)
    }
}