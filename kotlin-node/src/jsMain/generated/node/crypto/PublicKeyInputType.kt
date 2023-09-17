package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{pkcs1: 'pkcs1', spki: 'spki'}/*union*/)""")
sealed external interface PublicKeyInputType {
    companion object {
        val pkcs1: PublicKeyInputType
        val spki: PublicKeyInputType
    }
}
