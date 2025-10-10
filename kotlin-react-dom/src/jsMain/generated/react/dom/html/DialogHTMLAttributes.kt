// Automatically generated - do not modify!

package react.dom.html

import react.dom.events.ReactEventHandler
import web.dom.Element
import web.html.ClosedBy

external interface DialogHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var closedby: ClosedBy?
    var onCancel: ReactEventHandler<T>?
    var onClose: ReactEventHandler<T>?
    var open: Boolean?
}
