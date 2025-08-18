@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.usb

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface USBDirection {
    companion object
}

@ExperimentalWebApi
inline val USBDirection.Companion.`in`: USBDirection
    get() = unsafeCast("in")

@ExperimentalWebApi
inline val USBDirection.Companion.out: USBDirection
    get() = unsafeCast("out")
