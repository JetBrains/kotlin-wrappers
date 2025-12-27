// Automatically generated - do not modify!

package node.https

import node.http.IncomingMessage
import node.http.ServerResponse

sealed external interface ServerOptions<Request : IncomingMessage, Response : ServerResponse<*>> :
    node.http.ServerOptions<Request, Response>,
    node.tls.TlsOptions
