// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.EventType

external interface WheelEventInit : MouseEventInit {
    var deltaMode: Short?
    var deltaX: Double?
    var deltaY: Double?
    var deltaZ: Double?
}

open external class WheelEvent(
    override val type: EventType<WheelEvent>,
    init: WheelEventInit = definedExternally,
) : MouseEvent {
    val deltaMode: Short
    val deltaX: Double
    val deltaY: Double
    val deltaZ: Double
    val DOM_DELTA_PIXEL: Short
    val DOM_DELTA_LINE: Short
    val DOM_DELTA_PAGE: Short

    companion object {
        val DOM_DELTA_PIXEL: Short
        val DOM_DELTA_LINE: Short
        val DOM_DELTA_PAGE: Short
    }
}
