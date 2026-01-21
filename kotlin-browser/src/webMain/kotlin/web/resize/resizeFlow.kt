package web.resize

import js.objects.unsafeJso
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import web.coroutines.internal.observerCallback
import web.dom.Element

fun resizeFlow(
    element: Element,
    options: ResizeObserverOptions = unsafeJso(),
): Flow<ResizeObserverEntry> =
    callbackFlow {
        val observer = ResizeObserver(observerCallback())
        observer.observe(element, options)
        awaitClose { observer.disconnect() }
    }
