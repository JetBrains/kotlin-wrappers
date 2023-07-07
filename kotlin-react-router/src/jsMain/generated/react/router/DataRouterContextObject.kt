package react.router

import remix.run.router.Router
import remix.run.router.StaticHandlerContext


sealed external interface DataRouterContextObject : NavigationContextObject {
    var router: Router
    var staticContext: StaticHandlerContext?
}
