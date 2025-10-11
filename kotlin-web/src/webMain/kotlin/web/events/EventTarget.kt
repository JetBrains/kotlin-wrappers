@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import web.observable.Observable
import kotlin.js.definedExternally
import kotlin.js.undefined

/**
 * The **`EventTarget`** interface is implemented by objects that can receive events and may have listeners for them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget)
 */
open external class EventTarget {
    internal fun <E : Event> addEventListener(
        type: EventType<E>,
        callback: EventHandler<E, *, *>,
        options: AddEventListenerOptions? = definedExternally,
    )

    internal fun <E : Event> addEventListener(
        type: EventType<*>,
        callback: (E) -> Unit,
        options: AddEventListenerOptions? = definedExternally,
    )

    internal fun <E : Event> removeEventListener(
        type: EventType<E>,
        callback: EventHandler<E, *, *>,
        options: EventListenerOptions? = definedExternally,
    )

    internal fun <E : Event> removeEventListener(
        type: EventType<*>,
        callback: (E) -> Unit,
        options: EventListenerOptions? = definedExternally,
    )

    /**
     * The **`dispatchEvent()`** method of the EventTarget sends an Event to the object, (synchronously) invoking the affected event listeners in the appropriate order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
     */
    fun dispatchEvent(
        event: Event,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/when)
     */
    fun <T : Event> `when`(
        type: EventType<T>,
        options: ObservableEventListenerOptions? = definedExternally,
    ): Observable<T>
}

// event handler

/**
 * The **`addEventListener()`** method of the EventTarget interface sets up a function that will be called whenever the specified event is delivered to the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
 */
fun <E : Event, C : EventTarget, T : EventTarget> C.addEventListener(
    type: EventType<E>,
    handler: EventHandler<E, C, T>,
    options: AddEventListenerOptions? = undefined,
) {
    addEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}

/**
 * The **`removeEventListener()`** method of the EventTarget interface removes an event listener previously registered with EventTarget.addEventListener() from the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
 */
fun <E : Event, C : EventTarget, T : EventTarget> C.removeEventListener(
    type: EventType<E>,
    handler: EventHandler<E, C, T>,
    options: EventListenerOptions? = undefined,
) {
    removeEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}

fun <E : Event, C : EventTarget, T : EventTarget> C.addEventHandler(
    type: EventType<E>,
    handler: EventHandler<E, C, T>,
): () -> Unit =
    addEventHandler(
        type = type,
        options = undefined,
        handler = handler,
    )

fun <E : Event, C : EventTarget, T : EventTarget> C.addEventHandler(
    type: EventType<E>,
    options: AddEventListenerOptions?,
    handler: EventHandler<E, C, T>,
): () -> Unit {
    addEventListener(
        type = type,
        callback = handler,
        options = options,
    )

    return {
        removeEventListener(
            type = type,
            callback = handler,
            options = options,
        )
    }
}

// event

/**
 * The **`addEventListener()`** method of the EventTarget interface sets up a function that will be called whenever the specified event is delivered to the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
 */
fun <E : Event, C : EventTarget> C.addEventListener(
    type: EventType<E>,
    handler: (E) -> Unit,
    options: AddEventListenerOptions? = undefined,
) {
    addEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}

/**
 * The **`removeEventListener()`** method of the EventTarget interface removes an event listener previously registered with EventTarget.addEventListener() from the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
 */
fun <E : Event, C : EventTarget> C.removeEventListener(
    type: EventType<E>,
    handler: (E) -> Unit,
    options: EventListenerOptions? = undefined,
) {
    removeEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}

// event + targets
fun <E : Event, C : EventTarget, D> C.addEventHandler(
    type: EventType<E>,
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, EventTarget> {
    return addEventHandler(
        type = type,
        options = undefined,
        handler = handler,
    )
}

fun <E : Event, C : EventTarget, D> C.addEventHandler(
    type: EventType<E>,
    options: AddEventListenerOptions?,
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, EventTarget> {
    addEventListener(
        type = type,
        callback = handler,
        options = options,
    )

    return {
        removeEventListener(
            type = type,
            callback = handler,
            options = options,
        )
    }
}
