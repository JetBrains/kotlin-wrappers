package js.array

import kotlin.collections.asSequence as asKotlinSequence
import kotlin.collections.toList as asKotlinList

actual inline operator fun <T> ReadonlyArray<T>.iterator(): Iterator<T> =
    iterator()

actual inline fun <T> ReadonlyArray<T>.asSequence(): Sequence<T> =
    asKotlinSequence()

actual inline fun <T> ReadonlyArray<T>.toList(): List<T> =
    asKotlinList()
