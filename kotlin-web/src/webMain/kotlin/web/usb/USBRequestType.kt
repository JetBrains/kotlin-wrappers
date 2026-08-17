package web.usb

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface USBRequestType

@ExperimentalWebApi
inline val USBRequestType.Companion.standard: USBRequestType
    get() = unsafeCast("standard")

@ExperimentalWebApi
inline val USBRequestType.Companion.`class`: USBRequestType
    get() = unsafeCast("class")

@ExperimentalWebApi
inline val USBRequestType.Companion.vendor: USBRequestType
    get() = unsafeCast("vendor")
