package react

import js.core.BigInt
import js.internal.InternalApi
import js.reflect.unsafeCast

@SubclassOptInRequired(InternalApi::class)
external interface Key

inline fun Key(
    value: String,
): Key =
    unsafeCast(value)

inline fun Key(
    value: Int,
): Key =
    unsafeCast(value)

inline fun Key(
    value: BigInt,
): Key =
    unsafeCast(value)
