package react.router.dom

import react.router.FutureConfig
import web.window.Window


sealed external interface HashRouterProps : react.PropsWithChildren {
    var basename: String?
    var future: FutureConfig?
    var window: Window?
}
