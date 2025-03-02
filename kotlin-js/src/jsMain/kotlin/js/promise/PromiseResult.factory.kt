package js.promise

import js.reflect.unsafeCast

inline fun <T> PromiseResult(
    value: T,
): PromiseResult<T> =
    unsafeCast(value)
