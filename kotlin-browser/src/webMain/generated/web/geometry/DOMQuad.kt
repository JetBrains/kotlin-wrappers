// Automatically generated - do not modify!

package web.geometry

import js.serialization.Serializable
import kotlin.js.JsAny
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
) : Serializable {
    /**
     * The **`DOMQuad`** interface's **`p1`** property holds the DOMPoint object that represents one of the four corners of the `DOMQuad`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p1)
     */
    val p1: DOMPoint

    /**
     * The **`DOMQuad`** interface's **`p2`** property holds the DOMPoint object that represents one of the four corners of the `DOMQuad`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p2)
     */
    val p2: DOMPoint

    /**
     * The **`DOMQuad`** interface's **`p3`** property holds the DOMPoint object that represents one of the four corners of the `DOMQuad`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p3)
     */
    val p3: DOMPoint

    /**
     * The **`DOMQuad`** interface's **`p4`** property holds the DOMPoint object that represents one of the four corners of the `DOMQuad`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p4)
     */
    val p4: DOMPoint

    /**
     * The DOMQuad method `getBounds()` returns a DOMRect object representing the smallest rectangle that fully contains the `DOMQuad` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/getBounds)
     */
    fun getBounds(): DOMRect

    /**
     * The DOMQuad method `toJSON()` returns a JSON representation of the `DOMQuad` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/toJSON)
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * The **`fromQuad()`** static method of the DOMQuad interface returns a new `DOMQuad` object based on the provided set of coordinates in the shape of another `DOMQuad` object.
         */
        fun fromQuad(other: DOMQuad = definedExternally): DOMQuad

        /**
         * The **`fromRect()`** static method of the DOMQuad interface returns a new `DOMQuad` object based on the provided set of coordinates in the shape of a DOMRect object.
         */
        fun fromRect(other: DOMRectReadOnly = definedExternally): DOMQuad
    }
}
