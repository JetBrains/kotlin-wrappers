@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.Router
import remix.run.router.StaticHandlerContext


external interface DataRouterContextObject : NavigationContextObject {
    var router: Router
    var staticContext: StaticHandlerContext?
}

