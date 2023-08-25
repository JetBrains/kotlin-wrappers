package node.dgram


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{udp4: 'udp4', udp6: 'udp6'}/*union*/)""")
sealed external interface SocketType {
    companion object {
        val udp4: SocketType
        val udp6: SocketType
    }
}
