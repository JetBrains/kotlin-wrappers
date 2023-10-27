package node.childProcess


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{pipe: 'pipe', overlapped: 'overlapped'}/*union*/)""")
sealed external interface StdioPipeNamed {
    companion object {
        val pipe: StdioPipeNamed
        val overlapped: StdioPipeNamed
    }
}
