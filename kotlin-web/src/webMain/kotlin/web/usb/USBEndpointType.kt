@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.usb

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName

@ExperimentalWebApi
@JsName("NaN")
sealed external interface USBEndpointType {
    companion object
}

@ExperimentalWebApi
inline val USBEndpointType.Companion.bulk: USBEndpointType
    get() = unsafeCast("bulk")

@ExperimentalWebApi
inline val USBEndpointType.Companion.interrupt: USBEndpointType
    get() = unsafeCast("interrupt")

@ExperimentalWebApi
inline val USBEndpointType.Companion.isochronous: USBEndpointType
    get() = unsafeCast("isochronous")
