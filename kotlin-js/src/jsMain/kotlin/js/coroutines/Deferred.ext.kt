package js.coroutines

import js.promise.Promise
import js.reflect.unsafeCast
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.asPromise as asLegacyPromise

inline fun <T> Deferred<T>.asPromise(): Promise<T> =
    unsafeCast(asLegacyPromise())
