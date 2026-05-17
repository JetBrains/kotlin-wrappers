package js.objects

import js.array.ReadonlyArray
import js.array.Tuple2
import js.iterable.JsIterable
import js.symbol.Symbol

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object)
 */
external class Object
private constructor() {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwnProperty)
     */
    fun hasOwnProperty(
        v: String,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/isPrototypeOf)
     */
    fun isPrototypeOf(
        v: JsAny,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/propertyIsEnumerable)
     */
    fun propertyIsEnumerable(
        v: String,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/toLocaleString)
     */
    fun toLocaleString(): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/valueOf)
     */
    fun valueOf(): JsAny

    companion object {
        fun <T : JsAny, R : T> assign(
            dest: R,
            vararg src: T?,
        ): R

        fun <T : JsAny> create(
            o: T?,
            properties: PropertyDescriptorMap = definedExternally,
        ): T

        fun <T : JsAny> defineProperties(
            o: T,
            properties: PropertyDescriptorMap,
        ): T

        fun <T : JsAny, P : JsAny?> defineProperty(
            o: T,
            p: PropertyKey,
            attributes: TypedPropertyDescriptor<P>,
        ): T

        fun <T : JsAny, P : JsAny?> defineProperty(
            o: T,
            p: String,
            attributes: TypedPropertyDescriptor<P>,
        ): T

        fun <T : JsAny?> entries(
            o: ReadonlyRecord<JsString, T>,
        ): ReadonlyArray<Tuple2<JsString, T>>

        fun entries(
            o: JsAny,
        ): ReadonlyArray<Tuple2<JsString, JsAny?>>

        fun <R : JsAny?, T : R> freeze(
            o: T,
        ): R

        fun <T : JsAny?> fromEntries(
            entries: JsIterable<Tuple2<JsString, T>>,
        ): ReadonlyRecord<JsString, T>

        fun <T : JsAny?> fromEntries(
            entries: ReadonlyArray<Tuple2<JsString, T>>,
        ): ReadonlyRecord<JsString, T>

        fun <T : JsAny?> getOwnPropertyDescriptor(
            o: JsAny,
            p: PropertyKey,
        ): TypedPropertyDescriptor<T>?

        fun <T : JsAny?> getOwnPropertyDescriptor(
            o: JsAny,
            p: String,
        ): TypedPropertyDescriptor<T>?

        fun getOwnPropertyNames(
            o: JsAny,
        ): ReadonlyArray<JsString>

        fun getOwnPropertySymbols(
            o: JsAny,
        ): ReadonlyArray<Symbol>

        fun <P : JsAny, T : P> getPrototypeOf(
            o: T,
        ): P

        fun <T : JsAny, K : PropertyKey> groupBy(
            items: ReadonlyArray<T>,
            keySelector: (value: T, index: Int) -> K,
        ): ReadonlyRecord<K, ReadonlyArray<T>>

        fun hasOwn(
            o: JsAny,
            v: PropertyKey,
        ): Boolean

        fun hasOwn(
            o: JsAny,
            v: String,
        ): Boolean

        fun `is`(
            value1: JsAny?,
            value2: JsAny?,
        ): Boolean

        fun isExtensible(
            o: JsAny,
        ): Boolean

        fun isFrozen(
            o: JsAny,
        ): Boolean

        fun isSealed(
            o: JsAny,
        ): Boolean

        fun keys(
            o: JsAny,
        ): ReadonlyArray<JsString>

        fun <T : JsAny?> preventExtensions(
            o: T,
        ): T

        fun <T : JsAny?> seal(
            o: T,
        ): T

        fun <T : JsAny> setPrototypeOf(
            o: T,
            proto: JsAny?,
        ): T

        fun <T : JsAny> values(
            o: ReadonlyRecord<*, T>,
        ): ReadonlyArray<T>

        fun values(
            o: JsAny,
        ): ReadonlyArray<JsAny?>
    }
}
