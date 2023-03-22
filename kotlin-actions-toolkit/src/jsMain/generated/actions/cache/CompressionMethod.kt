// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.cache

// language=JavaScript
@JsName("""(/*union*/{Gzip: 'gzip', ZstdWithoutLong: 'zstd-without-long', Zstd: 'zstd'}/*union*/)""")
sealed external interface CompressionMethod {
    companion object {
        val Gzip: CompressionMethod
        val ZstdWithoutLong: CompressionMethod
        val Zstd: CompressionMethod
    }
}
