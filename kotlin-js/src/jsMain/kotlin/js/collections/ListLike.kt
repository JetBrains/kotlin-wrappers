package js.collections

import js.core.ArrayLike

external interface ListLike<out T> :
    ArrayLike<T>,
    CollectionLike<Int, T>
