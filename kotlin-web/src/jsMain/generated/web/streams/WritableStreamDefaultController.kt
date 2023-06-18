// Automatically generated - do not modify!

package web.streams

import js.errors.JsError
import web.abort.AbortSignal

sealed external class WritableStreamDefaultController {
    val signal: AbortSignal
    fun error(error: JsError = definedExternally)
}
