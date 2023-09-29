package node.fs.symlink


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dir: 'dir', file: 'file', junction: 'junction'}/*union*/)""")
sealed external interface Type {
    companion object {
        val dir: Type
        val file: Type
        val junction: Type
    }
}
