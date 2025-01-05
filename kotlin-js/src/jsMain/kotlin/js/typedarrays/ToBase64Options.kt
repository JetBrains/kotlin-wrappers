package js.typedarrays

import js.objects.JsPlainObject

@JsPlainObject
external interface ToBase64Options {
    val alphabet: Alphabet?
    val omitPadding: Boolean?
}
