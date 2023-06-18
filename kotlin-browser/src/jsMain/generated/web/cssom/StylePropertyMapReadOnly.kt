// Automatically generated - do not modify!

package web.cssom

import js.collections.MapLike
import js.core.JsIterable
import js.core.ReadonlyArray

sealed external class StylePropertyMapReadOnly :
    MapLike<String, JsIterable<CSSStyleValue>> {
    val size: Int
    operator fun get(property: String): CSSStyleValue?
    fun getAll(property: String): ReadonlyArray<CSSStyleValue>
    fun has(property: String): Boolean
}
