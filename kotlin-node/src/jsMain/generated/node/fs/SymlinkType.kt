package node.fs


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dir: 'dir', file: 'file', junction: 'junction'}/*union*/)""")
sealed external interface SymlinkType {
    companion object {
        val dir: SymlinkType
        val file: SymlinkType
        val junction: SymlinkType
    }
}
