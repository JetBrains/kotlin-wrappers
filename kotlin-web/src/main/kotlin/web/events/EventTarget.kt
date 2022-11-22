package web.events

open external class EventTarget : IEventTarget {
    override fun addEventListener(
        type: String,
        callback: EventHandler<Event>?,
        options: EventHandlerOptions?,
    )

    override fun removeEventListener(
        type: String,
        callback: EventHandler<Event>?,
        options: EventHandlerOptions?,
    )

    fun dispatchEvent(
        event: Event,
    ): Boolean
}

fun <T : Event> EventTarget.addEventHandler(
    type: EventType<T>,
    handler: (T) -> Unit,
): () -> Unit =
    addEventHandler(
        type = type,
        handler = handler,
        options = undefined,
    )

fun <T : Event> EventTarget.addEventHandler(
    type: EventType<T>,
    options: EventHandlerOptions?,
    handler: (T) -> Unit,
): () -> Unit {
    addEventListener(
        type = type.unsafeCast<String>(),
        callback = handler.unsafeCast<EventHandler<Event>>(),
        options = options,
    )

    return {
        removeEventListener(
            type = type.unsafeCast<String>(),
            callback = handler.unsafeCast<EventHandler<Event>>(),
            options = options,
        )
    }
}
