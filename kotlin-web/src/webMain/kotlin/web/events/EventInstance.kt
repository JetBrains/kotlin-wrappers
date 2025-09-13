@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import js.coroutines.internal.internalSubscribeJob
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.channelFlow
import kotlin.js.undefined

class EventInstance<out E : Event, out C : EventTarget, out T : EventTarget>(
    internal val target: C,
    internal val type: EventType<E>,
) : Flow<E> {
    override suspend fun collect(
        collector: FlowCollector<E>,
    ) {
        channelFlow {
            val unsubscribe = addHandler(::trySend)
            awaitClose(unsubscribe)
        }.collect(collector)
    }
}

inline fun <E : Event, C : EventTarget, T : EventTarget> EventInstance(
    target: C,
    type: String,
): EventInstance<E, C, T> =
    EventInstance(
        target = target,
        type = EventType(type),
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
): Job =
    internalSubscribeJob {
        addHandler(handler, options)
    }

suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.subscribe(
    handler: (D) -> Unit,
): Job
        where D : E,
              D : HasTargets<C, T> =
    subscribe(
        handler = EventHandler(handler),
    )

suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.subscribe(
    options: AddEventListenerOptions?,
    handler: (D) -> Unit,
): Job
        where D : E,
              D : HasTargets<C, T> =
    subscribe(
        handler = EventHandler(handler),
        options = options,
    )
