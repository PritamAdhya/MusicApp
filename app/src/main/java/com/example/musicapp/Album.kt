package com.example.musicapp

data class Album(
    var cover: String,
    var cover_big: String,
    var cover_medium: String,
    var cover_small: String,
    var cover_xl: String,
    var id: Int,
    var md5_image: String,
    var title: String,
    var tracklist: String,
    var type: String
)