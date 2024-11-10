package js.buffer

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ArrayBufferOptions {
    val maxByteLength: Int
}
