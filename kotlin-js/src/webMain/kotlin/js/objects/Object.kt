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
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/assign)
         */
        fun <T : JsAny, R : T> assign(
            dest: R,
            vararg src: T?,
        ): R

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/create)
         */
        fun <T : JsAny> create(
            o: T?,
            properties: PropertyDescriptorMap = definedExternally,
        ): T

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/defineProperties)
         */
        fun <T : JsAny> defineProperties(
            o: T,
            properties: PropertyDescriptorMap,
        ): T

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/defineProperty)
         */
        fun <T : JsAny, P : JsAny?> defineProperty(
            o: T,
            p: PropertyKey,
            attributes: TypedPropertyDescriptor<P>,
        ): T

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/defineProperty)
         */
        fun <T : JsAny, P : JsAny?> defineProperty(
            o: T,
            p: String,
            attributes: TypedPropertyDescriptor<P>,
        ): T

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/entries)
         */
        fun <T : JsAny?> entries(
            o: ReadonlyRecord<JsString, T>,
        ): ReadonlyArray<Tuple2<JsString, T>>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/entries)
         */
        fun entries(
            o: JsAny,
        ): ReadonlyArray<Tuple2<JsString, JsAny?>>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/freeze)
         */
        fun <R : JsAny?, T : R> freeze(
            o: T,
        ): R

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/fromEntries)
         */
        fun <T : JsAny?> fromEntries(
            entries: JsIterable<Tuple2<JsString, T>>,
        ): ReadonlyRecord<JsString, T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/fromEntries)
         */
        fun <T : JsAny?> fromEntries(
            entries: ReadonlyArray<Tuple2<JsString, T>>,
        ): ReadonlyRecord<JsString, T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/getOwnPropertyDescriptor)
         */
        fun <T : JsAny?> getOwnPropertyDescriptor(
            o: JsAny,
            p: PropertyKey,
        ): TypedPropertyDescriptor<T>?

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/getOwnPropertyDescriptor)
         */
        fun <T : JsAny?> getOwnPropertyDescriptor(
            o: JsAny,
            p: String,
        ): TypedPropertyDescriptor<T>?

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/getOwnPropertyNames)
         */
        fun getOwnPropertyNames(
            o: JsAny,
        ): ReadonlyArray<JsString>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/getOwnPropertySymbols)
         */
        fun getOwnPropertySymbols(
            o: JsAny,
        ): ReadonlyArray<Symbol>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/getPrototypeOf)
         */
        fun <P : JsAny, T : P> getPrototypeOf(
            o: T,
        ): P

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/groupBy)
         */
        fun <T : JsAny, K : PropertyKey> groupBy(
            items: ReadonlyArray<T>,
            keySelector: (value: T, index: Int) -> K,
        ): ReadonlyRecord<K, ReadonlyArray<T>>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwn)
         */
        fun hasOwn(
            o: JsAny,
            v: PropertyKey,
        ): Boolean

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwn)
         */
        fun hasOwn(
            o: JsAny,
            v: String,
        ): Boolean

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/`)
         */
        fun `is`(
            value1: JsAny?,
            value2: JsAny?,
        ): Boolean

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/isExtensible)
         */
        fun isExtensible(
            o: JsAny,
        ): Boolean

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/isFrozen)
         */
        fun isFrozen(
            o: JsAny,
        ): Boolean

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/isSealed)
         */
        fun isSealed(
            o: JsAny,
        ): Boolean

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/keys)
         */
        fun keys(
            o: JsAny,
        ): ReadonlyArray<JsString>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/preventExtensions)
         */
        fun <T : JsAny?> preventExtensions(
            o: T,
        ): T

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/seal)
         */
        fun <T : JsAny?> seal(
            o: T,
        ): T

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/setPrototypeOf)
         */
        fun <T : JsAny> setPrototypeOf(
            o: T,
            proto: JsAny?,
        ): T

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/values)
         */
        fun <T : JsAny> values(
            o: ReadonlyRecord<*, T>,
        ): ReadonlyArray<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/values)
         */
        fun values(
            o: JsAny,
        ): ReadonlyArray<JsAny?>
    }
}
