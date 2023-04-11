@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

// language=JavaScript
@JsName("""(/*union*/{absolute: 'absolute', fixed: 'fixed'}/*union*/)""")
sealed external interface MenuPosition {
    companion object {
        val absolute: MenuPosition
        val fixed: MenuPosition
    }
}
