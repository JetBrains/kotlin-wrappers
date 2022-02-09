// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface ReadonlyArrayAdapter<out T>

inline fun <T> ReadonlyArrayAdapter<T>.asArray(): ReadonlyArray<T> =
    unsafeCast<ReadonlyArray<T>>()

inline fun <T> ReadonlyArrayAdapter<T>.asSequence(): Sequence<T> =
    asArray().asSequence()

inline operator fun <T> ReadonlyArrayAdapter<T>.iterator(): Iterator<T> =
    asArray().iterator()
