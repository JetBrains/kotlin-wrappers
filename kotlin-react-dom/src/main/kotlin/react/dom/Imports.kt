@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.*
import react.*

// See https://reactjs.org/docs/react-dom.html

external fun render(element: dynamic, container: Element?, callback: () -> Unit = definedExternally)

external fun hydrate(element: dynamic, container: Element?, callback: () -> Unit = definedExternally)

external fun unmountComponentAtNode(domContainerNode: Element?)

external fun findDOMNode(component: dynamic): Element?

external fun createPortal(element: dynamic, container: Element?): ReactElement

// 18.0+
external fun createRoot(container: Element?, options: ReactRootOptions? = definedExternally): ReactRoot

external interface ReactRoot {
    fun render(element: dynamic): ReactElement
}

external interface ReactRootOptions {
    var hydrate: Boolean
}
