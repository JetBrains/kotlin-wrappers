// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

sealed external interface EventHandler<in E : Event, out C : EventTarget>

inline fun EventHandler(
    noinline handler: () -> Unit,
): EventHandler<Event, EventTarget> {
    return handler.unsafeCast<EventHandler<Event, EventTarget>>()
}

inline fun <E : Event, C : EventTarget, D> EventHandler(
    noinline handler: (D) -> Unit,
): EventHandler<E, C>
        where D : E,
              D : HasTargets<C> {
    return handler.unsafeCast<EventHandler<E, C>>()
}
