package com.example.id.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.id.databinding.ActivityMainBinding
import com.example.id.ui.adapters.TaskAdapter
import com.example.id.ui.models.TaskModel

class MainActivity : AppCompatActivity() {

    var list: ArrayList<TaskModel> = ArrayList()
    var adapter: TaskAdapter = TaskAdapter()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list.add(TaskModel("title1", "description1"))
        list.add(TaskModel("title2", "description2"))
        list.add(TaskModel("title3", "description3"))
        list.add(TaskModel("title4", "description4"))
        list.add(TaskModel("title5", "description5"))
        list.add(TaskModel("title6", "description6"))
        list.add(TaskModel("title7", "description7"))
        list.add(TaskModel("title7", "description8"))
        list.add(TaskModel("title7", "description9"))
        list.add(TaskModel("title7", "description10"))
        adapter.addList(list)
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = adapter


    }

}