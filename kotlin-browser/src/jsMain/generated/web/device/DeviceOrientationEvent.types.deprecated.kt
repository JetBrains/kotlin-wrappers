// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.device

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface DeviceOrientationEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DeviceOrientationEvent.deviceOrientation()"),
    )
    @JsValue("deviceorientation")
    val DEVICE_ORIENTATION: EventType<DeviceOrientationEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DeviceOrientationEvent.deviceOrientationAbsolute()"),
    )
    @JsValue("deviceorientationabsolute")
    val DEVICE_ORIENTATION_ABSOLUTE: EventType<DeviceOrientationEvent<EventTarget>>
        get() = definedExternally
}
