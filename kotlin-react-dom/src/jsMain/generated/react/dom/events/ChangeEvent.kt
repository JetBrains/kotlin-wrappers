// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.events.Event

external interface ChangeEvent<out C : Element, out T : Element> : SyntheticEvent<C, Event> {
    // TODO: This is wrong for change event handlers on arbitrary. Should
// be EventTarget & Target, but kept for backward compatibility until React 20.
    override val target: T /* in Kotlin we can use `T` */
}
