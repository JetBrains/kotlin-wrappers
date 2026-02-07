package example.entities

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Photo {
    val id: Key
    val albumId: Key
    val title: String
    val url: String
    val thumbnailUrl: String
}

typealias PhotoList = ReadonlyArray<Photo>
