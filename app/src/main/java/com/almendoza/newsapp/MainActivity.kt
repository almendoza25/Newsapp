package com.almendoza.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.children
import com.almendoza.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val articles = arrayListOf(Article(null, "Brittany Shammas",
        "Houston gunman kills three people after setting fires at homes",
        "Police said a newly evicted Houston man set fires at rental units before fatally shooting three people.",
        "https://www.washingtonpost.com",
        "https://www.washingtonpost.com",
        "2022-08-28T20:08:18Z", "Comment about this news" ),
        Article(null, "Jordan Raanan", "New York Giants QB Tyrod Taylor carted to locker room", "Giants backup quarterback Tyrod Taylor suffered a back injury",
        "\"https://www.espn.com", "https://www.espn.com", "2022-08-28T18:25:30Z", "EAST RUTHERFORD, N.J. -- New York Giants backup quarterback")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val articleTexts = binding.articleTexts

        var i = 0
        for (article in articleTexts.children) {
            if (article is TextView) {
                var content = articles[i].author + " - " + articles[i].title
                article.text = content
                i++
            }
        }
    }
}