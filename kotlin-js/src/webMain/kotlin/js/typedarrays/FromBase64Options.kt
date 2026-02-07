package js.typedarrays

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface FromBase64Options {
    var alphabet: Alphabet?
    var lastChunkHandling: LastChunkHandling?
}
