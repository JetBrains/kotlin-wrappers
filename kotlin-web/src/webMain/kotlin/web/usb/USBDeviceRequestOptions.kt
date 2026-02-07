package web.usb

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface USBDeviceRequestOptions {
    var filters: ReadonlyArray<USBDeviceFilter>
    var exclusionFilters: ReadonlyArray<USBDeviceFilter>?
}
