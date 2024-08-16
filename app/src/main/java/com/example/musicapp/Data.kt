package com.example.musicapp

data class Data(
    var album: Album,
    var artist: Artist,
    var duration: Int,
    var explicit_content_cover: Int,
    var explicit_content_lyrics: Int,
    var explicit_lyrics: Boolean,
    var id: Long,
    var link: String,
    var md5_image: String,
    var preview: String,
    var rank: Int,
    var readable: Boolean,
    var title: String,
    var title_short: String,
    var title_version: String,
    var type: String
)