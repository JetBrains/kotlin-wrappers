package node.events

import js.symbol.Symbol

external interface LegacyEventType

@Suppress("NOTHING_TO_INLINE")
inline fun LegacyEventType(
    value: String,
): LegacyEventType =
    value.unsafeCast<LegacyEventType>()

@Suppress("NOTHING_TO_INLINE")
inline fun LegacyEventType(
    value: Symbol,
): LegacyEventType =
    value.unsafeCast<LegacyEventType>()
