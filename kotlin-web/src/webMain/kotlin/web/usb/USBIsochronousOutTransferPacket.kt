package web.usb

import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousOutTransferPacket)
 */
@ExperimentalWebApi
open external class USBIsochronousOutTransferPacket(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousOutTransferPacket/status)
     */
    val status: USBTransferStatus,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousOutTransferPacket/data)
     */
    bytesWritten: Int = definedExternally,
)
