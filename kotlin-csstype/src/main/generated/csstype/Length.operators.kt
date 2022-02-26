// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline operator fun Length.unaryMinus(): Length =
    "-$this".unsafeCast<Length>()

inline operator fun Length.plus(other: Length): Length =
    "calc($this + $other)".unsafeCast<Length>()

inline operator fun Length.minus(other: Length): Length =
    "calc($this - $other)".unsafeCast<Length>()

inline operator fun Number.times(other: Length): Length =
    "calc($this * $other)".unsafeCast<Length>()

inline operator fun Length.div(other: Number): Length =
    "calc($this / $other)".unsafeCast<Length>()
