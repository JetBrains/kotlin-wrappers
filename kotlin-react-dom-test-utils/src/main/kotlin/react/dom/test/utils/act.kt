package react.dom.test.utils

import kotlinx.coroutines.await

suspend fun <T> act(
    block: () -> T,
): T =
    actAsync(block).await()
