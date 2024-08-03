@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.promise

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.asDeferred
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlinx.coroutines.promise as legacyPromise

fun <T> CoroutineScope.promise(
    context: CoroutineContext = EmptyCoroutineContext,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    block: suspend CoroutineScope.() -> T,
): Promise<T> =
    legacyPromise(
        context = context,
        start = start,
        block = block,
    ).unsafeCast<Promise<T>>()

inline fun <T> Promise<T>.asDeferred(): Deferred<T> =
    unsafeCast<LegacyPromise<T>>().asDeferred()
