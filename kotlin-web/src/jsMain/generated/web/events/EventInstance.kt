// Automatically generated - do not modify!

@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.coroutines.resume

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
): Job =
    CoroutineScope(currentCoroutineContext())
        .launch(start = CoroutineStart.UNDISPATCHED) {
            suspendCancellableCoroutine<Nothing> { continuation ->
                val unsubscribe = addHandler(handler, options)

                continuation.invokeOnCancellation {
                    unsubscribe()
                }
            }
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

// once
suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.once(): D
        where D : E,
              D : HasTargets<C, T> {
    return suspendCancellableCoroutine { continuation ->
        val unsubscribe = addHandler(
            handler = continuation::resume,
            options = AddEventListenerOptions(once = true),
        )

        continuation.invokeOnCancellation {
            unsubscribe()
        }
    }
}

// asFlow
suspend fun <E : Event, T : EventTarget, D> EventInstance<E, *, T>.asFlow(): Flow<D>
        where D : E,
              D : HasTargets<*, T> {
    val flow = MutableSharedFlow<D>()
    var unsubscribe: (() -> Unit)? = null

    flow.subscriptionCount
        .map { count -> count > 0 }
        .distinctUntilChanged()
        .collect { active ->
            if (active) {
                unsubscribe = addHandler<_, _, _, D> { event -> flow.tryEmit(event) }
            } else {
                unsubscribe?.invoke()
                unsubscribe = null
            }
        }

    return flow.asSharedFlow()
}
