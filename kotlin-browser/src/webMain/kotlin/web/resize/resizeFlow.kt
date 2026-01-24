package web.resize

import js.objects.unsafeJso
import kotlinx.coroutines.flow.Flow
import web.coroutines.internal.observerFlow
import web.dom.Element

fun resizeFlow(
    element: Element,
    options: ResizeObserverOptions = unsafeJso(),
): Flow<ResizeObserverEntry> =
    observerFlow { callback ->
        val observer = ResizeObserver(callback)
        observer.observe(element, options)
        observer::disconnect
    }
