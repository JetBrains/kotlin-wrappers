// Automatically generated - do not modify!

package web.cssom

import js.collections.MapLike
import js.core.ReadonlyArray
import js.iterable.JsIterable

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly) */
sealed external class StylePropertyMapReadOnly :
    MapLike<String, JsIterable<CSSStyleValue>> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/size) */
    val size: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/get) */
    operator fun get(property: String): CSSStyleValue?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/getAll) */
    fun getAll(property: String): ReadonlyArray<CSSStyleValue>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/has) */
    fun has(property: String): Boolean
}
