package react.router

import remix.run.router.HydrationState
import remix.run.router.InitialEntry


external interface CreateMemoryRouterOpts {
    var basename: String?
    var hydrationData: HydrationState?
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
}
