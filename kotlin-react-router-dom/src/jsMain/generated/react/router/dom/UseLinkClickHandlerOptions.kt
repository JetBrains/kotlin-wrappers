package react.router.dom

import react.router.RelativeRoutingType


external interface UseLinkClickHandlerOptions {
    var target: web.window.WindowTarget?
    var replace: Boolean?
    var state: Any?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
}

