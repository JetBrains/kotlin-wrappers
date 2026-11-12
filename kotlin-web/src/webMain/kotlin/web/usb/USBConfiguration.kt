package web.usb

import js.array.ReadonlyArray
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBConfiguration)
 */
@ExperimentalWebApi
open external class USBConfiguration(
    device: USBDevice,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBConfiguration/configurationValue)
     */
    open val configurationValue: Short,
    /* unsigned byte */
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBConfiguration/configurationName)
     */
    open val configurationName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBConfiguration/interfaces)
     */
    open val interfaces: ReadonlyArray<USBInterface>
}
