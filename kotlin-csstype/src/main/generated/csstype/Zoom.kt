// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""({normal: 'normal', reset: 'reset'})""")
sealed external interface Zoom {
    companion object {
        val normal: Zoom
        val reset: Zoom
    }
}

inline fun Zoom(value: Double): Zoom =
    value.unsafeCast<Zoom>()
