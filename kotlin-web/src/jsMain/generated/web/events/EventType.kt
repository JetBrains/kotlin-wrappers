// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.events

sealed external interface EventType<out T : Event>

inline fun <T : Event> EventType(
    value: String,
): EventType<T> =
    value.unsafeCast<EventType<T>>()
