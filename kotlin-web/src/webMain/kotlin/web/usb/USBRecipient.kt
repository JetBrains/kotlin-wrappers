package web.usb

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface USBRecipient

@ExperimentalWebApi
inline val USBRecipient.Companion.device: USBRecipient
    get() = unsafeCast("device")

@ExperimentalWebApi
inline val USBRecipient.Companion.`interface`: USBRecipient
    get() = unsafeCast("interface")

@ExperimentalWebApi
inline val USBRecipient.Companion.endpoint: USBRecipient
    get() = unsafeCast("endpoint")

@ExperimentalWebApi
inline val USBRecipient.Companion.other: USBRecipient
    get() = unsafeCast("other")
