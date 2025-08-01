package jszip

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface JSZipGeneratorOptions<T : JsAny> {
    /**
     * Sets compression option for all entries that have not specified their own `compression` option
     */
    var compression: Compression?

    /**
     * Sets compression level for `DEFLATE` compression.
     */
    var compressionOptions: CompressionOptions?
    var type: OutputType<T>
    var comment: String?

    /**
     * mime-type for the generated file.
     * Useful when you need to generate a file with a different extension, ie: “.ods”.
     * @default 'application/zip'
     */
    var mimeType: String?
    var encodeFileName: ((filename: String) -> String)?

    /** Stream the files and create file descriptors */
    var streamFiles: Boolean?

    /** DOS (default) or UNIX */
    var platform: Platform?
}
