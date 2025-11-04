package react

import js.core.StringLike
import js.reflect.unsafeCast

sealed /* final */
external interface Key :
    StringLike

inline fun Key(
    value: String,
): Key =
    unsafeCast(value)

inline fun Key(
    value: Int,
): Key =
    unsafeCast(value.toString())
