// Automatically generated - do not modify!

package web.clipboard

import js.objects.JsPlainObject
import js.objects.jso
import web.data.DataTransfer
import web.events.EventInitMutable

inline fun ClipboardEventInit(
    block: ClipboardEventInitMutable.() -> Unit,
): ClipboardEventInit =
    jso(block)

@JsPlainObject
external interface ClipboardEventInitMutable :
    ClipboardEventInit,
    EventInitMutable {
    override var clipboardData: DataTransfer?
}
