@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package preact.signals.core

import kotlin.reflect.KProperty

/**
 * An interface for read-only signals.
 */
sealed external interface ReadonlySignal<out T> {
    val value: T

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T =
        value

    fun subscribe(
        fn: (value: T) -> Unit,
    ): () -> Unit

    fun valueOf(): T
    fun toJSON(): T
    fun peek(): T
    val brand: BRAND_SYMBOL
}
