package js.promise

import js.reflect.unsafeSpecialCast

inline fun <T> PromiseResult(
    value: T,
): PromiseResult<T> =
    unsafeSpecialCast(value)
