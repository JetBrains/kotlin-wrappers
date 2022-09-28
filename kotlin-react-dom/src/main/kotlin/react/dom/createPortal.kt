@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import dom.Element
import react.Key
import react.ReactNode
import react.ReactPortal

// See https://reactjs.org/docs/react-dom.html

external fun createPortal(
    children: ReactNode?,
    container: Element,
    key: Key? = definedExternally,
): ReactPortal
