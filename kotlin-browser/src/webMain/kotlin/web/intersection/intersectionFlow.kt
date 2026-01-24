package web.intersection

import js.objects.unsafeJso
import kotlinx.coroutines.flow.Flow
import web.coroutines.internal.observerFlow
import web.dom.Element

fun intersectionFlow(
    element: Element,
    options: IntersectionObserverInit = unsafeJso(),
): Flow<IntersectionObserverEntry> =
    observerFlow { callback ->
        val observer = IntersectionObserver(callback, options)
        observer.observe(element)
        observer::disconnect
    }
