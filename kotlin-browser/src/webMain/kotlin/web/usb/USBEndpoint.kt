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
    val endpointNumber: Short,
    /* unsigned byte */
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint/configuration)
     */
    val direction: USBDirection,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint/type)
     */
    val type: USBEndpointType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBEndpoint/packetSize)
     */
    val packetSize: Int
}
