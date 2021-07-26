package com.example.id.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.id.databinding.ItemTaskBinding
import com.example.id.ui.models.TaskModel

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
    private var list: ArrayList<TaskModel> = ArrayList()

    private lateinit var binding: ItemTaskBinding

    fun addList(getList: ArrayList<TaskModel>){
        list = getList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class TaskViewHolder(private val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(taskModel: TaskModel) {
            binding.itemTitle.text = taskModel.title
            binding.description.text = taskModel.description
        }

    }
}