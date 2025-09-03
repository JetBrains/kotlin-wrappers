package vscode.coroutines

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import vscode.CancellationToken

fun CoroutineScope(
    token: CancellationToken,
): CoroutineScope {
    val scope = IsolatedCoroutineScope()

    if (token.isCancellationRequested) {
        scope.cancel()
    } else {
        token.onCancellationRequested {
            scope.cancel()
        }
    }

    return scope
}
