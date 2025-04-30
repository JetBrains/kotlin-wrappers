package tanstack.table.core

import js.reflect.unsafeCast
import react.StateSetter

inline fun <T> OnChangeFn(
    value: StateSetter<T>,
): OnChangeFn<T> =
    unsafeCast(value)
