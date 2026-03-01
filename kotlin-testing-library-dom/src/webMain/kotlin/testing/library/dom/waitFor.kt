package testing.library.dom

import js.function.unsafeAsync
import js.promise.await
import kotlinx.coroutines.CoroutineScope

suspend fun <T> waitFor(
    block: suspend CoroutineScope.() -> T,
): T =
    waitForRaw(
        callback = unsafeAsync(block),
    ).await()

suspend fun <T> waitFor(
    options: waitForOptions,
    block: suspend CoroutineScope.() -> T,
): T =
    waitForRaw(
        options = options,
        callback = unsafeAsync(block),
    ).await()
