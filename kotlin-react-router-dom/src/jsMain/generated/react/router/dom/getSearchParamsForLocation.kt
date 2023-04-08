@file:JsModule("react-router-dom")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import web.url.URLSearchParams

external fun getSearchParamsForLocation(locationSearch: String, defaultSearchParams: URLSearchParams?): URLSearchParams
