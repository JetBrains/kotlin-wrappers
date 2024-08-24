// Automatically generated - do not modify!

@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

open external class EventTarget {
    internal fun <E : Event> addEventListener(
        type: EventType<E>,
        callback: EventHandler<E, *, *>,
        options: AddEventListenerOptions? = definedExternally,
    )

    internal fun addEventListener(
        type: EventType<*>,
        callback: Function<Unit>,
        options: AddEventListenerOptions? = definedExternally,
    )

    internal fun <E : Event> removeEventListener(
        type: EventType<E>,
        callback: EventHandler<E, *, *>,
        options: EventListenerOptions? = definedExternally,
    )

    internal fun removeEventListener(
        type: EventType<*>,
        callback: Function<Unit>,
        options: EventListenerOptions? = definedExternally,
    )

    fun dispatchEvent(
        event: Event,
    ): Boolean
}

// event handler
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

fun <E : Event, C : EventTarget, T : EventTarget> C.removeEventListener(
    type: EventType<E>,
    handler: EventHandler<E, C, T>,
    options: AddEventListenerOptions? = undefined,
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

fun <E : Event, C : EventTarget> C.removeEventListener(
    type: EventType<E>,
    handler: (E) -> Unit,
    options: AddEventListenerOptions? = undefined,
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
