@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package react.router.dom

import react.*
import kotlin.reflect.*

fun RBuilder.hashRouter(handler: RHandler<RProps>) = ReactRouterDomModule.HashRouter(handler)

fun RBuilder.browserRouter(handler: RHandler<RProps>) = ReactRouterDomModule.BrowserRouter(handler)

fun RBuilder.switch(handler: RHandler<RProps>) = ReactRouterDomModule.Switch(handler)

fun RBuilder.route(
    path: String,
    component: KClass<out Component<RProps, *>>,
    exact: Boolean = false,
    strict: Boolean = false
): ReactElement {
    return (ReactRouterDomModule.Route as RClass<RouteProps<RProps>>) {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.component = component.rClass
        }
    }
}

fun <T : RProps> RBuilder.route(
    path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: (props: RouteResultProps<T>) -> ReactElement?
): ReactElement {
    return (ReactRouterDomModule.Route as RClass<RouteProps<T>>) {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = render
        }
    }
}

fun RBuilder.route(
    path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: () -> ReactElement?
): ReactElement {
    return (ReactRouterDomModule.Route as RClass<RouteProps<RProps>>) {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = { render() }
        }
    }
}

fun RBuilder.routeLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    handler: RHandler<RProps>?
) = ReactRouterDomModule.Link {
    attrs {
        this.to = to
        this.replace = replace
        this.className = className
    }
    handler?.invoke(this)
}

fun <T : RProps> RBuilder.navLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    activeClassName: String = "active",
    exact: Boolean = false,
    strict: Boolean = false,
    isActive: ((match: RouteResultMatch<T>?, location: RouteResultLocation) -> Boolean)? = null,
    handler: RHandler<NavLinkProps<T>>?
) = (ReactRouterDomModule.NavLink as RClass<NavLinkProps<T>>) {
    attrs {
        this.to = to
        this.replace = replace
        this.className = className
        this.activeClassName = activeClassName
        this.exact = exact
        this.strict = strict
        this.isActive = isActive
    }
    handler?.invoke(this)
}

fun RBuilder.redirect(
    from: String? = null,
    to: String,
    push: Boolean = false,
    exact: Boolean = false,
    strict: Boolean = false
) = ReactRouterDomModule.Redirect {
    attrs {
        this.from = from
        this.to = to
        this.push = push
        this.exact = exact
        this.strict = strict
    }
}
