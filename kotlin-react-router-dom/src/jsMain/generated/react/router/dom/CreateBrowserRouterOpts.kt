package react.router.dom

import remix.run.router.HydrationState
import web.window.Window


sealed external interface CreateBrowserRouterOpts {
    var basename: String?
    var hydrationData: HydrationState?
    var window: Window?
}
