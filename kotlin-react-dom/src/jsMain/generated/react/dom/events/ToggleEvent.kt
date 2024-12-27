// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.popover.ToggleState

external interface ToggleEvent<out T : Element> : SyntheticEvent<T, NativeToggleEvent> {
    val oldState: ToggleState
    val newState: ToggleState
}
