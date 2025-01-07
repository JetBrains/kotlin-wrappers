@file:JsModule("react-dom/server")

package react.dom.server

import react.ReactNode

/**
 * [Online Documentation](https://react.dev/reference/react-dom/server/renderToString)
 */
external fun renderToString(
    element: ReactNode?,
    options: ServerOptions? = definedExternally,
): String
