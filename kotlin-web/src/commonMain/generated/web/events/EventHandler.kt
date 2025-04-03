// Automatically generated - do not modify!

@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import js.reflect.legacyUnsafeCast

sealed external interface EventHandler<in E : Event, out C : EventTarget, out T : EventTarget>

inline fun EventHandler(
    noinline handler: () -> Unit,
): EventHandler<Event, Nothing, Nothing> {
    return legacyUnsafeCast(handler)
}

inline fun <E : Event, C : EventTarget, T : EventTarget, D> EventHandler(
    noinline handler: (D) -> Unit,
): EventHandler<E, C, T>
        where D : E,
              D : HasTargets<C, T> {
    return legacyUnsafeCast(handler)
}
