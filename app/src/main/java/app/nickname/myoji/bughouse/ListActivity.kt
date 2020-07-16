package app.nickname.myoji.bughouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val taskList: List<Task> = listOf(
        Task("Task 1"),
        Task("Task 2"),
        Task("Task 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = TaskAdapter(this, object: TaskAdapter.ItemClickListener{
            override fun onItemClick(item:Task) {
                val intent = Intent(this@ListActivity, DetailActivity::class.java)
                intent.putExtra("TASK_NAME", item.name)
                startActivity(intent)
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(this)
        //追加
        recyclerView.adapter = adapter
        adapter.addAll(taskList)

        addButton.setOnClickListener {
            val name = editText.text.toString()
            adapter.add(Task(name))
        }
    }

}