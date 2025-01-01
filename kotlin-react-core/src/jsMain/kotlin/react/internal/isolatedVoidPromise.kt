package react.internal

import js.core.Void
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope

internal fun isolatedVoidPromise(
    block: suspend CoroutineScope.() -> Unit,
): Promise<Void> =
    isolatedPromise {
        block()
        undefined
    }
