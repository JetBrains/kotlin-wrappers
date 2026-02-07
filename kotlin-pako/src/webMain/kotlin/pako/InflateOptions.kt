package pako

import kotlinx.js.JsPlainObject

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
