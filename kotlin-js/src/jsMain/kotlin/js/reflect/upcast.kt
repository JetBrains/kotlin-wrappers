@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.reflect

inline fun <T> T.upcast(): T =
    this
