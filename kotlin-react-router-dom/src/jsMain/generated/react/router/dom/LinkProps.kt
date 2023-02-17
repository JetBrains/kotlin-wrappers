@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import react.router.RelativeRoutingType
import remix.run.router.To
import web.html.HTMLAnchorElement


external interface LinkProps : react.Props, react.PropsWithRef<HTMLAnchorElement>, react.dom.html.AnchorHTMLAttributes<HTMLAnchorElement> {
    var reloadDocument: Boolean?
    var replace: Boolean?
    var state: Any?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
    var to: To

    @Deprecated(message = "don't use href", level = DeprecationLevel.HIDDEN)
    override var href: String?
}

