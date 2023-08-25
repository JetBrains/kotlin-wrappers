package node.dgram


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{IPv4: 'IPv4', IPv6: 'IPv6'}/*union*/)""")
sealed external interface RemoteInfoFamily {
    companion object {
        val IPv4: RemoteInfoFamily
        val IPv6: RemoteInfoFamily
    }
}
