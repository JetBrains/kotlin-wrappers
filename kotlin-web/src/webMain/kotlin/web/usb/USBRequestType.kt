@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.usb

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface USBRequestType {
    companion object
}

@ExperimentalWebApi
inline val USBRequestType.Companion.standard: USBRequestType
    get() = unsafeCast("standard")

@ExperimentalWebApi
inline val USBRequestType.Companion.`class`: USBRequestType
    get() = unsafeCast("class")

@ExperimentalWebApi
inline val USBRequestType.Companion.vendor: USBRequestType
    get() = unsafeCast("vendor")
