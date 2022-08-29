package com.almendoza.newsapp


data class Article(val source: Source? = null, val author: String? = null, val title: String, val description: String,
                   val url: String, val urlToImage: String, val publishedAt: String, val content: String) {
}