// Automatically generated - do not modify!

package react.dom.events

import org.w3c.dom.Element
import react.dom.AbstractView

external interface UIEvent<T : Element, E : NativeUIEvent> : SyntheticEvent<T, E> {
    val detail: Int
    val view: AbstractView
}
