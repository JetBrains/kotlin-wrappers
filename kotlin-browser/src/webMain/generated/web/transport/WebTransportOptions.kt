// Automatically generated - do not modify!

package web.transport

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsString

@JsPlainObject
external interface WebTransportOptions {
    var allowPooling: Boolean?
    var congestionControl: WebTransportCongestionControl?
    var protocols: ReadonlyArray<JsString>?
    var requireUnreliable: Boolean?
    var serverCertificateHashes: ReadonlyArray<WebTransportHash>?
}
