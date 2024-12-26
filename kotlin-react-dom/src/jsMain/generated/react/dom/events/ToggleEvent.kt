// Automatically generated - do not modify!

package react.dom.events

import react.dom.html.NewState
import react.dom.html.OldState
import web.dom.Element

external interface ToggleEvent<out T : Element> : SyntheticEvent<T, NativeToggleEvent> {
    val oldState: OldState
    val newState: NewState
}
