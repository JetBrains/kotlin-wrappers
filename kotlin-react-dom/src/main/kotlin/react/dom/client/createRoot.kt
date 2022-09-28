@file:JsModule("react-dom/client")
@file:JsNonModule

package react.dom.client

import dom.Element

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun createRoot(
    container: Element,
    options: RootOptions = definedExternally,
): Root
