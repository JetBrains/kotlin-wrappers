// Automatically generated - do not modify!

package react.dom.html

import dom.Element
import react.dom.events.ReactEventHandler

external interface DialogHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var onCancel: ReactEventHandler<T>?
    var onClose: ReactEventHandler<T>?
    var open: Boolean?
}
