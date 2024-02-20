// Automatically generated - do not modify!

package web.transport

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface WebTransportOptions {
    var allowPooling: Boolean?
    var congestionControl: WebTransportCongestionControl?
    var requireUnreliable: Boolean?
    var serverCertificateHashes: ReadonlyArray<WebTransportHash>?
}
