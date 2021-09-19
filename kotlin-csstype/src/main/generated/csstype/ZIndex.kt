// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""({auto: 'auto'})""")
sealed external interface ZIndex {
    companion object {
        val auto: ZIndex
    }
}

inline fun ZIndex(value: Int): ZIndex =
    value.unsafeCast<ZIndex>()
