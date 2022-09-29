// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

sealed external interface Updater<T> /* T | ((old: T) -> T) */

inline fun <T> Updater(
    source: T,
): Updater<T> =
    source.unsafeCast<Updater<T>>()

inline fun <T> Updater(
    noinline source: (old: T) -> T,
): Updater<T> =
    source.unsafeCast<Updater<T>>()
