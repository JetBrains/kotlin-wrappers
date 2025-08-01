package js.buffer

import js.objects.JsPlainObject

@JsPlainObject
external interface SharedArrayBufferOptions {
    var maxByteLength: Int
}
