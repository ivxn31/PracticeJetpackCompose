package com.example.compose.ui.antonio_leiva

data class MediaItem(
    val id:Int,
    val title:String,
    val thumb:String,
    val type:TypeMedia
){
    enum class TypeMedia{
        PHOTO,VIDEO
    }
}

fun getMedia() = (1..10).map {
    MediaItem(it,"Title $it","https://picsum.photos/id/$it/200/300",if(it % 3 == 0) MediaItem.TypeMedia.VIDEO else MediaItem.TypeMedia.PHOTO)
}
