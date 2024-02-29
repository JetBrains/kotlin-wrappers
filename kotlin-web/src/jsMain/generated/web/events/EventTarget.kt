// Automatically generated - do not modify!

package web.events

open external class EventTarget {
    fun <E : Event<EventTarget>> addEventListener(
        type: EventType<E>,
        callback: EventHandler<E>,
        options: AddEventListenerOptions? = definedExternally,
    )

    fun <E : Event<EventTarget>> removeEventListener(
        type: EventType<E>,
        callback: EventHandler<E>,
        options: EventListenerOptions? = definedExternally,
    )

    fun dispatchEvent(
        event: Event<*>,
    ): Boolean
}

fun <T : EventTarget, E : Event<T>> T.addEventHandler(
    type: EventType<E>,
    handler: EventHandler<E>,
): () -> Unit =
    addEventHandler(
        type = type,
        options = undefined,
        handler = handler,
    )

fun <T : EventTarget, E : Event<T>> T.addEventHandler(
    type: EventType<E>,
    options: AddEventListenerOptions?,
    handler: EventHandler<E>,
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
