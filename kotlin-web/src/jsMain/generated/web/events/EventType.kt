// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.events

import js.reflect.unsafeCast

sealed external interface EventType<out E : Event>

inline fun <E : Event> EventType(
    value: String,
): EventType<E> =
    unsafeCast(value)
