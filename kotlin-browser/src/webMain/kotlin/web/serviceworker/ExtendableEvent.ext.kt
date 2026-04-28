package web.serviceworker

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.internal.safePromise
import js.undefined.undefinedOrNull
import kotlinx.coroutines.CoroutineScope

/**
 * The **`ExtendableEvent.waitUntil()`** method tells the event dispatcher that work is ongoing.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
 */
fun ExtendableEvent.waitUntil(
    block: suspend CoroutineScope.() -> Unit,
) {
    val promise = IsolatedCoroutineScope()
        .safePromise { block(); undefinedOrNull }

    waitUntil(promise)
}
