package node.events

import js.symbol.Symbol

external interface EventType

@Suppress("NOTHING_TO_INLINE")
inline fun EventType(
    value: String,
): EventType =
    value.unsafeCast<EventType>()

@Suppress("NOTHING_TO_INLINE")
inline fun EventType(
    value: Symbol,
): EventType =
    value.unsafeCast<EventType>()
