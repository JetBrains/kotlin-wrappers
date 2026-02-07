package jszip

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface JSZipMetadata {
    val percent: Double
    val currentFile: String?
}
