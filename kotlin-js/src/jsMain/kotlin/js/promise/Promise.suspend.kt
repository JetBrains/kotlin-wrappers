package js.promise

import js.promise.legacy.LegacyPromise
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.asDeferred

inline fun <T> Promise<T>.asDeferred(): Deferred<T> =
    unsafeCast<LegacyPromise<T>>().asDeferred()
