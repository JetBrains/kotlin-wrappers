// Automatically generated - do not modify!

package web.geometry

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

    val p1: DOMPoint
    val p2: DOMPoint
    val p3: DOMPoint
    val p4: DOMPoint
    fun getBounds(): DOMRect
    fun toJSON(): Any

    companion object {
        fun fromQuad(other: DOMQuadInit = definedExternally): DOMQuad
        fun fromRect(other: DOMRectInit = definedExternally): DOMQuad
        fun fromRect(other: DOMRectReadOnly /* DOMRectInit */): DOMQuad
    }
}
