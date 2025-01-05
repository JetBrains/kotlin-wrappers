package js.typedarrays

import js.objects.JsPlainObject

@JsPlainObject
external interface FromBase64Options {
    val alphabet: Alphabet?
    val lastChunkHandling: LastChunkHandling?
}
