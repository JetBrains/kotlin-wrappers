@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import remix.run.router.History


external interface HistoryRouterProps : react.PropsWithChildren {
    var basename: String?
    var history: History
}

