package js.array

import kotlin.collections.asSequence as asKotlinSequence
import kotlin.collections.toList as asKotlinList
import kotlin.collections.toSet as asKotlinSet

actual inline operator fun <T> ReadonlyArray<T>.iterator(): Iterator<T> =
    iterator()

actual inline fun <T> ReadonlyArray<T>.asSequence(): Sequence<T> =
    asKotlinSequence()

actual inline fun <T> ReadonlyArray<T>.toList(): List<T> =
    asKotlinList()

actual inline fun <T> List<T>.toJsArray(): ReadonlyArray<T> =
    toTypedArray()

actual inline fun <T> ReadonlyArray<T>.toSet(): Set<T> =
    asKotlinSet()

actual fun <T> Set<T>.toJsArray(): ReadonlyArray<T> =
    toTypedArray()
