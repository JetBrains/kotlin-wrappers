// Automatically generated - do not modify!

package web.geometry

import js.core.JsAny
import kotlin.js.definedExternally

/**
 * A `DOMQuad` is a collection of four `DOMPoint`s defining the corners of an arbitrary quadrilateral.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad)
 */
open external class DOMQuad(
    p1: DOMPointReadOnly = definedExternally,
    p2: DOMPointReadOnly = definedExternally,
    p3: DOMPointReadOnly = definedExternally,
    p4: DOMPointReadOnly = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p1)
     */
    val p1: DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p2)
     */
    val p2: DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p3)
     */
    val p3: DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p4)
     */
    val p4: DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/getBounds)
     */
    fun getBounds(): DOMRect

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/toJSON)
     */
    fun toJSON(): JsAny

    companion object {
        fun fromQuad(other: DOMQuad = definedExternally): DOMQuad
        fun fromRect(other: DOMRectReadOnly = definedExternally): DOMQuad
    }
}
