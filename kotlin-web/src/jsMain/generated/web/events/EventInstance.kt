// Automatically generated - do not modify!

@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import kotlinx.coroutines.suspendCancellableCoroutine

class EventInstance<out E : Event, out C : EventTarget, out T : EventTarget>(
    internal val target: C,
    internal val type: EventType<E, C>,
)

// addHandler
fun <E : Event, C : EventTarget, T : EventTarget> EventInstance<E, C, T>.addHandler(
    handler: EventHandler<E, C, T>,
    options: AddEventListenerOptions? = undefined,
): () -> Unit =
    target.addEventHandler(
        type = type,
        options = options,
        handler = handler,
    )

fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.addHandler(
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, T> =
    addHandler(
        handler = EventHandler(handler),
    )

fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.addHandler(
    options: AddEventListenerOptions?,
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, T> =
    addHandler(
        handler = EventHandler(handler),
        options = options,
    )

// subscribe
suspend fun <E : Event, C : EventTarget, T : EventTarget> EventInstance<E, C, T>.subscribe(
    handler: EventHandler<E, C, T>,
    options: AddEventListenerOptions? = undefined,
) {
    suspendCancellableCoroutine<Unit> { continuation ->
        val unsubscribe = addHandler(handler, options)

        continuation.invokeOnCancellation {
            unsubscribe()
        }
    }
}

suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.subscribe(
    handler: (D) -> Unit,
) where D : E,
        D : HasTargets<C, T> {
    subscribe(
        handler = EventHandler(handler),
    )
}

suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.subscribe(
    options: AddEventListenerOptions?,
    handler: (D) -> Unit,
) where D : E,
        D : HasTargets<C, T> {
    subscribe(
        handler = EventHandler(handler),
        options = options,
    )
}
