package vscode.internal

import js.core.JsAny
import js.coroutines.promise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED
import vscode.CancellationToken
import vscode.coroutines.CoroutineScope

internal fun <R : JsAny?> createCancellablePromise(
    token: CancellationToken,
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    CoroutineScope(token)
        .promise(
            start = UNDISPATCHED,
            block = block,
        )
