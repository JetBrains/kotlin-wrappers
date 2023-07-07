package react.router.dom

import remix.run.router.HydrationState
import web.window.Window
import remix.run.router.FutureConfig as RouterFutureConfig


sealed external interface DOMRouterOpts {
    var basename: String?
    var future: RouterFutureConfig?
    var hydrationData: HydrationState?
    var window: Window?
}
