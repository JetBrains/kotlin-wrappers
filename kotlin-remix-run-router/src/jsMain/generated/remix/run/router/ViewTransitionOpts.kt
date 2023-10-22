package remix.run.router


sealed external interface ViewTransitionOpts {
    var currentLocation: Location<*>
    var nextLocation: Location<*>
}
