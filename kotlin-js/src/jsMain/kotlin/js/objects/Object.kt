package js.objects

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.iterable.JsIterable
import js.symbol.Symbol

external class Object internal constructor() {
    fun hasOwnProperty(v: String): Boolean
    fun isPrototypeOf(v: Any): Boolean
    fun propertyIsEnumerable(v: String): Boolean
    fun toLocaleString(): String
    fun valueOf(): Any

    companion object {
        fun <T : Any, R : T> assign(dest: R, vararg src: T?): R
        fun <T : Any> create(o: T?, properties: PropertyDescriptorMap = definedExternally): T
        fun <T : Any> defineProperties(o: T, properties: PropertyDescriptorMap): T
        fun <T : Any, P> defineProperty(o: T, p: PropertyKey, attributes: TypedPropertyDescriptor<P>): T
        fun <T : Any?> entries(o: ReadonlyRecord<String, T>): ReadonlyArray<JsTuple2<String, T>>
        fun entries(o: Any): ReadonlyArray<JsTuple2<String, Any?>>
        fun <R, T : R> freeze(o: T): R
        fun <T> fromEntries(entries: JsIterable<JsTuple2<String, T>>): ReadonlyRecord<String, T>
        fun <T> fromEntries(entries: ReadonlyArray<JsTuple2<String, T>>): ReadonlyRecord<String, T>
        fun <T> getOwnPropertyDescriptor(o: Any, p: PropertyKey): TypedPropertyDescriptor<T>?
        fun getOwnPropertyNames(o: Any): ReadonlyArray<String>
        fun getOwnPropertySymbols(o: Any): ReadonlyArray<Symbol>
        fun <P : Any, T : P> getPrototypeOf(o: T): P

        fun <T : Any, K : PropertyKey> groupBy(
            items: ReadonlyArray<T>,
            keySelector: (value: T, index: Int) -> K,
        ): ReadonlyRecord<K, ReadonlyArray<T>>

        fun hasOwn(o: Any, v: PropertyKey): Boolean
        fun `is`(value1: Any?, value2: Any?): Boolean
        fun isExtensible(o: Any): Boolean
        fun isFrozen(o: Any): Boolean
        fun isSealed(o: Any): Boolean
        fun keys(o: Any): ReadonlyArray<String>
        fun <T> preventExtensions(o: T): T
        fun <T> seal(o: T): T
        fun <T : Any> setPrototypeOf(o: T, proto: Any?): T
        fun <T : Any> values(o: ReadonlyRecord<*, T>): ReadonlyArray<T>
        fun values(o: Any): ReadonlyArray<Any?>
    }
}
