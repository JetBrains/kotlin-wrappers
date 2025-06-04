// Automatically generated - do not modify!

package web.dom

import js.array.Tuple2
import js.collections.ListLike
import js.core.JsAny
import js.core.JsInt
import js.iterable.JsIterator
import kotlin.js.definedExternally

/**
 * The **`DOMTokenList`** interface represents a set of space-separated tokens.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList)
 */
external class DOMTokenList<T : JsAny>
private constructor() :
    ListLike<T> {
    /**
     * The read-only **`length`** property of the DOMTokenList interface is an `integer` representing the number of objects stored in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/length)
     */
    override val length: Int

    /**
     * The **`value`** property of the DOMTokenList interface is a stringifier that returns the value of the list serialized as a string, or clears and sets the list to the given value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/value)
     */
    var value: T

    /**
     * The **`add()`** method of the DOMTokenList interface adds the given tokens to the list, omitting any that are already present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/add)
     */
    fun add(vararg tokens: T)

    /**
     * The **`contains()`** method of the DOMTokenList interface returns a boolean value — `true` if the underlying list contains the given token, otherwise `false`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/contains)
     */
    fun contains(token: T): Boolean

    /**
     * The **`item()`** method of the DOMTokenList interface returns an item in the list, determined by its position in the list, its index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/item)
     */
    fun item(index: Int): T?

    /**
     * The **`remove()`** method of the DOMTokenList interface removes the specified _tokens_ from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/remove)
     */
    fun remove(vararg tokens: T)

    /**
     * The **`replace()`** method of the DOMTokenList interface replaces an existing token with a new token.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/replace)
     */
    fun replace(
        token: T,
        newToken: T,
    ): Boolean

    /**
     * The **`supports()`** method of the DOMTokenList interface returns `true` if a given `token` is in the associated attribute's supported tokens.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/supports)
     */
    fun supports(token: T): Boolean

    /**
     * The **`toggle()`** method of the DOMTokenList interface removes an existing token from the list and returns `false`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/toggle)
     */
    fun toggle(
        token: T,
        force: Boolean = definedExternally,
    ): Boolean

    override fun entries(): JsIterator<Tuple2<JsInt, T>>
    override fun keys(): JsIterator<JsInt>
    override fun values(): JsIterator<T>
    override fun forEach(action: (item: T) -> Unit)
}
