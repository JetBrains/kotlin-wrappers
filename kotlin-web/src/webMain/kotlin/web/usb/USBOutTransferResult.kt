package web.usb

import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBOutTransferResult)
 */
@ExperimentalWebApi
open external class USBOutTransferResult(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBOutTransferResult/status)
     */
    val status: USBTransferStatus,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBOutTransferResult/data)
     */
    bytesWritten: Int = definedExternally,
)
