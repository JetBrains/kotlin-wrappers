package react.router.dom


sealed external interface NavLinkRenderProps {
    var isActive: Boolean
    var isPending: Boolean
    var isTransitioning: Boolean
}
