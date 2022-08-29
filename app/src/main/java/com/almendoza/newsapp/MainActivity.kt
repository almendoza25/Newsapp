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
        "\"https://www.espn.com", "https://www.espn.com", "2022-08-28T18:25:30Z", "EAST RUTHERFORD, N.J. -- New York Giants backup quarterback"),
        Article(null, "Megan C. Hills", "MTV Video Music Awards 2022: Best fashion from the red carpet", "Lizzo, Taylor Swift and Lil Nas X were among the stars to impress on a red carpet",
            "\"https://www.cnn.com", "https://www.cnn.com", "2022-08-29T06:24:34Z", "Megan C. Hills, CNNPhoto editor"),
        Article(null, "Business Daily", "Dow Jones Futures", "The major indexes and leading stocks",
            "\"https://www.investors.com", "https://www.investors.com", "2022-08-29T06:24:34Z", "Dow Jones futures fell solidly Monday morning"),
        Article(null, "Ashley Strickland, CNN", "Launch day arrives for NASA", "Launch day has finally arrived for the uncrewed Artemis",
            "\"https://www.cnn.com", "https://www.cnn.com", "2022-08-29T06:24:34Z", "Turn to CNN for live coverage from Kennedy Space Center")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        listArticles()
    }

    fun listArticles() {
        val articleTexts = binding.articleTexts
        var count = 0
        for (article in articleTexts.children) {
            if (article is TextView) {
                var articleText = ""
                if (articles[count].author != null) {
                    articleText += articles[count].author + " - " + articles[count].title
                }
                article.text = articleText
                count++
            }
        }
    }
}