@file:JsModule("react-router-dom")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import remix.run.router.To
import web.dom.Element
import web.uievents.MouseEvent

/**
 * Handles the click behavior for router `<Link>` components. This is useful if
 * you need to create custom `<Link>` components with the same click behavior we
 * use in our exported `<Link>`.
 */
external fun <E : Element /* default is HTMLAnchorElement */> useLinkClickHandler(
    to: To,
    param1: UseLinkClickHandlerOptions = definedExternally
): (event: react.dom.events.MouseEvent<E, MouseEvent>) -> Unit
