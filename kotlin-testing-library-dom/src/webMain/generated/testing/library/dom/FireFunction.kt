// Automatically generated - do not modify!

package testing.library.dom

external interface FireFunction {
    operator fun invoke(
        element: web.dom.Document,
        event: web.events.Event,
    ): Boolean

    operator fun invoke(
        element: web.dom.Element,
        event: web.events.Event,
    ): Boolean

    operator fun invoke(
        element: web.window.Window,
        event: web.events.Event,
    ): Boolean

    operator fun invoke(
        element: web.dom.Node,
        event: web.events.Event,
    ): Boolean
}
