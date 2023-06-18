package react.router

import remix.run.router.HydrationState
import remix.run.router.InitialEntry
import remix.run.router.FutureConfig as RouterFutureConfig


sealed external interface CreateMemoryRouterOpts {
    var basename: String?
    var future: RouterFutureConfig?
    var hydrationData: HydrationState?
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
}
