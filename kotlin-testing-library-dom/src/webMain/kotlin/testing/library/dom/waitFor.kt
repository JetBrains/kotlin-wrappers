package testing.library.dom

import js.function.unsafeAsync
import js.promise.Promise
import js.promise.PromiseLike
import js.promise.PromiseResult
import js.promise.await
import kotlinx.coroutines.CoroutineScope

fun <T> waitForAsync(
    options: waitForOptions = undefined.unsafeCast<Nothing>(),
    fn: () -> PromiseResult<T>,
): Promise<T> =
    waitForRaw(fn, options)

suspend fun <T> waitFor(
    options: waitForOptions = undefined.unsafeCast<Nothing>(),
    fn: suspend CoroutineScope.() -> T,
): T =
    waitForAsync(options, unsafeAsync(fn)).await()
