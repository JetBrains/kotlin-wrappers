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
    open val alternateSetting: Short,
    /* unsigned byte */
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceClass)
     */
    open val interfaceClass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceSubclass)
     */
    open val interfaceSubclass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceProtocol)
     */
    open val interfaceProtocol: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/interfaceName)
     */
    open val interfaceName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBAlternateInterface/endpoints)
     */
    open val endpoints: ReadonlyArray<USBEndpoint>
}
