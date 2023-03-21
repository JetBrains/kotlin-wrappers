@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.beautiful.dnd

// language=JavaScript
@JsName("""(/*union*/{standard: 'standard', virtual: 'virtual'}/*union*/)""")
sealed external interface DroppableMode {
    companion object {
        val standard: DroppableMode
        val virtual: DroppableMode
    }
}
