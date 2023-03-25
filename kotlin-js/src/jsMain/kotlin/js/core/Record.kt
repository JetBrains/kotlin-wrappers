@file:Suppress(
    "DEPRECATION",
    "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.core

external interface Record<K : Any, V : Any>
    : ReadonlyRecord<K, V> {
    @nativeSetter
    operator fun set(
        key: K,
        value: V,
    ): Unit = definedExternally
}

fun <K : Any, V : Any> Record(): Record<K, V> =
    jso()

fun <K : Any, V : Any> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> =
    jso(block)
