package react.router.dom

import remix.run.router.RelativeRoutingType


sealed external interface UseLinkClickHandlerOptions {
    var target: web.window.WindowTarget?
    var replace: Boolean?
    var state: Any?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
}
