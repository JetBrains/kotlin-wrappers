package react.internal

import js.core.Void
import js.coroutines.internal.createIsolatedPromise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope

internal fun isolatedVoidPromise(
    block: suspend CoroutineScope.() -> Unit,
): Promise<Void> =
    createIsolatedPromise {
        block()
        undefined
    }
