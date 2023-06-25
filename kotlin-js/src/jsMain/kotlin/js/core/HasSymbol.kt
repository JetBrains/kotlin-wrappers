@file:Suppress(
    "DEPRECATION",
    "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    "NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.core

sealed external interface HasSymbol {
    interface asyncIterator<out V : Function<AsyncIterator<*>>> {
        @nativeGetter
        operator fun get(
            key: Symbol.asyncIterator,
        ): V = definedExternally
    }

    interface hasInstance<out V : HasInstance> {
        @nativeGetter
        operator fun get(
            key: Symbol.hasInstance,
        ): V = definedExternally
    }

    interface isConcatSpreadable {
        @nativeGetter
        operator fun get(
            key: Symbol.isConcatSpreadable,
        ): Boolean = definedExternally
    }

    interface iterator<out V : Function<JsIterator<*>>> {
        @nativeGetter
        operator fun get(
            key: Symbol.iterator,
        ): V = definedExternally
    }

    interface match<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.match,
        ): V = definedExternally
    }

    interface matchAll<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.matchAll,
        ): V = definedExternally
    }

    interface replace<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.replace,
        ): V = definedExternally
    }

    interface search<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.search,
        ): V = definedExternally
    }

    interface species<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.species,
        ): V = definedExternally
    }

    interface split<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.split,
        ): V = definedExternally
    }

    interface toPrimitive<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.toPrimitive,
        ): V = definedExternally
    }

    interface toStringTag<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.toStringTag,
        ): V = definedExternally
    }

    interface unscopables<out V> {
        @nativeGetter
        operator fun get(
            key: Symbol.unscopables,
        ): V = definedExternally
    }
}
