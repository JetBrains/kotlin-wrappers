// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.events

sealed external interface EventType<out E : Event<*>>

inline fun <E : Event<*>> EventType(
    value: String,
): EventType<E> =
    value.unsafeCast<EventType<E>>()
