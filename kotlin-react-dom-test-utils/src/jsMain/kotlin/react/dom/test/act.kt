package react.dom.test

import js.promise.await
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

suspend fun <T> act(
    block: () -> T,
): T {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    return actAsync(block).await()
}
