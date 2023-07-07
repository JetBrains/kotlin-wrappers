@file:JsModule("react-router-dom")

package react.router.dom

import web.url.URLSearchParams

external fun getSearchParamsForLocation(locationSearch: String, defaultSearchParams: URLSearchParams?): URLSearchParams
