@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.Element

// See https://reactjs.org/docs/react-dom.html

external fun hydrate(
    element: dynamic,
    container: Element?,
    callback: () -> Unit = definedExternally,
)
