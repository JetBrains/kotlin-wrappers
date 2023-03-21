@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.beautiful.dnd

// language=JavaScript
@JsName("""(/*union*/{horizontal: 'horizontal', vertical: 'vertical'}/*union*/)""")
sealed external interface Direction {
    companion object {
        val horizontal: Direction
        val vertical: Direction
    }
}
