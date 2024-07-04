// Automatically generated - do not modify!

@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

class EventInstance<E : Event, in C : EventTarget, in T : EventTarget>(
    private val target: C,
    private val type: EventType<E, C>,
) {
    // event handler
    fun addHandler(
        handler: EventHandler<E, C, T>,
    ): () -> Unit =
        target.addEventHandler(
            type = type,
            handler = handler,
        )

    fun addHandler(
        options: AddEventListenerOptions?,
        handler: EventHandler<E, C, T>,
    ): () -> Unit =
        target.addEventHandler(
            type = type,
            options = options,
            handler = handler,
        )

    // event + targets
    fun <D> addHandler(
        handler: (D) -> Unit,
    ): () -> Unit
            where D : E,
                  D : HasTargets<C, T> =
        target.addEventHandler(
            type = type,
            handler = handler,
        )

    fun <D> addHandler(
        options: AddEventListenerOptions?,
        handler: (D) -> Unit,
    ): () -> Unit
            where D : E,
                  D : HasTargets<C, T> =
        target.addEventHandler(
            type = type,
            options = options,
            handler = handler,
        )
}
