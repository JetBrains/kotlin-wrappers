@file:JsModule("react-dom/client")

package react.dom.client

import react.ReactNode
import web.dom.Document
import web.dom.Element

/**
 * [Online Documentation](https://react.dev/reference/react-dom/client/hydrateRoot)
 */
external fun hydrateRoot(
    container: Element,
    initialChildren: ReactNode,
    options: HydrationOptions = definedExternally,
): Root

/**
 * [Online Documentation](https://react.dev/reference/react-dom/client/hydrateRoot)
 */
external fun hydrateRoot(
    container: Document,
    initialChildren: ReactNode,
    options: HydrationOptions = definedExternally,
): Root
