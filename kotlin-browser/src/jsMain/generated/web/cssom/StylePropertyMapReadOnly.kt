// Automatically generated - do not modify!

package web.cssom

import js.core.ReadonlyArray

sealed external class StylePropertyMapReadOnly {
    val size: Int
    operator fun get(property: String): CSSStyleValue?
    fun getAll(property: String): ReadonlyArray<CSSStyleValue>
    fun has(property: String): Boolean
    fun forEach(action: (item: ReadonlyArray<CSSStyleValue>) -> Unit)
}
