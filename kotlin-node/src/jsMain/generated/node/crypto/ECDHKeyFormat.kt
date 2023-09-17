package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{compressed: 'compressed', uncompressed: 'uncompressed', hybrid: 'hybrid'}/*union*/)""")
sealed external interface ECDHKeyFormat {
    companion object {
        val compressed: ECDHKeyFormat
        val uncompressed: ECDHKeyFormat
        val hybrid: ECDHKeyFormat
    }
}
