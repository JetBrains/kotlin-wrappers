// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface IntegerType :
    ColumnCount,
    FontWeight,
    GridLine,
    HyphenateLimitChars,
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
    unsafeCast(value)
