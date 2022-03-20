package com.codebug.submissiondicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvViews: RecyclerView
    private var list: ArrayList<Views> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvViews = findViewById(R.id.rv_views)
        rvViews.setHasFixedSize(true)

        list.addAll(ViewsData.listData)
        showRecyclerList()
        title = "Tempat Wisata Pemandangan"
    }

    private fun showAbout(){
        val intent = Intent(this@MainActivity,AboutActivity::class.java)
        startActivity(intent)
    }

    private fun showRecyclerList(){
        rvViews.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListViewsAdapter(list)
        rvViews.adapter = listHeroAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showAbout()
            }
        }
    }
}