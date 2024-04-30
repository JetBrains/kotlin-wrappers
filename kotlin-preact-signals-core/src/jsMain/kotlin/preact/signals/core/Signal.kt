@file:JsModule("@preact/signals-core")

@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package preact.signals.core

import kotlin.reflect.KProperty

/**
 * The base class for plain and computed signals.
 */
external class Signal<T>(
    override var value: T = definedExternally,
) : ReadonlySignal<T> {
    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        this.value = value
    }

    override fun subscribe(
        fn: (value: T) -> Unit,
    ): () -> Unit

    override fun valueOf(): T
    override fun toJSON(): T
    override fun peek(): T
    override val brand: BRAND_SYMBOL
}
