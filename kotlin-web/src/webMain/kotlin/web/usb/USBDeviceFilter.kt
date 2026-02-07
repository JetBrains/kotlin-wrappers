package web.usb

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface USBDeviceFilter {
    var vendorId: Short? /* unsigned short */
    var productId: Short? /* unsigned short */
    var classCode: Short? /* unsigned byte */
    var subclassCode: Short? /* unsigned byte */
    var protocolCode: Short? /* unsigned byte */
    var serialNumber: String?
}
