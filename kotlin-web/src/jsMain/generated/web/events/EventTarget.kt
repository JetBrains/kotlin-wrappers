// Automatically generated - do not modify!

@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package web.events

open external class EventTarget {
    fun <E : Event<EventTarget>> addEventListener(
        type: EventType<E>,
        callback: EventHandler<E>,
        options: AddEventListenerOptions? = definedExternally,
    )

    inline fun <E : Event<EventTarget>> addEventHandler(
        type: EventType<E>,
        noinline handler: EventHandler<E>,
    ): () -> Unit =
        addEventHandler(
            target = this,
            type = type,
            handler = handler,
        )

    inline fun <E : Event<EventTarget>> addEventHandler(
        type: EventType<E>,
        options: AddEventListenerOptions?,
        noinline handler: EventHandler<E>,
    ): () -> Unit =
        addEventHandler(
            target = this,
            type = type,
            handler = handler,
            options = options,
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

@PublishedApi
internal fun <E : Event<EventTarget>> addEventHandler(
    target: EventTarget,
    type: EventType<E>,
    handler: EventHandler<E>,
): () -> Unit =
    addEventHandler(
        target = target,
        type = type,
        handler = handler,
        options = undefined,
    )

@PublishedApi
internal fun <E : Event<EventTarget>> addEventHandler(
    target: EventTarget,
    type: EventType<E>,
    handler: EventHandler<E>,
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
