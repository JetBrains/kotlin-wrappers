package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{utf8: 'utf8', utf8: 'utf-8', utf16le: 'utf16le', latin1: 'latin1'}/*union*/)""")
sealed external interface CharacterEncoding {
    companion object {
        val utf8: CharacterEncoding
        val utf16le: CharacterEncoding
        val latin1: CharacterEncoding
    }
}
