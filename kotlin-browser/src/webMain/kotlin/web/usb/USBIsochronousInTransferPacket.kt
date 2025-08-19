package web.usb

import js.buffer.DataView
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousInTransferPacket)
 */
@ExperimentalWebApi
open external class USBIsochronousInTransferPacket(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousInTransferPacket/status)
     */
    val status: USBTransferStatus,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousInTransferPacket/data)
     */
    val data: DataView<*>? = definedExternally,
)
