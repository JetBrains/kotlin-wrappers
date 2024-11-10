// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray
import js.collections.MapLike
import js.collections.ReadonlySetLike
import js.iterable.JsIterable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly)
 */
sealed /* final */
external class StylePropertyMapReadOnly
private constructor() :
    MapLike<String, JsIterable<CSSStyleValue>>,
    ReadonlySetLike<String> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/size)
     */
    override val size: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/get)
     */
    operator fun get(property: String): CSSStyleValue?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/getAll)
     */
    fun getAll(property: String): ReadonlyArray<CSSStyleValue>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/has)
     */
    override fun has(key: String): Boolean
}
