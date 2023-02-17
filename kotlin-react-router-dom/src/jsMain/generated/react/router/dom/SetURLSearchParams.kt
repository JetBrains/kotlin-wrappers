@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import react.router.NavigateOptions

typealias SetURLSearchParams = (nextInit: Any /* URLSearchParamsInit | ((prev: URLSearchParams) => URLSearchParamsInit) */, navigateOpts: NavigateOptions? /* use undefined for default */) -> Unit
