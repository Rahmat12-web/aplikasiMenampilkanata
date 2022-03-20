package com.codebug.submissiondicoding

import android.content.Intent
import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.appbar.CollapsingToolbarLayout

class DetailViewsActivity : AppCompatActivity() {

    companion object{
        const val KEY_STORE = "key_store"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_views)
        val dataViews = intent.getParcelableExtra<Views>(KEY_STORE) as Views
        setTitle(dataViews.name)
        findViewById<TextView>(R.id.tv_name_views).text = dataViews.name
        findViewById<TextView>(R.id.tv_name_detail).text = dataViews.detail
        findViewById<ImageView>(R.id.img_items_photo).setImageResource(dataViews.photo)
    }
}