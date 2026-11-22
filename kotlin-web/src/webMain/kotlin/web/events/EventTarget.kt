@file:Suppress(
    // KT-19215
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import web.abort.AbortController
import web.abort.unsafeAbortable
import web.experimental.ExperimentalWebApi
import web.observable.Observable

/**
 * The **`EventTarget`** interface is implemented by objects that can receive events and may have listeners for them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget)
 */
open external class EventTarget :
    EventTargetLike {

    override fun dispatchEvent(
        event: Event,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/when)
     */
    @ExperimentalWebApi
    open fun <T : Event> `when`(
        type: EventType<T>,
        options: ObservableEventListenerOptions? = definedExternally,
    ): Observable<T>
}

// event handler
fun <E : Event, C : EventTarget, T : EventTarget> C.addEventHandler(
    type: EventType<E>,
    handler: EventHandler<E, C, T>,
): () -> Unit =
    addEventHandler(
        type = type,
        options = null,
        handler = handler,
    )

fun <E : Event, C : EventTarget, T : EventTarget> C.addEventHandler(
    type: EventType<E>,
    options: AddEventListenerOptions?,
    handler: EventHandler<E, C, T>,
): () -> Unit {
    val controller = AbortController()
    addEventListener(
        type = type,
        callback = handler,
        options = unsafeAbortable(options, controller.signal),
    )
    return controller::abort
}

// event + targets
fun <E : Event, C : EventTarget, D> C.addEventHandler(
    type: EventType<E>,
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, EventTarget> =
    addEventHandler(
        type = type,
        options = null,
        handler = handler,
    )

fun <E : Event, C : EventTarget, D> C.addEventHandler(
    type: EventType<E>,
    options: AddEventListenerOptions?,
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, EventTarget> {
    val controller = AbortController()
    addEventListener(
        type = type,
        callback = handler,
        options = unsafeAbortable(options, controller.signal),
    )
    return controller::abort
}
