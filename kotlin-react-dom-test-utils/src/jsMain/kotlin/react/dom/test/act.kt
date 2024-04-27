package react.dom.test

import js.promise.await

suspend fun <T> act(
    block: () -> T,
): T {
    // TODO: report bug
    //  doesn't work in K2
    /*
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    */

    return actAsync(block).await()
}
