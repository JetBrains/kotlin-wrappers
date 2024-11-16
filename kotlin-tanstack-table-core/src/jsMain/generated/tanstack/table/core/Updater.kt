// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

import js.reflect.unsafeCast

sealed external interface Updater<T> /* T | ((old: T) -> T) */

inline fun <T> Updater(
    source: T,
): Updater<T> =
    unsafeCast(source)

inline fun <T> Updater(
    noinline source: (old: T) -> T,
): Updater<T> =
    unsafeCast(source)
