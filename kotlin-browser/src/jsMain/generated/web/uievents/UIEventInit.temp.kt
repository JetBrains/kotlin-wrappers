// Automatically generated - do not modify!

package web.uievents

import js.objects.jso
import kotlinx.js.JsPlainObject
import web.events.EventInitMutable
import web.window.Window

inline fun UIEventInit(
    block: UIEventInitMutable.() -> Unit,
): UIEventInit =
    jso(block)

@JsPlainObject
external interface UIEventInitMutable :
    UIEventInit,
    EventInitMutable {
    override var detail: Int?
    override var view: Window?
}
