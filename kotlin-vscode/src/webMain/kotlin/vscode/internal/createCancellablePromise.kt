package vscode.internal

import js.coroutines.internal.safePromise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import vscode.CancellationToken
import vscode.toCoroutineScope
import kotlin.js.JsAny

internal fun <R : JsAny?> createCancellablePromise(
    token: CancellationToken,
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    token.toCoroutineScope()
        .safePromise(block)
