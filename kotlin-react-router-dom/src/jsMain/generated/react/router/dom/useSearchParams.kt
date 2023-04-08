@file:JsModule("react-router-dom")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import web.url.URLSearchParams

/**
 * A convenient wrapper for reading and writing search parameters via the
 * URLSearchParams interface.
 */
external fun useSearchParams(defaultInit: URLSearchParamsInit = definedExternally): js.core.JsTuple2<URLSearchParams, SetURLSearchParams>
