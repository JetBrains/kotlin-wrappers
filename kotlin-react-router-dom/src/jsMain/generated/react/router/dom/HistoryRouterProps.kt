package react.router.dom

import react.router.FutureConfig
import remix.run.router.History


sealed external interface HistoryRouterProps : react.PropsWithChildren {
    var basename: String?
    var future: FutureConfig?
    var history: History
}
