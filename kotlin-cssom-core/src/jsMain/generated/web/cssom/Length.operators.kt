// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

inline operator fun Length.unaryMinus(): Length =
    unsafeCast("-$this")

inline operator fun Length.plus(other: Length): Length =
    unsafeCast("calc($this + $other)")

inline operator fun Length.minus(other: Length): Length =
    unsafeCast("calc($this - $other)")

inline operator fun Number.times(other: Length): Length =
    unsafeCast("calc($this * $other)")

inline operator fun Length.div(other: Number): Length =
    unsafeCast("calc($this / $other)")
