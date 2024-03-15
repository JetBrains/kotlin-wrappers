// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.events

sealed external interface EventType<out E : Event, out C : EventTarget>

inline fun <E : Event, C : EventTarget> EventType(
    value: String,
): EventType<E, C> =
    value.unsafeCast<EventType<E, C>>()
