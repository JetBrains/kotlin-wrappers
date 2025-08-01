package js.typedarrays

import js.objects.JsPlainObject

@JsPlainObject
external interface FromBase64Options {
    var alphabet: Alphabet?
    var lastChunkHandling: LastChunkHandling?
}
