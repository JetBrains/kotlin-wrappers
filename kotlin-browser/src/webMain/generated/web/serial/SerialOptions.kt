// Automatically generated - do not modify!

package web.serial

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#options)
 */
@JsPlainObject
external interface SerialOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#baudrate)
     */
    var baudRate: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#buffersize)
     */
    var bufferSize: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#databits)
     */
    var dataBits: Short /* unsigned byte */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#flowcontrol)
     */
    var flowControl: FlowControlType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#parity)
     */
    var parity: ParityType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#stopbits)
     */
    var stopBits: Short /* unsigned byte */?
}
