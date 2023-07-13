@file:Suppress(
    "DEPRECATION",
    "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    "NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.reflect

import js.core.Symbol

external interface HasInstanceSymbolHolder {
    @nativeGetter
    operator fun get(
        key: Symbol.hasInstance,
    ): HasInstance = definedExternally
}
