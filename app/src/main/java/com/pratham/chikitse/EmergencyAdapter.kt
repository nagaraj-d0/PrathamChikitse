package com.pratham.chikitse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmergencyAdapter(
    private val emergencies: List<Emergency>,
    private val onItemClick: (Emergency) -> Unit
) : RecyclerView.Adapter<EmergencyAdapter.EmergencyViewHolder>() {

    inner class EmergencyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.ivEmergencyIcon)
        val nameEn: TextView = itemView.findViewById(R.id.tvEmergencyName)
        val nameKn: TextView = itemView.findViewById(R.id.tvEmergencyNameKn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmergencyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_emergency, parent, false)
        return EmergencyViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmergencyViewHolder, position: Int) {
        val emergency = emergencies[position]
        holder.icon.setImageResource(emergency.iconResId)
        holder.nameEn.text = emergency.nameEn
        holder.nameKn.text = emergency.nameKn
        holder.itemView.setOnClickListener {
            onItemClick(emergency)
        }
    }

    override fun getItemCount() = emergencies.size
}