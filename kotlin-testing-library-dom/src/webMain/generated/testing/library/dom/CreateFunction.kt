// Automatically generated - do not modify!

package testing.library.dom

external interface CreateFunction {
    operator fun invoke(
        eventName: String,
        node: web.dom.Document,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): web.events.Event

    operator fun invoke(
        eventName: String,
        node: web.dom.Element,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): web.events.Event

    operator fun invoke(
        eventName: String,
        node: web.window.Window,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): web.events.Event

    operator fun invoke(
        eventName: String,
        node: web.dom.Node,
        init: Any = definedExternally,
        options: CreateFunctionOptions = definedExternally,
    ): web.events.Event
}
