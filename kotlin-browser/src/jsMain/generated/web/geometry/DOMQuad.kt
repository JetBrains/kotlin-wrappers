// Automatically generated - do not modify!

package web.geometry

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad) */
external class DOMQuad(
    p1: DOMPointInit = definedExternally,
    p2: DOMPointInit = definedExternally,
    p3: DOMPointInit = definedExternally,
    p4: DOMPointInit = definedExternally,
) {
    constructor(
        p1: DOMPointReadOnly, /* DOMPointInit */
        p2: DOMPointReadOnly, /* DOMPointInit */
        p3: DOMPointReadOnly, /* DOMPointInit */
        p4: DOMPointReadOnly, /* DOMPointInit */
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p1) */
    val p1: DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p2) */
    val p2: DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p3) */
    val p3: DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p4) */
    val p4: DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/getBounds) */
    fun getBounds(): DOMRect
    fun toJSON(): Any

    companion object {
        fun fromQuad(other: DOMQuadInit = definedExternally): DOMQuad
        fun fromRect(other: DOMRectInit = definedExternally): DOMQuad
        fun fromRect(other: DOMRectReadOnly /* DOMRectInit */): DOMQuad
    }
}
