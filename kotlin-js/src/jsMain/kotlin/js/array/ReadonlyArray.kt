package js.array

import kotlin.collections.asSequence as asKotlinSequence

actual inline operator fun <T> ReadonlyArray<T>.iterator(): Iterator<T> =
    iterator()

actual inline fun <T> ReadonlyArray<T>.asSequence(): Sequence<T> =
    asKotlinSequence()
