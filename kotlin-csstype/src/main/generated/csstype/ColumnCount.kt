// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""({auto: 'auto'})""")
sealed external interface ColumnCount {
    companion object {
        val auto: ColumnCount
    }
}

inline fun ColumnCount(value: Int): ColumnCount =
    value.unsafeCast<ColumnCount>()
