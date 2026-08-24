// Automatically generated - do not modify!

package web.serial

import kotlinx.js.JsPlainObject
import web.bluetooth.BluetoothServiceUUID

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/getInfo#return_value)
 */
@JsPlainObject
external interface SerialPortInfo {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/getInfo#bluetoothserviceclassid)
     */
    var bluetoothServiceClassId: BluetoothServiceUUID?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/getInfo#usbproductid)
     */
    var usbProductId: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/getInfo#usbvendorid)
     */
    var usbVendorId: Short?
}
