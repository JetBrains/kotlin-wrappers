package js.buffer

import js.objects.JsPlainObject

@JsPlainObject
external interface SharedArrayBufferOptions {
    val maxByteLength: Int
}
