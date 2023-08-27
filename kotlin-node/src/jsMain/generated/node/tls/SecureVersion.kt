package node.tls


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{TLSv13: 'TLSv1.3', TLSv12: 'TLSv1.2', TLSv11: 'TLSv1.1', TLSv1: 'TLSv1'}/*union*/)""")
sealed external interface SecureVersion {
    companion object {
        val TLSv13: SecureVersion
        val TLSv12: SecureVersion
        val TLSv11: SecureVersion
        val TLSv1: SecureVersion
    }
}
