// Automatically generated - do not modify!

package web.serial

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Serial`** interface of the Web Serial API provides attributes and methods for finding and connecting to serial ports from a web page.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial)
 */
open external class Serial
private constructor() :
    EventTarget {
    /**
     * The **`getPorts()`** method of the Serial interface returns a Promise that resolves with an array of SerialPort objects representing serial ports connected to the host which the origin has permission to access.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/getPorts)
     */
    @JsName("getPorts")
    fun getPortsAsync(): Promise<ReadonlyArray<SerialPort>>

    /**
     * The **`Serial.requestPort()`** method of the Serial interface presents the user with a dialog asking them to select a serial device to connect to. It returns a Promise that resolves with an instance of SerialPort representing the device chosen by the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/requestPort)
     */
    @JsName("requestPort")
    fun requestPortAsync(options: SerialPortRequestOptions = definedExternally): Promise<SerialPort>
}

/**
 * The **`getPorts()`** method of the Serial interface returns a Promise that resolves with an array of SerialPort objects representing serial ports connected to the host which the origin has permission to access.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/getPorts)
 */
suspend inline fun Serial.getPorts(): ReadonlyArray<SerialPort> {
    return getPortsAsync().await()
}

/**
 * The **`Serial.requestPort()`** method of the Serial interface presents the user with a dialog asking them to select a serial device to connect to. It returns a Promise that resolves with an instance of SerialPort representing the device chosen by the user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/requestPort)
 */
suspend inline fun Serial.requestPort(): SerialPort {
    return requestPortAsync().await()
}

/**
 * The **`Serial.requestPort()`** method of the Serial interface presents the user with a dialog asking them to select a serial device to connect to. It returns a Promise that resolves with an instance of SerialPort representing the device chosen by the user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/requestPort)
 */
suspend inline fun Serial.requestPort(options: SerialPortRequestOptions): SerialPort {
    return requestPortAsync(
        options = options,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/connect_event)
 */
inline val <C : Serial> C.connectEvent: EventInstance<Event, C, Serial>
    get() = EventInstance(this, "connect")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Serial/disconnect_event)
 */
inline val <C : Serial> C.disconnectEvent: EventInstance<Event, C, Serial>
    get() = EventInstance(this, "disconnect")
