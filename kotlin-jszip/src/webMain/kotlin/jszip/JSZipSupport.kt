package jszip

import js.objects.JsPlainObject

@JsPlainObject
external interface JSZipSupport {
    val arraybuffer: Boolean
    val uint8array: Boolean
    val blob: Boolean
    val nodebuffer: Boolean
}
