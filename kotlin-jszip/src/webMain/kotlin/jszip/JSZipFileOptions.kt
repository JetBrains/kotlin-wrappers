package jszip

import js.date.Date
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface JSZipFileOptions {
    /** Set to `true` if the data is `base64` encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option. */
    var base64: Boolean?

    /**
     * Set to `true` if the data should be treated as raw content, `false` if this is a text. If `base64` is used,
     * this defaults to `true`, if the data is not a `string`, this will be set to `true`.
     */
    var binary: Boolean?

    /**
     * The last modification date, defaults to the current date.
     */
    var date: Date?

    /**
     * Sets per file compression. The `compressionOptions` parameter depends on the compression type.
     */
    var compression: Compression?

    /**
     * Sets per file compression level for `DEFLATE` compression.
     */
    var compressionOptions: CompressionOptions?
    var comment: String?

    /** Set to `true` if (and only if) the input is a "binary string" and has already been prepared with a `0xFF` mask. */
    var optimizedBinaryString: Boolean?

    /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
    var createFolders: Boolean?

    /** Set to `true` if this is a directory and content should be ignored. */
    var dir: Boolean?

    /** 6 bits number. The DOS permissions of the file, if any. */
    var dosPermissions: Int?

    /**
     * 16 bits number. The UNIX permissions of the file, if any.
     * Also accepts a `string` representing the octal value: `"644"`, `"755"`, etc.
     */
    var unixPermissions: Int?
}
