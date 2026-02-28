package react

import js.function.unsafeAsync
import js.promise.await
import kotlinx.coroutines.CoroutineScope

suspend fun <T> act(
    block: suspend CoroutineScope.() -> T,
): T =
    actAsync(unsafeAsync(block)).await()
