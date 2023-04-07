@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import remix.run.router.FutureConfig
import remix.run.router.HydrationState
import web.window.Window


sealed external interface DOMRouterOpts {
    var basename: String?
    var future: FutureConfig?
    var hydrationData: HydrationState?
    var window: Window?
}
