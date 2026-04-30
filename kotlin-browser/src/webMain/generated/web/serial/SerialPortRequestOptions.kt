// Automatically generated - do not modify!

package web.serial

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.bluetooth.BluetoothServiceUUID

@JsPlainObject
external interface SerialPortRequestOptions {
    var allowedBluetoothServiceClassIds: ReadonlyArray<BluetoothServiceUUID>?
    var filters: ReadonlyArray<SerialPortFilter>?
}
