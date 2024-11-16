package node.events

import js.array.JsTuple
import js.reflect.unsafeCast
import js.symbol.Symbol

external interface EventType<in T : EventEmitter, out P : JsTuple>

@Suppress("NOTHING_TO_INLINE")
inline fun <T : EventEmitter, P : JsTuple> EventType(
    value: String,
): EventType<T, P> =
    unsafeCast(value)

@Suppress("NOTHING_TO_INLINE")
inline fun <T : EventEmitter, P : JsTuple> EventType(
    value: Symbol,
): EventType<T, P> =
    unsafeCast(value)
