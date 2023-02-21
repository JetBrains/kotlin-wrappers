@file:JsModule("react-router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.Blocker
import remix.run.router.BlockerFunction

/**
 * Allow the application to block navigations within the SPA and present the
 * user a confirmation dialog to confirm the navigation.  Mostly used to avoid
 * using half-filled form data.  This does not handle hard-reloads or
 * cross-origin navigations.
 */
@JsName("unstable_useBlocker")
external fun useBlocker(shouldBlock: Boolean): Blocker

@JsName("unstable_useBlocker")
external fun useBlocker(shouldBlock: BlockerFunction): Blocker
