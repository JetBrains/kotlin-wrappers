// Automatically generated - do not modify!

package tanstack.table.core

import js.reflect.unsafeSpecialCast

sealed external interface OnChangeFn<T> /* (updaterOrValue: Updater<T>) -> void */

inline fun <T> OnChangeFn(
    noinline source: (updaterOrValue: Updater<T>) -> Unit,
): OnChangeFn<T> =
    unsafeSpecialCast(source)
