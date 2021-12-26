@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.Element
import react.ReactElement

// See https://reactjs.org/docs/react-dom.html

external fun hydrate(
    element: ReactElement?,
    container: Element,
    callback: () -> Unit = definedExternally,
)
