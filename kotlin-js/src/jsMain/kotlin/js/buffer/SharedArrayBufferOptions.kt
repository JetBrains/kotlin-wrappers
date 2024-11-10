package js.buffer

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SharedArrayBufferOptions {
    val maxByteLength: Int
}
