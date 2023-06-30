package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ipv4: 'ipv4', ipv6: 'ipv6', unspec: 'unspec'}/*union*/)""")
sealed external interface ResolvedEndpointFamily {
    companion object {
        val ipv4: ResolvedEndpointFamily
        val ipv6: ResolvedEndpointFamily
        val unspec: ResolvedEndpointFamily
    }
}
