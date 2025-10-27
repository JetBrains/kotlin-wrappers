package web.serviceworker

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.internal.safePromise
import kotlinx.coroutines.CoroutineScope
import kotlin.js.undefined

/**
 * The **`ExtendableEvent.waitUntil()`** method tells the event dispatcher that work is ongoing.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
 */
fun ExtendableEvent.waitUntil(
    block: CoroutineScope.() -> Unit,
) {
    val promise = IsolatedCoroutineScope()
        .safePromise { block(); undefined }

    waitUntil(promise)
}
