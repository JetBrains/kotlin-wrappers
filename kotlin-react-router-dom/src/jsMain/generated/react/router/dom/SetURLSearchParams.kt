@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import react.router.NavigateOptions
import web.url.URLSearchParams

typealias SetURLSearchParams = (nextInit: ((prev: URLSearchParams) -> URLSearchParamsInit), navigateOpts: NavigateOptions? /* use undefined for default */) -> Unit
