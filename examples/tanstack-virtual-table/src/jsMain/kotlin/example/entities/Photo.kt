package wrappers.example.entities

external interface Photo {
    var id: Key
    var albumId: Key
    var title: String
    var url: String
    var thumbnailUrl: String
}

typealias Photos = Array<out Photo>
