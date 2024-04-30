@file:JsModule("@preact/signals-core")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package preact.signals.core

/**
 * The base class for plain and computed signals.
 */
external class Signal<T>(
    var value: T = definedExternally,
) {
    fun subscribe(
        fn: (value: T) -> Unit,
    ): () -> Unit

    fun valueOf(): T
    fun toJSON(): T
    fun peek(): T
    val brand: BRAND_SYMBOL
}
