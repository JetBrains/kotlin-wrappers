@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.Element
import react.ReactElement

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun createRoot(
    container: Element?,
    options: ReactRootOptions? = definedExternally,
): ReactRoot

external interface ReactRoot {
    fun render(element: dynamic): ReactElement
}

external interface ReactRootOptions {
    var hydrate: Boolean
}
