@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package web.events

open external class EventTarget : IEventTarget {
    override fun <T : Event> addEventListener(
        type: EventType<T>,
        callback: EventHandler<T>,
        options: AddEventListenerOptions?,
    )

    inline fun <T : Event> addEventHandler(
        type: EventType<T>,
        noinline handler: EventHandler<T>,
    ): () -> Unit =
        addEventHandler(
            target = this,
            type = type,
            handler = handler,
        )

    inline fun <T : Event> addEventHandler(
        type: EventType<T>,
        options: AddEventListenerOptions?,
        noinline handler: EventHandler<T>,
    ): () -> Unit =
        addEventHandler(
            target = this,
            type = type,
            handler = handler,
            options = options,
        )

    override fun <T : Event> removeEventListener(
        type: EventType<T>,
        callback: EventHandler<T>,
        options: EventListenerOptions?,
    )

    fun dispatchEvent(
        event: Event,
    ): Boolean
}

@PublishedApi
internal fun <T : Event> addEventHandler(
    target: EventTarget,
    type: EventType<T>,
    handler: EventHandler<T>,
): () -> Unit =
    addEventHandler(
        target = target,
        type = type,
        handler = handler,
        options = undefined,
    )

@PublishedApi
internal fun <T : Event> addEventHandler(
    target: EventTarget,
    type: EventType<T>,
    handler: EventHandler<T>,
    options: AddEventListenerOptions?,
): () -> Unit {
    target.addEventListener(
        type = type,
        callback = handler,
        options = options,
    )

    return {
        target.removeEventListener(
            type = type,
            callback = handler,
            options = options,
        )
    }
}
