@file:JsModule("react-dom/server")

package react.dom.server

import react.ReactNode

/**
 * [Online Documentation](https://react.dev/reference/react-dom/server/renderToStaticMarkup)
 */
external fun renderToStaticMarkup(
    element: ReactNode?,
    options: ServerOptions? = definedExternally,
): String
