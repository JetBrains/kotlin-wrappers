package emotion.cache

external interface SerializedStyles {
    val name: String
    val styles: String
    val map: String?
    val next: SerializedStyles?
}
