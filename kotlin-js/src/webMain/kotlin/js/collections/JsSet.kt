package js.collections

import js.array.ReadonlyArray
import js.array.Tuple2
import js.iterable.JsIterable
import js.iterable.JsIterator
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set)
 */
@JsName("Set")
open external class JsSet<T : JsAny?>(
    values: JsIterable<T> = definedExternally,
) : MutableSetLike.Mixin<T>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/Set)
     */
    constructor(values: ReadonlyArray<T>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size)
     */
    override val size: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/add)
     */
    override fun add(value: T)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/clear)
     */
    override fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/delete)
     */
    override fun delete(value: T): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/difference)
     */
    fun difference(other: ReadonlySetLike<T>): JsSet<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/entries)
     */
    override fun entries(): JsIterator<Tuple2<T, T>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach)
     */
    override fun forEach(action: (value: T) -> Unit)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has)
     */
    override fun has(key: T): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/intersection)
     */
    fun intersection(other: ReadonlySetLike<T>): JsSet<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/isDisjointFrom)
     */
    fun isDisjointFrom(other: ReadonlySetLike<T>): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/isSubsetOf)
     */
    fun isSubsetOf(other: ReadonlySetLike<T>): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/isSupersetOf)
     */
    fun isSupersetOf(other: ReadonlySetLike<T>): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/keys)
     */
    override fun keys(): JsIterator<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/symmetricDifference)
     */
    fun symmetricDifference(other: ReadonlySetLike<T>): JsSet<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/union)
     */
    fun union(other: ReadonlySetLike<T>): JsSet<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/values)
     */
    override fun values(): JsIterator<T>
}
