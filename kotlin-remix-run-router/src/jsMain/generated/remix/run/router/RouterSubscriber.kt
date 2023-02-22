@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Subscriber function signature for changes to router state
 */
typealias RouterSubscriber = (state: RouterState) -> Unit
