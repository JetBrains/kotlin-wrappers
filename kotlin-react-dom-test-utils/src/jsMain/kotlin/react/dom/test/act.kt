package react.dom.test

import js.promise.await

suspend fun <T> act(
    block: () -> T,
): T {
    return actAsync(block).await()
}
