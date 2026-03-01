package testing.library.dom

import js.function.unsafeAsync
import js.promise.await
import kotlinx.coroutines.CoroutineScope

suspend fun <T> waitFor(
    options: waitForOptions = undefined.unsafeCast<Nothing>(),
    block: suspend CoroutineScope.() -> T,
): T =
    waitForAsync(
        options = options,
        callback = unsafeAsync(block),
    ).await()
