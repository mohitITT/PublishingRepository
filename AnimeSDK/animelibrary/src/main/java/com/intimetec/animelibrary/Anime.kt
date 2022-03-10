package com.intimetec.animelibrary

class Anime {
    private val animeDB = arrayListOf<String>(
        "Naruto",
        "Dragon Ball Z",
        "Jujutsu Kaisen",
        "Beyblade",
        "Gintama",
        "Attack On Titan",
        "One Piece"
    )

    public fun generateAnime(): String = animeDB.random()
}