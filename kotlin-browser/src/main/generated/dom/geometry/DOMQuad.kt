// Automatically generated - do not modify!

package dom.geometry

external class DOMQuad(
    p1: DOMPointInit = definedExternally,
    p2: DOMPointInit = definedExternally,
    p3: DOMPointInit = definedExternally,
    p4: DOMPointInit = definedExternally,
) {
    val p1: DOMPoint
    val p2: DOMPoint
    val p3: DOMPoint
    val p4: DOMPoint
    fun getBounds(): DOMRect
    fun toJSON(): Any

    companion object {
        fun fromQuad(other: DOMQuadInit = definedExternally): DOMQuad
        fun fromRect(other: DOMRectInit = definedExternally): DOMQuad
    }
}
