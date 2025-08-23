package web.usb

import js.buffer.DataView
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInTransferResult)
 */
@ExperimentalWebApi
open external class USBInTransferResult(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInTransferResult/status)
     */
    val status: USBTransferStatus,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInTransferResult/data)
     */
    val data: DataView<*>? = definedExternally,
)
