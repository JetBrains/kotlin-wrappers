package react.router.dom

import react.router.RelativeRoutingType


external interface UseLinkClickHandlerOptions {
    var target: web.window.WindowTarget?
    var replace: Boolean?
    var state: remix.run.router.LocationState?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
}

