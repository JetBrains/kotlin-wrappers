@file:Suppress(
    "NOTHING_TO_INLINE",
)

package node.events

import js.reflect.unsafeCast

sealed external interface EventListener

inline fun EventListener(
    noinline fn: () -> Unit,
): EventListener =
    unsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?) -> Unit,
): EventListener =
    unsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?) -> Unit,
): EventListener =
    unsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?) -> Unit,
): EventListener =
    unsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    unsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    unsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    unsafeCast(fn)

inline fun EventListener(
    noinline fn: (Any?, Any?, Any?, Any?, Any?, Any?, Any?) -> Unit,
): EventListener =
    unsafeCast(fn)
