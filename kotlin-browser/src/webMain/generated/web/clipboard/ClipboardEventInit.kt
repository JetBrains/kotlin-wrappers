// Automatically generated - do not modify!

package web.clipboard

import js.objects.JsPlainObject
import web.data.DataTransfer
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent/ClipboardEvent#options)
 */
@JsPlainObject
external interface ClipboardEventInit :
    EventInit {
    var clipboardData: DataTransfer?
}
