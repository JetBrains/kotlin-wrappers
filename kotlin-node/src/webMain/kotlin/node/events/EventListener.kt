package node.events

import js.reflect.legacyUnsafeCast

sealed external interface EventListener

inline fun EventListener(
    noinline fn: () -> Unit,
): EventListener =
    legacyUnsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?) -> Unit,
): EventListener =
    legacyUnsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?) -> Unit,
): EventListener =
    legacyUnsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?) -> Unit,
): EventListener =
    legacyUnsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    legacyUnsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    legacyUnsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    legacyUnsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    legacyUnsafeCast(fn)
