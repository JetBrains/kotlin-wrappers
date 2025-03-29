package jszip

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface JSZipGeneratorOptions<T : JsAny> {
    /**
     * Sets compression option for all entries that have not specified their own `compression` option
     */
    val compression: Compression?

    /**
     * Sets compression level for `DEFLATE` compression.
     */
    val compressionOptions: CompressionOptions?
    val type: OutputType<T>
    val comment: String?

    /**
     * mime-type for the generated file.
     * Useful when you need to generate a file with a different extension, ie: “.ods”.
     * @default 'application/zip'
     */
    val mimeType: String?
    val encodeFileName: ((filename: String) -> String)?

    /** Stream the files and create file descriptors */
    val streamFiles: Boolean?

    /** DOS (default) or UNIX */
    val platform: Platform?
}
