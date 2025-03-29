package jszip

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface JSZipGeneratorOptions<T : JsAny> {
    val compression: Compression?
    val compressionOptions: CompressionOptions?
    val type: OutputType<T>
    val comment: String?
    val mimeType: String?
    val streamFiles: Boolean?
}
