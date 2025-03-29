package jszip

import js.objects.JsPlainObject

@JsPlainObject
external interface JSZipFileOptions {
    val compression: Compression?
}
