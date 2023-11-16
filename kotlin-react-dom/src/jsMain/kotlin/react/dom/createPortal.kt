@file:JsModule("react-dom")

package react.dom

import react.Key
import react.ReactNode
import react.ReactPortal
import web.dom.Element

// See https://reactjs.org/docs/react-dom.html

external fun createPortal(
    children: ReactNode?,
    container: Element,
    key: Key? = definedExternally,
): ReactPortal
