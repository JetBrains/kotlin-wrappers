@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass

external interface NavLinkProps : LinkProps {
    var activeClassName: String
    var exact: Boolean
    var strict: Boolean
    var isActive: ((match: Match?, location: Location) -> Boolean)?
    var location: Location
}

external val NavLink: ComponentClass<NavLinkProps>
