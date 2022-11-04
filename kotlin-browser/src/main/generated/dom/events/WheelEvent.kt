// Automatically generated - do not modify!

package dom.events

external interface WheelEventInit : MouseEventInit {
    var deltaMode: Short?
    var deltaX: Double?
    var deltaY: Double?
    var deltaZ: Double?
}

open external class WheelEvent(
    type: String,
    init: WheelEventInit = definedExternally,
) : MouseEvent {
    val deltaMode: Short
    val deltaX: Double
    val deltaY: Double
    val deltaZ: Double
    val DOM_DELTA_LINE: Short
    val DOM_DELTA_PAGE: Short
    val DOM_DELTA_PIXEL: Short

    companion object {
        val DOM_DELTA_LINE: Short
        val DOM_DELTA_PAGE: Short
        val DOM_DELTA_PIXEL: Short
    }
}
