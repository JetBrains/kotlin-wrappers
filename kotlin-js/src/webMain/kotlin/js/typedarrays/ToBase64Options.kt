package js.typedarrays

import js.objects.JsPlainObject

@JsPlainObject
external interface ToBase64Options {
    var alphabet: Alphabet?
    var omitPadding: Boolean?
}
