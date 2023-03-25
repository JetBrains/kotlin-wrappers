@file:Suppress(
    "DEPRECATION",
    "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.core

external interface ReadonlyRecord<K : Any, out V : Any> {
    @nativeGetter
    operator fun get(
        key: K,
    ): V? = definedExternally
}
