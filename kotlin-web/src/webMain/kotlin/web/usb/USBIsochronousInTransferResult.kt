package web.usb

import js.array.ReadonlyArray
import js.buffer.DataView
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousInTransferResult)
 */
@ExperimentalWebApi
open external class USBIsochronousInTransferResult(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousInTransferResult/status)
     */
    val packets: ReadonlyArray<USBIsochronousInTransferPacket>,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBIsochronousInTransferResult/data)
     */
    val data: DataView<*>? = definedExternally,
)
