@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.usb

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface USBRecipient {
    companion object
}

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
