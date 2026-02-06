// Automatically generated - do not modify!

package testing.library.dom

import web.dom.Document
import web.dom.Element
import web.dom.Node
import web.events.Event
import web.window.Window

external interface CreateFunction {
    operator fun invoke(
        eventName: String,
        node: Document,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): Event

    operator fun invoke(
        eventName: String,
        node: Element,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): Event

    operator fun invoke(
        eventName: String,
        node: Window,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): Event

    operator fun invoke(
        eventName: String,
        node: Node,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): Event
}
