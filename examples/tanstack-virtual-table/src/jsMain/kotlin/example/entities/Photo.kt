package wrappers.example.entities

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface Photo {
    val id: Key
    val albumId: Key
    val title: String
    val url: String
    val thumbnailUrl: String
}

typealias PhotoList = ReadonlyArray<Photo>
