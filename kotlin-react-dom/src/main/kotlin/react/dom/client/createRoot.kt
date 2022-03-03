@file:JsModule("react-dom/client")
@file:JsNonModule

package react.dom.client

import org.w3c.dom.Element

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun createRoot(
    container: Element,
): Root
