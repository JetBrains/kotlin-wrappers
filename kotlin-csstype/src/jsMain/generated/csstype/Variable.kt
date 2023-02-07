// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface Variable<T : Any>

inline fun <T : Any> Variable(
    name: String,
): Variable<T> =
    name.unsafeCast<Variable<T>>()
