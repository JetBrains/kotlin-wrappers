package kotlinx.js

sealed external interface HasSymbol {
    interface asyncIterator<V>
    interface hasInstance<V>
    interface isConcatSpreadable<V>
    interface iterator<V>
    interface match<V>
    interface matchAll<V>
    interface replace<V>
    interface search<V>
    interface species<V>
    interface split<V>
    interface toPrimitive<V>
    interface toStringTag<V>
    interface unscopables<V>
}

inline operator fun <V> HasSymbol.asyncIterator<V>.get(
    key: Symbol.asyncIterator,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.hasInstance<V>.get(
    key: Symbol.hasInstance,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.isConcatSpreadable<V>.get(
    key: Symbol.isConcatSpreadable,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.iterator<V>.get(
    key: Symbol.iterator,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.match<V>.get(
    key: Symbol.match,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.matchAll<V>.get(
    key: Symbol.matchAll,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.replace<V>.get(
    key: Symbol.replace,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.search<V>.get(
    key: Symbol.search,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.species<V>.get(
    key: Symbol.species,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.split<V>.get(
    key: Symbol.split,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.toPrimitive<V>.get(
    key: Symbol.toPrimitive,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.toStringTag<V>.get(
    key: Symbol.toStringTag,
): V =
    asDynamic()[key]

inline operator fun <V> HasSymbol.unscopables<V>.get(
    key: Symbol.unscopables,
): V =
    asDynamic()[key]
