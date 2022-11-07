// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.events

sealed external interface EventType<T : LegacyEvent>

inline fun <T : LegacyEvent> EventType(
    value: String,
): EventType<T> =
    value.unsafeCast<EventType<T>>()
