@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

@JsName("""(/*union*/{ AUTO: 'auto', BOTTOM: 'bottom', TOP: 'top' }/*union*/)""")
sealed external interface MenuPlacement {
    companion object {
        val AUTO: MenuPlacement
        val BOTTOM: MenuPlacement
        val TOP: MenuPlacement
    }
}
