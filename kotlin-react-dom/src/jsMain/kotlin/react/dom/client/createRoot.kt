@file:JsModule("react-dom/client")

package react.dom.client

import web.dom.Document
import web.dom.DocumentFragment
import web.dom.Element

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun createRoot(
    container: Element,
    options: RootOptions = definedExternally,
): Root

external fun createRoot(
    container: DocumentFragment,
    options: RootOptions = definedExternally,
): Root


external fun createRoot(
    container: Document,
    options: RootOptions = definedExternally,
): Root
