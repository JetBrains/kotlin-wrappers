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
    open val configuration: USBConfiguration,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/interfaceNumber)
     */
    open val interfaceNumber: Short,
    /* unsigned byte */
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/alternate)
     */
    open val alternate: USBAlternateInterface

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/alternates)
     */
    open val alternates: ReadonlyArray<USBAlternateInterface>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBInterface/claimed)
     */
    open val claimed: Boolean
}
