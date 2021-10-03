// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""(/*union*/{normal: 'normal', reset: 'reset'}/*union*/)""")
sealed external interface Zoom {
    companion object {
        val normal: Zoom
        val reset: Zoom
    }
}

inline fun Zoom(value: Double): Zoom =
    value.unsafeCast<Zoom>()
