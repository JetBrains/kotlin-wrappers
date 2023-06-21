// Automatically generated - do not modify!

package web.transport

import js.core.ReadonlyArray

sealed external interface WebTransportOptions {
    var allowPooling: Boolean?
    var congestionControl: WebTransportCongestionControl?
    var requireUnreliable: Boolean?
    var serverCertificateHashes: ReadonlyArray<WebTransportHash>?
}
