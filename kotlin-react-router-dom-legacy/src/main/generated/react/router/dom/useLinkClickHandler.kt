// Automatically generated - do not modify!

@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import web.dom.Element
import web.window.WindowTarget

/**
 * Handles the click behavior for router `<Link>` components. This is useful if
 * you need to create custom `<Link>` components with the same click behavior we
 * use in our exported `<Link>`.
 */
external interface ClickHandlerOptions {
    var target: WindowTarget?
    var replace: Boolean?
    var state: history.LocationState?
}

external fun <E : Element> useLinkClickHandler(
    to: history.To,
    options: ClickHandlerOptions = definedExternally,
): react.dom.events.MouseEventHandler<E>
