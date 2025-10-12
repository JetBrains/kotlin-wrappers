@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import js.objects.unsafeJso
import js.reflect.upcast
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlin.js.undefined

class EventInstance<out E : Event, out C : EventTarget, out T : EventTarget>(
    internal val target: EventTargetLike,
    internal val type: EventType<E>,
)

inline fun <E : Event, C : EventTarget, T : EventTarget> EventInstance(
    target: EventTargetLike,
    type: String,
): EventInstance<E, C, T> =
    EventInstance(
        target = target,
        type = EventType(type),
    )

inline fun <E : Event, C : EventTarget, T : EventTarget> EventInstance(
    target: C,
    type: EventType<E>,
): EventInstance<E, C, T> =
    EventInstance(
        target = target.upcast<EventTargetLike>(),
        type = type,
    )

inline fun <E : Event, C : EventTarget, T : EventTarget> EventInstance(
    target: C,
    type: String,
): EventInstance<E, C, T> =
    EventInstance(
        target = target.upcast<EventTargetLike>(),
        type = EventType(type),
    )

operator fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.invoke(
    capture: Boolean? = null,
    passive: Boolean? = null,
): Flow<D>
        where D : E,
              D : HasTargets<C, T> {
    val options = listenerOptions(
        capture = capture,
        passive = passive,
    )

    return callbackFlow {
        val unsubscribe = addHandler(options, ::trySend)
        awaitClose(unsubscribe)
    }
}

private fun listenerOptions(
    capture: Boolean?,
    passive: Boolean?,
): AddEventListenerOptions {
    val options: AddEventListenerOptions = unsafeJso()
    if (capture != null)
        options.capture = capture

    if (passive != null)
        options.passive = passive

    return options
}

// addHandler
fun <E : Event, C : EventTarget, T : EventTarget> EventInstance<E, C, T>.addHandler(
    handler: EventHandler<E, C, T>,
    options: AddEventListenerOptions? = undefined,
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
