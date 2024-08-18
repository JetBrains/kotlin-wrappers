// Generated by Karakum - do not modify it manually!

package react.router.dom

import react.router.unstable_PatchRoutesOnNavigationFunction
import remix.run.router.HydrationState
import web.window.Window
import remix.run.router.DataStrategyFunction as unstable_DataStrategyFunction
import remix.run.router.FutureConfig as RouterFutureConfig

sealed external interface DOMRouterOpts {
    var basename: String?
    var future: RouterFutureConfig?
    var hydrationData: HydrationState?
    var unstable_dataStrategy: unstable_DataStrategyFunction?
    var unstable_patchRoutesOnNavigation: unstable_PatchRoutesOnNavigationFunction?
    var window: Window?
}
