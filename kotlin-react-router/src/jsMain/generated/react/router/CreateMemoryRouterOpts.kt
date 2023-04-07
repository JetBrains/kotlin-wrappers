package react.router

import remix.run.router.FutureConfig
import remix.run.router.HydrationState
import remix.run.router.InitialEntry


sealed external interface CreateMemoryRouterOpts {
    var basename: String?
    var future: FutureConfig?
    var hydrationData: HydrationState?
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
}
