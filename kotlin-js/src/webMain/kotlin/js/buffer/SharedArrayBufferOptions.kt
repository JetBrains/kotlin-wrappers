package js.buffer

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SharedArrayBufferOptions {
    var maxByteLength: Int
}
