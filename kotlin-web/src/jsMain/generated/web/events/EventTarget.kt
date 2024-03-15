// Automatically generated - do not modify!

package web.events

open external class EventTarget {
    internal fun addEventListener(
        type: EventType<*, *>,
        callback: Function<Unit>,
        options: AddEventListenerOptions? = definedExternally,
    )

    internal fun removeEventListener(
        type: EventType<*, *>,
        callback: Function<Unit>,
        options: EventListenerOptions? = definedExternally,
    )

    fun dispatchEvent(
        event: Event,
    ): Boolean
}

fun <C : EventTarget, E : Event> C.addEventListener(
    type: EventType<E, C>,
    handler: EventHandler<E, C>,
    options: AddEventListenerOptions? = undefined,
) {
    addEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}

fun <C : EventTarget, E : Event> C.removeEventListener(
    type: EventType<E, C>,
    handler: EventHandler<E, C>,
    options: AddEventListenerOptions? = undefined,
) {
    removeEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}

fun <C : EventTarget, E : Event> C.addEventHandler(
    type: EventType<E, C>,
    handler: EventHandler<E, C>,
): () -> Unit =
    addEventHandler(
        type = type,
        options = undefined,
        handler = handler,
    )

fun <C : EventTarget, E : Event> C.addEventHandler(
    type: EventType<E, C>,
    options: AddEventListenerOptions?,
    handler: EventHandler<E, C>,
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
