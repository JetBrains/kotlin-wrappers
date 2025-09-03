package vscode.internal

import js.core.JsAny
import js.coroutines.internal.safePromise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import vscode.CancellationToken
import vscode.coroutines.CoroutineScope

internal fun <R : JsAny?> createCancellablePromise(
    token: CancellationToken,
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    CoroutineScope(token)
        .safePromise(block)
