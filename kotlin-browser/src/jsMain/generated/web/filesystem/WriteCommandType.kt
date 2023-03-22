// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.filesystem

// language=JavaScript
@JsName("""(/*union*/{seek: 'seek', truncate: 'truncate', write: 'write'}/*union*/)""")
sealed external interface WriteCommandType {
    companion object {
        val seek: WriteCommandType
        val truncate: WriteCommandType
        val write: WriteCommandType
    }
}
