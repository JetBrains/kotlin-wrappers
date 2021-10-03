// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""(/*union*/{none: 'none'}/*union*/)""")
sealed external interface Scale {
    companion object {
        val none: Scale
    }
}

inline fun Scale(value: Double): Scale =
    value.unsafeCast<Scale>()
