package web.usb

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface USBEndpointType

@ExperimentalWebApi
inline val USBEndpointType.Companion.bulk: USBEndpointType
    get() = unsafeCast("bulk")

@ExperimentalWebApi
inline val USBEndpointType.Companion.interrupt: USBEndpointType
    get() = unsafeCast("interrupt")

@ExperimentalWebApi
inline val USBEndpointType.Companion.isochronous: USBEndpointType
    get() = unsafeCast("isochronous")
