package web.usb

import js.array.ReadonlyArray
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface)
 */
@ExperimentalWebApi
open external class USBAlternateInterface(
    deviceInterface: USBInterface,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/alternateSetting)
     */
    val alternateSetting: Short,
    /* unsigned byte */
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceClass)
     */
    val interfaceClass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceSubclass)
     */
    val interfaceSubclass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceProtocol)
     */
    val interfaceProtocol: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceName)
     */
    val interfaceName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/endpoints)
     */
    val endpoints: ReadonlyArray<USBEndpoint>
}
