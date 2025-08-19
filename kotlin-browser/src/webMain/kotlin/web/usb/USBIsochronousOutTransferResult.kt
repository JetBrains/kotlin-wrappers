package web.usb

import js.array.ReadonlyArray
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousOutTransferResult)
 */
@ExperimentalWebApi
open external class USBIsochronousOutTransferResult(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousOutTransferResult/status)
     */
    val packets: ReadonlyArray<USBIsochronousOutTransferPacket>,
)
