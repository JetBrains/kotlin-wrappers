package js.buffer

import js.objects.JsPlainObject

@JsPlainObject
external interface ArrayBufferOptions {
    val maxByteLength: Int
}
