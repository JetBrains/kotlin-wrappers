@file:JsModule("react-dom/client")

package react.dom.client

import web.dom.Document
import web.dom.DocumentFragment
import web.dom.Element

/**
 * [Online Documentation](https://react.dev/reference/react-dom/client/createRoot)
 */
external fun createRoot(
    container: Element,
    options: RootOptions = definedExternally,
): Root

/**
 * [Online Documentation](https://react.dev/reference/react-dom/client/createRoot)
 */
external fun createRoot(
    container: DocumentFragment,
    options: RootOptions = definedExternally,
): Root

/**
 * [Online Documentation](https://react.dev/reference/react-dom/client/createRoot)
 */
external fun createRoot(
    container: Document,
    options: RootOptions = definedExternally,
): Root
