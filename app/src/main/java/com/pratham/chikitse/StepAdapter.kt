package com.pratham.chikitse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StepAdapter(
    private val steps: List<Step>
) : RecyclerView.Adapter<StepAdapter.StepViewHolder>() {

    inner class StepViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvStepNumber: TextView = itemView.findViewById(R.id.tvStepNumber)
        val tvStepEn: TextView = itemView.findViewById(R.id.tvStepEn)
        val tvStepKn: TextView = itemView.findViewById(R.id.tvStepKn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StepViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_step, parent, false)
        return StepViewHolder(view)
    }

    override fun onBindViewHolder(holder: StepViewHolder, position: Int) {
        val step = steps[position]
        holder.tvStepNumber.text = "${step.stepNumber}"
        holder.tvStepEn.text = step.instructionEn
        holder.tvStepKn.text = step.instructionKn
    }

    override fun getItemCount() = steps.size
}