package web.usb

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface USBTransferStatus

@ExperimentalWebApi
inline val USBTransferStatus.Companion.ok: USBTransferStatus
    get() = unsafeCast("ok")

@ExperimentalWebApi
inline val USBTransferStatus.Companion.stall: USBTransferStatus
    get() = unsafeCast("stall")

@ExperimentalWebApi
inline val USBTransferStatus.Companion.babble: USBTransferStatus
    get() = unsafeCast("babble")
