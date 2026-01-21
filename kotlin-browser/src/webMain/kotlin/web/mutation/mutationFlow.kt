package web.mutation

import js.objects.unsafeJso
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import web.coroutines.internal.observerCallback
import web.dom.Element

fun mutationFlow(
    element: Element,
    options: MutationObserverInit = unsafeJso(),
): Flow<MutationRecord> =
    callbackFlow {
        val observer = MutationObserver(observerCallback())
        observer.observe(element, options)
        awaitClose { observer.disconnect() }
    }
