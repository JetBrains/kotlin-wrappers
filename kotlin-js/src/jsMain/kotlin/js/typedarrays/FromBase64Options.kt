package js.typedarrays

import js.objects.JsPlainObject

@JsPlainObject
interface FromBase64Options {
    val alphabet: Alphabet?
    val lastChunkHandling: LastChunkHandling?
}
