// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.events.Event

external interface InvalidEvent<out T : Element> : SyntheticEvent<T, Event<T>> {
    override val target: T
}
