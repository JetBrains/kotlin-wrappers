package node.childProcess


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{overlapped: 'overlapped', pipe: 'pipe', ignore: 'ignore', inherit: 'inherit'}/*union*/)""")
sealed external interface IOType {
    companion object {
        val overlapped: IOType
        val pipe: IOType
        val ignore: IOType
        val inherit: IOType
    }
}
