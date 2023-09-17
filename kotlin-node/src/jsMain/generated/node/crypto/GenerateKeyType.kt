package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{hmac: 'hmac', aes: 'aes'}/*union*/)""")
sealed external interface GenerateKeyType {
    companion object {
        val hmac: GenerateKeyType
        val aes: GenerateKeyType
    }
}
