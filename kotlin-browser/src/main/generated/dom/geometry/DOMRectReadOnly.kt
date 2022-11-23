// Automatically generated - do not modify!

package dom.geometry

open external class DOMRectReadOnly(
    x: Number = definedExternally,
    y: Number = definedExternally,
    width: Number = definedExternally,
    height: Number = definedExternally,
) {
    open val bottom: Double
    open val height: Double
    open val left: Double
    open val right: Double
    open val top: Double
    open val width: Double
    open val x: Double
    open val y: Double
    fun toJSON(): Any

    companion object {
        fun fromRect(other: DOMRectInit = definedExternally): DOMRectReadOnly
    }
}
