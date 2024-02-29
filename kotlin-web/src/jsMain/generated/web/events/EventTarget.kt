// Automatically generated - do not modify!

package web.events

open external class EventTarget {
    fun addEventListener(
        type: EventType<Event<EventTarget>>,
        callback: EventHandler<Event<EventTarget>>,
        options: AddEventListenerOptions? = definedExternally,
    )

    internal fun addEventListener(
        type: EventType<*>,
        callback: Function<Unit>,
        options: AddEventListenerOptions? = definedExternally,
    )

    fun removeEventListener(
        type: EventType<Event<EventTarget>>,
        callback: EventHandler<Event<EventTarget>>,
        options: EventListenerOptions? = definedExternally,
    )

    internal fun removeEventListener(
        type: EventType<*>,
        callback: Function<Unit>,
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
