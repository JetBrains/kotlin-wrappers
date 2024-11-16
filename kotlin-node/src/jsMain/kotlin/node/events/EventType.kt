@file:Suppress(
    "NOTHING_TO_INLINE",
)

package node.events

import js.reflect.unsafeCast
import js.symbol.Symbol

sealed external interface EventType

inline fun EventType(
    value: String,
): EventType =
    unsafeCast(value)

inline fun EventType(
    value: Symbol,
): EventType =
    unsafeCast(value)
