package pako

import js.objects.JsPlainObject

@JsPlainObject
external interface InflateOptions {
    var windowBits: Int?
    var raw: Boolean?
}

@JsPlainObject
external interface InflateToStringOptions :
    InflateOptions {
    var to: To
}
