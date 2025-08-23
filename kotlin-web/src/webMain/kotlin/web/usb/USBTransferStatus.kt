@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.usb

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface USBTransferStatus {
    companion object
}

@ExperimentalWebApi
inline val USBTransferStatus.Companion.ok: USBTransferStatus
    get() = unsafeCast("ok")

@ExperimentalWebApi
inline val USBTransferStatus.Companion.stall: USBTransferStatus
    get() = unsafeCast("stall")

@ExperimentalWebApi
inline val USBTransferStatus.Companion.babble: USBTransferStatus
    get() = unsafeCast("babble")
