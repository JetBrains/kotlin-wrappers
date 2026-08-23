// Automatically generated - do not modify!

package web.serial

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.bluetooth.BluetoothServiceUUID

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/requestPort#options)
 */
@JsPlainObject
external interface SerialPortRequestOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/requestPort#allowedbluetoothserviceclassids)
     */
    var allowedBluetoothServiceClassIds: ReadonlyArray<BluetoothServiceUUID>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/requestPort#filters)
     */
    var filters: ReadonlyArray<SerialPortFilter>?
}
