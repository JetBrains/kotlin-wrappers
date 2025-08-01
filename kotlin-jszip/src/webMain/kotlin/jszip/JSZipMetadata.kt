package jszip

import js.objects.JsPlainObject

@JsPlainObject
external interface JSZipMetadata {
    val percent: Double
    val currentFile: String?
}
