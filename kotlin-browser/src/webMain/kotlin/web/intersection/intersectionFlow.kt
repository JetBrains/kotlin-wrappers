package web.intersection

import js.objects.unsafeJso
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import web.coroutines.internal.observerCallback
import web.dom.Element

fun intersectionFlow(
    element: Element,
    options: IntersectionObserverInit = unsafeJso(),
): Flow<IntersectionObserverEntry> =
    callbackFlow {
        val observer = IntersectionObserver(observerCallback(), options)
        observer.observe(element)
        awaitClose { observer.disconnect() }
    }
