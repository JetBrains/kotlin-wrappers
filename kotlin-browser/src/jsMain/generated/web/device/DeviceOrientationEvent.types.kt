// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.device

import seskar.js.JsValue
import web.events.EventType

sealed external interface DeviceOrientationEventTypes {
    @JsValue("deviceorientation")
    val DEVICE_ORIENTATION: EventType<DeviceOrientationEvent>
        get() = definedExternally
}
