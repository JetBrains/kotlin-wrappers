@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.Element
import react.Key
import react.ReactPortal

// See https://reactjs.org/docs/react-dom.html

external fun createPortal(
    element: dynamic,
    container: Element,
    key: Key? = definedExternally,
): ReactPortal
