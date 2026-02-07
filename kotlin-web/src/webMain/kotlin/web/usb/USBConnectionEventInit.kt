package web.usb

import kotlinx.js.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBConnectionEvent/USBConnectionEvent#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface USBConnectionEventInit :
    EventInit {
    var device: USBDevice
}
