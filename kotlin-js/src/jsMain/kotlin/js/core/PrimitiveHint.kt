@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.core

// language=JavaScript
@JsName("""(/*union*/{number: 'number', string: 'string', default: 'default'}/*union*/)""")
sealed external interface PrimitiveHint {
    companion object {
        val number: PrimitiveHint
        val string: PrimitiveHint
        val default: PrimitiveHint
    }
}
