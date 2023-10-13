package node.buffer


// Buffer class

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ascii: 'ascii', utf8: 'utf8', utf16le: 'utf16le', ucs2: 'ucs2', base64: 'base64', base64url: 'base64url', latin1: 'latin1', binary: 'binary', hex: 'hex'}/*union*/)""")
sealed external interface BufferEncoding {
    companion object {
        val ascii: BufferEncoding
        val utf8: BufferEncoding
        val utf16le: BufferEncoding
        val ucs2: BufferEncoding
        val base64: BufferEncoding
        val base64url: BufferEncoding
        val latin1: BufferEncoding
        val binary: BufferEncoding
        val hex: BufferEncoding
        /*
        Duplicated names were generated:
        utf8 for "utf-8"
        ucs2 for "ucs-2"
        */

    }
}
