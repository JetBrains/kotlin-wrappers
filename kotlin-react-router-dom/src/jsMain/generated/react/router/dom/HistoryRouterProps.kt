@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import remix.run.router.History


sealed external interface HistoryRouterProps : react.PropsWithChildren {
    var basename: String?
    var history: History
}
