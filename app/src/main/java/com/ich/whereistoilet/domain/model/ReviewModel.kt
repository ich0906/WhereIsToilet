package com.ich.whereistoilet.domain.model

data class ReviewModel(
    val key: String = "",
    val userId: String = "",
    val toiletId: Int = 0,
    val title: String = "",
    val content: String = ""
)
