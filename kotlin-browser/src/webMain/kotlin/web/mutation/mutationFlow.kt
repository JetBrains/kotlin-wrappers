package web.mutation

import kotlinx.coroutines.flow.Flow
import web.coroutines.internal.observerFlow
import web.dom.Node

fun Node.mutationFlow(
    options: MutationObserverInit,
): Flow<MutationRecord> =
    observerFlow { callback ->
        val observer = MutationObserver(callback)
        observer.observe(this, options)
        observer::disconnect
    }
