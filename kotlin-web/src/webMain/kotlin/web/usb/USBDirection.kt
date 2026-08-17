package web.usb

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface USBDirection

@ExperimentalWebApi
inline val USBDirection.Companion.`in`: USBDirection
    get() = unsafeCast("in")

@ExperimentalWebApi
inline val USBDirection.Companion.out: USBDirection
    get() = unsafeCast("out")
