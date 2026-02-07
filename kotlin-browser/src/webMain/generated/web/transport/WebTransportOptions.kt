// Automatically generated - do not modify!

package web.transport

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import kotlin.js.JsString

@JsPlainObject
external interface WebTransportOptions {
    var allowPooling: Boolean?
    var congestionControl: WebTransportCongestionControl?
    var protocols: ReadonlyArray<JsString>?
    var requireUnreliable: Boolean?
    var serverCertificateHashes: ReadonlyArray<WebTransportHash>?
}
