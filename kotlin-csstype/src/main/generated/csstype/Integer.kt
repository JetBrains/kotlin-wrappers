// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface IntegerType :
    ColumnCount,
    FontWeight,
    GridLine,
    LineClamp,
    MathDepth,
    MaxLines,
    Order,
    Orphans,
    Widows,
    ZIndex

inline fun integer(
    value: Int,
): IntegerType =
    value.unsafeCast<IntegerType>()
