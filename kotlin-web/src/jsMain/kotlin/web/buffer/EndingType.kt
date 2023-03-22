@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.buffer

// language=JavaScript
@JsName("""(/*union*/{native: 'native', transparent: 'transparent'}/*union*/)""")
sealed external interface EndingType {
    companion object {
        val native: EndingType
        val transparent: EndingType
    }
}
