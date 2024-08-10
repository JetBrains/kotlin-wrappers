// Automatically generated - do not modify!

package web.errors

import js.objects.jso
import kotlinx.js.JsPlainObject
import web.events.EventInitMutable

inline fun ErrorEventInit(
    block: ErrorEventInitMutable.() -> Unit,
): ErrorEventInit =
    jso(block)

@JsPlainObject
external interface ErrorEventInitMutable :
    ErrorEventInit,
    EventInitMutable {
    override var colno: Int?
    override var error: Any?
    override var filename: String?
    override var lineno: Int?
    override var message: String?
}
