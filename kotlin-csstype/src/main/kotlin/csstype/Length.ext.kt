@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline operator fun Length.unaryMinus(): Length =
    Length("-$this")

inline operator fun Length.plus(other: Length): Length =
    Length("calc($this + $other)")

inline operator fun Length.minus(other: Length): Length =
    Length("calc($this - $other)")
