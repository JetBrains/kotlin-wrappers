@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

@JsName("""(/*union*/{ MENU: 'menu', VALUE: 'value' }/*union*/)""")
sealed external interface FormatOptionLabelContext {
    companion object {
        val MENU: FormatOptionLabelContext
        val VALUE: FormatOptionLabelContext
    }
}
