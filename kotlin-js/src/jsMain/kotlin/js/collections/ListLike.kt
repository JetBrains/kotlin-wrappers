package js.collections

import js.array.ArrayLike

external interface ListLike<out T> :
    ArrayLike<T>,
    CollectionLike<Int, T>
