// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface IntegerType :
    ColumnCount,
    FlexLineCount,
    FontWeight,
    GlyphOrientationVertical,
    GridLine,
    HyphenateLimitChars,
    LineClamp,
    MathDepth,
    MaxLines,
    Order,
    Orphans,
    ReadingOrder,
    StrokeMiterlimit,
    Widows,
    ZIndex

inline fun integer(
    value: Int,
): IntegerType =
    unsafeCast(value)
