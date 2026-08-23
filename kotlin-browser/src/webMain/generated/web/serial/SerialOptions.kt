// Automatically generated - do not modify!

package web.serial

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#options)
 */
@JsPlainObject
external interface SerialOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#baudRate)
     */
    var baudRate: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#bufferSize)
     */
    var bufferSize: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#dataBits)
     */
    var dataBits: Short /* unsigned byte */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#flowControl)
     */
    var flowControl: FlowControlType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#parity)
     */
    var parity: ParityType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SerialPort/open#stopBits)
     */
    var stopBits: Short /* unsigned byte */?
}
