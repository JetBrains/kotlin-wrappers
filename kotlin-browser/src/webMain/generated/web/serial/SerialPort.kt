// Automatically generated - do not modify!

package web.serial

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.streams.ReadableStream
import web.streams.WritableStream
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`SerialPort`** interface of the Web Serial API provides access to a serial port on the host device.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort)
 */
open external class SerialPort
private constructor() :
    EventTarget {
    /**
     * The **`connected`** read-only property of the SerialPort interface returns a boolean value that indicates whether the port is logically connected to the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/connected)
     */
    val connected: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/connect_event)
     */
    var onconnect: EventHandler<Event, SerialPort, Serial>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/disconnect_event)
     */
    var ondisconnect: EventHandler<Event, SerialPort, Serial>?

    /**
     * The **`readable`** read-only property of the SerialPort interface returns a ReadableStream for receiving data from the device connected to the port. Chunks read from this stream are instances of Uint8Array. This property is non-null as long as the port is open and has not encountered a fatal error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/readable)
     */
    val readable: ReadableStream<*>?

    /**
     * The **`writable`** read-only property of the SerialPort interface returns a WritableStream for sending data to the device connected to the port. Chunks written to this stream must be instances of ArrayBuffer, TypedArray, or DataView. This property is non-null as long as the port is open and has not encountered a fatal error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/writable)
     */
    val writable: WritableStream<*>?

    /**
     * The **`SerialPort.close()`** method of the SerialPort interface returns a Promise that resolves when the port closes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/close)
     */
    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * The **`SerialPort.forget()`** method of the SerialPort interface returns a Promise that resolves when access to the serial port is revoked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/forget)
     */
    @JsName("forget")
    fun forgetAsync(): Promise<Void>

    /**
     * The **`getInfo()`** method of the SerialPort interface returns an object containing identifying information for the device available via the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/getInfo)
     */
    fun getInfo(): SerialPortInfo

    /**
     * The **`SerialPort.getSignals()`** method of the SerialPort interface returns a Promise that resolves with an object containing the current state of the port's control signals.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/getSignals)
     */
    @JsName("getSignals")
    fun getSignalsAsync(): Promise<SerialInputSignals>

    /**
     * The **`open()`** method of the SerialPort interface returns a Promise that resolves when the port is opened. By default the port is opened with 8 data bits, 1 stop bit and no parity checking. The baudRate parameter is required.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open)
     */
    @JsName("open")
    fun openAsync(options: SerialOptions): Promise<Void>

    /**
     * The **`setSignals()`** method of the SerialPort interface sets control signals on the port and returns a Promise that resolves when they are set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/setSignals)
     */
    @JsName("setSignals")
    fun setSignalsAsync(signals: SerialOutputSignals = definedExternally): Promise<Void>
}

/**
 * The **`SerialPort.close()`** method of the SerialPort interface returns a Promise that resolves when the port closes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/close)
 */
suspend inline fun SerialPort.close() {
    closeAsync().await()
}

/**
 * The **`SerialPort.forget()`** method of the SerialPort interface returns a Promise that resolves when access to the serial port is revoked.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/forget)
 */
suspend inline fun SerialPort.forget() {
    forgetAsync().await()
}

/**
 * The **`SerialPort.getSignals()`** method of the SerialPort interface returns a Promise that resolves with an object containing the current state of the port's control signals.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/getSignals)
 */
suspend inline fun SerialPort.getSignals(): SerialInputSignals {
    return getSignalsAsync().await()
}

/**
 * The **`open()`** method of the SerialPort interface returns a Promise that resolves when the port is opened. By default the port is opened with 8 data bits, 1 stop bit and no parity checking. The baudRate parameter is required.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open)
 */
suspend inline fun SerialPort.open(options: SerialOptions) {
    openAsync(
        options = options,
    ).await()
}

/**
 * The **`setSignals()`** method of the SerialPort interface sets control signals on the port and returns a Promise that resolves when they are set.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/setSignals)
 */
suspend inline fun SerialPort.setSignals() {
    setSignalsAsync().await()
}

/**
 * The **`setSignals()`** method of the SerialPort interface sets control signals on the port and returns a Promise that resolves when they are set.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/setSignals)
 */
suspend inline fun SerialPort.setSignals(signals: SerialOutputSignals) {
    setSignalsAsync(
        signals = signals,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/connect_event)
 */
inline val <C : SerialPort> C.connectEvent: EventInstance<Event, C, Serial>
    get() = EventInstance(this, "connect")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/disconnect_event)
 */
inline val <C : SerialPort> C.disconnectEvent: EventInstance<Event, C, Serial>
    get() = EventInstance(this, "disconnect")
