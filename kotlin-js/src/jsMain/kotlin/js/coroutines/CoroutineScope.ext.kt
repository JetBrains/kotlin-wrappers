package js.coroutines

import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
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
