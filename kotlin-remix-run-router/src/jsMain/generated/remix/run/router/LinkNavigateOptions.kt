@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Options for a navigate() call for a Link navigation
 */

external interface LinkNavigateOptions {
    var replace: Boolean?
    var state: Any?
    var preventScrollReset: Boolean?
}

