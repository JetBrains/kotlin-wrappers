package web.usb

import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint)
 */
@ExperimentalWebApi
open external class USBEndpoint(
    alternate: USBAlternateInterface,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint/endpointNumber)
     */
    open val endpointNumber: Short,
    /* unsigned byte */
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint/configuration)
     */
    open val direction: USBDirection,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint/type)
     */
    open val type: USBEndpointType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint/packetSize)
     */
    open val packetSize: Int
}
