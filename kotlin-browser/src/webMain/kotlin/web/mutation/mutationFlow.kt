package web.mutation

import js.objects.unsafeJso
import kotlinx.coroutines.flow.Flow
import web.coroutines.internal.observerFlow
import web.dom.Element

fun mutationFlow(
    element: Element,
    options: MutationObserverInit = unsafeJso(),
): Flow<MutationRecord> =
    observerFlow { callback ->
        val observer = MutationObserver(callback)
        observer.observe(element, options)
        observer::disconnect
    }
