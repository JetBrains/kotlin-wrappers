@file:JsModule("react-dom/client")

package react.dom.client

import react.ReactNode
import web.dom.Element

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun hydrateRoot(
    container: Element,
    initialChildren: ReactNode,
    options: HydrationOptions = definedExternally,
): Root
