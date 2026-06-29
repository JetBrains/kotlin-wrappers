// Automatically generated - do not modify!

package web.events

import js.reflect.unsafeCast

sealed /* opaque */
external interface EventType<out E : Event>

inline fun <E : Event> EventType(
    value: String,
): EventType<E> =
    unsafeCast(value)
