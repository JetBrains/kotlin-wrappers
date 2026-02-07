package js.typedarrays

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ToBase64Options {
    var alphabet: Alphabet?
    var omitPadding: Boolean?
}
