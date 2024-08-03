@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.promise

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.asDeferred

inline fun <T> Promise<T>.asDeferred(): Deferred<T> =
    unsafeCast<LegacyPromise<T>>().asDeferred()
