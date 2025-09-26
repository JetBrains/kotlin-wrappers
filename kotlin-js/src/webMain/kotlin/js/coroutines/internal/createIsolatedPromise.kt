package js.coroutines.internal

import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlin.js.JsAny

internal fun <R : JsAny?> createIsolatedPromise(
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    IsolatedCoroutineScope()
        .safePromise(block)
