package tanstack.react.table

import react.StateSetter
import tanstack.table.core.OnChangeFn

inline fun <T> StateSetter<T>.asFunction(): OnChangeFn<T> =
    unsafeCast<OnChangeFn<T>>()
