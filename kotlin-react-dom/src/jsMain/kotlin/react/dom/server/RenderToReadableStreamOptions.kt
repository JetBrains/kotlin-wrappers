package react.dom.server

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import react.dom.client.ErrorHandler
import react.dom.client.ErrorInfo
import web.abort.AbortSignal
import web.abort.Abortable

@JsPlainObject
external interface RenderToReadableStreamOptions :
    Abortable {
    val identifierPrefix: String?
    val namespaceURI: String?
    val nonce: String?
    val bootstrapScriptContent: String?
    val bootstrapScripts: ReadonlyArray<String>?
    val bootstrapModules: ReadonlyArray<String>?
    val progressiveChunkSize: Int?
    override val signal: AbortSignal?
    val onError: ErrorHandler<ErrorInfo>?
}
