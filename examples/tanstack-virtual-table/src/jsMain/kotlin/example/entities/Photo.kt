package wrappers.example.entities

import js.array.ReadonlyArray

external interface Photo {
    var id: Key
    var albumId: Key
    var title: String
    var url: String
    var thumbnailUrl: String
}

typealias PhotoList = ReadonlyArray<Photo>
