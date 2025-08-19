package web.usb

import js.array.ReadonlyArray
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface)
 */
@ExperimentalWebApi
open external class USBInterface(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/configuration)
     */
    val configuration: USBConfiguration,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/interfaceNumber)
     */
    val interfaceNumber: Short,
    /* unsigned byte */
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/alternate)
     */
    val alternate: USBAlternateInterface

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/alternates)
     */
    val alternates: ReadonlyArray<USBAlternateInterface>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/claimed)
     */
    val claimed: Boolean
}
