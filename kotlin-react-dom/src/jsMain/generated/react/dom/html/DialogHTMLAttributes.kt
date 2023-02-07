// Automatically generated - do not modify!

package react.dom.html

import react.dom.events.ReactEventHandler
import web.dom.Element

external interface DialogHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var onCancel: ReactEventHandler<T>?
    var onClose: ReactEventHandler<T>?
    var open: Boolean?
}
