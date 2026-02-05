// Automatically generated - do not modify!

package testinglibrary.dom

import web.dom.Document
import web.dom.Element
import web.dom.Node
import web.events.Event
import web.window.Window

external interface FireFunction {
    operator fun invoke(
        element: Document,
        event: Event,
    ): Boolean

    operator fun invoke(
        element: Element,
        event: Event,
    ): Boolean

    operator fun invoke(
        element: Window,
        event: Event,
    ): Boolean

    operator fun invoke(
        element: Node,
        event: Event,
    ): Boolean
}
