package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{latin1: 'latin1', hex: 'hex', base64: 'base64', base64url: 'base64url'}/*union*/)""")
sealed external interface ECDHConvertKeyOutputEncoding {
    companion object {
        val latin1: ECDHConvertKeyOutputEncoding
        val hex: ECDHConvertKeyOutputEncoding
        val base64: ECDHConvertKeyOutputEncoding
        val base64url: ECDHConvertKeyOutputEncoding
    }
}
