// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.compression

// language=JavaScript
@JsName("""(/*union*/{deflate: 'deflate', deflateRaw: 'deflate-raw', gzip: 'gzip'}/*union*/)""")
sealed external interface CompressionFormat {
    companion object {
        val deflate: CompressionFormat
        val deflateRaw: CompressionFormat
        val gzip: CompressionFormat
    }
}
