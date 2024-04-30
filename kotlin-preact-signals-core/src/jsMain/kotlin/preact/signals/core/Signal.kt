@file:JsModule("@preact/signals-core")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package preact.signals.core

/**
 * The base class for plain and computed signals.
 */
external class Signal<T>(
    override var value: T = definedExternally,
) : ReadonlySignal<T> {
    override fun subscribe(
        fn: (value: T) -> Unit,
    ): () -> Unit

    override fun valueOf(): T
    override fun toJSON(): T
    override fun peek(): T
    override val brand: BRAND_SYMBOL
}
