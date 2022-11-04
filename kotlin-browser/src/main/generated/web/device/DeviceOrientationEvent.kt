// Automatically generated - do not modify!

package web.device

import web.events.Event
import web.events.EventInit

external interface DeviceOrientationEventInit : EventInit {
    var absolute: Boolean?
    var alpha: Double?
    var beta: Double?
    var gamma: Double?
}

open external class DeviceOrientationEvent(
    type: String,
    init: DeviceOrientationEventInit = definedExternally,
) : Event {
    val absolute: Boolean
    val alpha: Double?
    val beta: Double?
    val gamma: Double?

    companion object
}
