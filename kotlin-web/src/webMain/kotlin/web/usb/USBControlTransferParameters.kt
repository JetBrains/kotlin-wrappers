package web.usb

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface USBControlTransferParameters {
    var requestType: USBRequestType
    var recipient: USBRecipient
    var request: Short /* unsigned byte */
    var value: Short /* unsigned short */
    var index: Short /* unsigned short */
}
