@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.promise

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.asDeferred
import kotlinx.coroutines.asPromise as asLegacyPromise

inline fun <T> Deferred<T>.asPromise(): Promise<T> =
    asLegacyPromise().unsafeCast<Promise<T>>()

inline fun <T> Promise<T>.asDeferred(): Deferred<T> =
    unsafeCast<LegacyPromise<T>>().asDeferred()
