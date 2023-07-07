package react.router

import remix.run.router.InitialEntry


sealed external interface MemoryRouterProps : react.PropsWithChildren {
    var basename: String?
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
    var future: FutureConfig?
}
