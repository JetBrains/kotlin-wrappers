package web.events

open external class EventTarget : IEventTarget {
    override fun <T : Event> addEventListener(
        type: EventType<T>,
        callback: EventHandler<T>?,
        options: AddEventListenerOptions?,
    )

    override fun <T : Event> removeEventListener(
        type: EventType<T>,
        callback: EventHandler<T>?,
        options: AddEventListenerOptions?,
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
    options: AddEventListenerOptions?,
    handler: (T) -> Unit,
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
