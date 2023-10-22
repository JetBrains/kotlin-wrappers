package remix.run.router


/**
 * Subscriber function signature for changes to router state
 */
typealias RouterSubscriber = (state: RouterState, opts: RouterSubscriberOpts) -> Unit
