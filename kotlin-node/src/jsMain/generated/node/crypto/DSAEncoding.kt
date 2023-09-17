package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{der: 'der', ieeeP1363: 'ieee-p1363'}/*union*/)""")
sealed external interface DSAEncoding {
    companion object {
        val der: DSAEncoding
        val ieeeP1363: DSAEncoding
    }
}
