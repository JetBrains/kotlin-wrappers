// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.window.Window

external interface UIEvent<out T : Element, out E : NativeUIEvent> : SyntheticEvent<T, E> {
    val detail: Int
    val view: Window
}
