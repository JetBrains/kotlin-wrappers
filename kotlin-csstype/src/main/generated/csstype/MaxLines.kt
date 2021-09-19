// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""({none: 'none'})""")
sealed external interface MaxLines {
    companion object {
        val none: MaxLines
    }
}

inline fun MaxLines(value: Int): MaxLines =
    value.unsafeCast<MaxLines>()
