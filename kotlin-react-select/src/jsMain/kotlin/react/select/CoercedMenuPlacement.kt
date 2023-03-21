@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

@JsName("""(/*union*/{ BOTTOM: 'bottom', TOP: 'top' }/*union*/)""")
sealed external interface CoercedMenuPlacement {
    companion object {
        val BOTTOM: CoercedMenuPlacement
        val TOP: CoercedMenuPlacement
    }
}
