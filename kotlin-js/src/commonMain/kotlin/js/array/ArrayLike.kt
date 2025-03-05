@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.array

import js.core.JsAny
import kotlin.js.definedExternally
import seskar.js.JsNativeGetter

external interface ArrayLike<out T : JsAny?> {
    val length: Int

    @JsNativeGetter
    operator fun get(
        index: Int,
    ): T = definedExternally
}

fun <T : JsAny?> ArrayLike<T>.asList(): List<T> =
    object : AbstractList<T>() {
        override val size: Int
            get() = this@asList.length

        override fun get(index: Int): T =
            when (index) {
                in 0..lastIndex -> this@asList[index]
                else -> throw IndexOutOfBoundsException("index $index is not in range [0..$lastIndex]")
            }
    }
