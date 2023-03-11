@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Options for a navigate() call for a Link navigation
 */

external interface LinkNavigateOptions {
    var replace: Boolean?
    var state: LocationState?
    var preventScrollReset: Boolean?
}
