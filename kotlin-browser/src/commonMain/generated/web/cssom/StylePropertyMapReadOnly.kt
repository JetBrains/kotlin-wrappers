// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray
import js.collections.MapLike
import js.collections.ReadonlySetLike
import js.core.JsString
import js.iterable.JsIterable

/**
 * The **`StylePropertyMapReadOnly`** interface of the CSS Typed Object Model API provides a read-only representation of a CSS declaration block that is an alternative to CSSStyleDeclaration.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly)
 */
sealed /* final */
external class StylePropertyMapReadOnly
protected /* private */ constructor() :
    MapLike<JsString, JsIterable<CSSStyleValue>>,
    ReadonlySetLike<JsString> {
    /**
     * The **`size`** read-only property of the containing the size of the `StylePropertyMapReadOnly` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/size)
     */
    override val size: Int

    /**
     * The **`get()`** method of the object for the first value of the specified property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/get)
     */
    fun get(property: String): CSSStyleValue?

    /**
     * The **`getAll()`** method of the ```js-nolint getAll(property) ``` - `property` - : The name of the property to retrieve all values of.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/getAll)
     */
    fun getAll(property: String): ReadonlyArray<CSSStyleValue>

    /**
     * The **`has()`** method of the property is in the `StylePropertyMapReadOnly` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/has)
     */
    override fun has(key: JsString): Boolean
}
