@file:Suppress(
    // KT-19215
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import js.reflect.unsafeCast

sealed external interface EventHandler<in E : Event, out C : EventTargetLike, out T : EventTargetLike>

inline fun EventHandler(
    noinline handler: () -> Unit,
): EventHandler<Event, Nothing, Nothing> {
    return unsafeCast(handler)
}

inline fun <E : Event, C : EventTargetLike, T : EventTargetLike, D> EventHandler(
    noinline handler: (D) -> Unit,
): EventHandler<E, C, T>
        where D : E,
              D : HasTargets<C, T> {
    return unsafeCast(handler)
}
