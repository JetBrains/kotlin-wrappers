@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.beautiful.dnd

// language=JavaScript
@JsName("""(/*union*/{DROP: 'DROP', CANCEL: 'CANCEL'}/*union*/)""")
sealed external interface DropReason {
    companion object {
        val DROP: DropReason
        val CANCEL: DropReason
    }
}
