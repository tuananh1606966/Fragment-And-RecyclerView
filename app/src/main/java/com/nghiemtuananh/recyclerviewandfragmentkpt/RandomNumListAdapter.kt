package com.nghiemtuananh.recyclerviewandfragmentkpt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class RandomNumListAdapter(var seed: Int) :
    RecyclerView.Adapter<RandomNumListAdapter.RandomNumListViewHolder>() {
    private var random: Random

    init {
        random = Random()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomNumListViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.dong_number, parent, false)
        return RandomNumListViewHolder(view)
    }

    override fun onBindViewHolder(holder: RandomNumListViewHolder, position: Int) {
        holder.txtNumber.setText(random.nextInt(seed).toString())
    }

    override fun getItemCount(): Int {
        return 100
    }

    inner class RandomNumListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtNumber: TextView

        init {
            txtNumber = itemView.findViewById(R.id.tv_number)
        }
    }
}