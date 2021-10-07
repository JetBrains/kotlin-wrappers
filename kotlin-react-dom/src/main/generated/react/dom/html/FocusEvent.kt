// Automatically generated - do not modify!

package react.dom.html

import org.w3c.dom.Element
import org.w3c.dom.events.EventTarget

external interface FocusEvent<T : Element> : SyntheticEvent<T, NativeFocusEvent> {
    val relatedTarget: EventTarget?
    override val target: T
}
