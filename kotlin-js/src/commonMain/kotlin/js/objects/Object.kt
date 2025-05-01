package js.objects

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsAny
import js.core.JsString
import js.iterable.JsIterable
import js.symbol.Symbol
import kotlin.js.definedExternally

external class Object
private constructor() {

    fun hasOwnProperty(v: String): Boolean
    fun isPrototypeOf(v: JsAny): Boolean
    fun propertyIsEnumerable(v: String): Boolean
    fun toLocaleString(): String
    fun valueOf(): JsAny

    companion object {
        fun <T : JsAny, R : T> assign(dest: R, vararg src: T?): R
        fun <T : JsAny> create(o: T?, properties: PropertyDescriptorMap = definedExternally): T
        fun <T : JsAny> defineProperties(o: T, properties: PropertyDescriptorMap): T
        fun <T : JsAny, P : JsAny?> defineProperty(o: T, p: PropertyKey, attributes: TypedPropertyDescriptor<P>): T
        fun <T : JsAny?> entries(o: ReadonlyRecord<JsString, T>): ReadonlyArray<Tuple2<JsString, T>>
        fun entries(o: JsAny): ReadonlyArray<Tuple2<JsString, JsAny?>>
        fun <R : JsAny?, T : R> freeze(o: T): R
        fun <T : JsAny?> fromEntries(entries: JsIterable<Tuple2<JsString, T>>): ReadonlyRecord<JsString, T>
        fun <T : JsAny?> fromEntries(entries: ReadonlyArray<Tuple2<JsString, T>>): ReadonlyRecord<JsString, T>
        fun <T : JsAny?> getOwnPropertyDescriptor(o: JsAny, p: PropertyKey): TypedPropertyDescriptor<T>?
        fun getOwnPropertyNames(o: JsAny): ReadonlyArray<JsString>
        fun getOwnPropertySymbols(o: JsAny): ReadonlyArray<Symbol>
        fun <P : JsAny, T : P> getPrototypeOf(o: T): P

        fun <T : JsAny, K : PropertyKey> groupBy(
            items: ReadonlyArray<T>,
            keySelector: (value: T, index: Int) -> K,
        ): ReadonlyRecord<K, ReadonlyArray<T>>

        fun hasOwn(o: JsAny, v: PropertyKey): Boolean
        fun `is`(value1: JsAny?, value2: JsAny?): Boolean
        fun isExtensible(o: JsAny): Boolean
        fun isFrozen(o: JsAny): Boolean
        fun isSealed(o: JsAny): Boolean
        fun keys(o: JsAny): ReadonlyArray<JsString>
        fun <T : JsAny?> preventExtensions(o: T): T
        fun <T : JsAny?> seal(o: T): T
        fun <T : JsAny> setPrototypeOf(o: T, proto: JsAny?): T
        fun <T : JsAny> values(o: ReadonlyRecord<*, T>): ReadonlyArray<T>
        fun values(o: JsAny): ReadonlyArray<JsAny?>
    }
}
