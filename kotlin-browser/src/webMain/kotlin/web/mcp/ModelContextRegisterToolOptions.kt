package web.mcp

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface ModelContextRegisterToolOptions :
    Abortable {
    override var signal: AbortSignal?
    var exposedTo: ReadonlyArray<JsString>?
}
