package vscode.internal

import js.core.JsAny
import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED
import kotlinx.coroutines.cancel
import vscode.CancellationToken

internal fun <R : JsAny?> createCancellablePromise(
    token: CancellationToken,
    block: suspend CoroutineScope.() -> R,
): Promise<R> {
    val scope = IsolatedCoroutineScope()

    token.onCancellationRequested {
        scope.cancel()
    }

    return scope.promise(
        start = UNDISPATCHED,
        block = block,
    )
}
