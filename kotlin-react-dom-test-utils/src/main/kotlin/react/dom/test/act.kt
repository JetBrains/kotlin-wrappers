package react.dom.test

import kotlinx.coroutines.await
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
