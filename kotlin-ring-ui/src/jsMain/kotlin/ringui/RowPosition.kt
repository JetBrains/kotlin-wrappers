@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ringui

@JsName("null")
sealed external interface RowPosition {
    companion object
}

inline val RowPosition.Companion.xs: RowPosition
    get() = "xs".unsafeCast<RowPosition>()

inline val RowPosition.Companion.sm: RowPosition
    get() = "sm".unsafeCast<RowPosition>()

inline val RowPosition.Companion.md: RowPosition
    get() = "md".unsafeCast<RowPosition>()

inline val RowPosition.Companion.lg: RowPosition
    get() = "lg".unsafeCast<RowPosition>()
