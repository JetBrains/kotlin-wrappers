@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package react.router.dom

import react.*
import kotlin.reflect.*

fun RBuilder.hashRouter(handler: RHandler<RProps>) = ReactRouterDom.HashRouter(handler)

fun RBuilder.browserRouter(handler: RHandler<RProps>) = ReactRouterDom.BrowserRouter(handler)

fun RBuilder.switch(handler: RHandler<RProps>) = ReactRouterDom.Switch(handler)

fun RBuilder.route(
    routeComponent: RClass<RouteProps<RProps>>,
    path: String,
    component: KClass<out Component<RProps, *>>,
    exact: Boolean = false,
    strict: Boolean = false
): ReactElement {
    return routeComponent {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.component = component.rClass
        }
    }
}

fun <T : RProps> RBuilder.route(
    routeComponent: RClass<RouteProps<T>>,
    path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: (props: RouteResultProps<T>) -> ReactElement?
): ReactElement {
    return routeComponent {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = render
        }
    }
}

fun RBuilder.route(
    routeComponent: RClass<RouteProps<RProps>>,
    path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: () -> ReactElement?
): ReactElement {
    return routeComponent {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = { render() }
        }
    }
}

fun RBuilder.route(
    path: String,
    component: KClass<out Component<RProps, *>>,
    exact: Boolean = false,
    strict: Boolean = false
) = route(ReactRouterDom.Route as RClass<RouteProps<RProps>>, path, component, exact, strict)

fun <T : RProps> RBuilder.route(
    path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: (props: RouteResultProps<T>) -> ReactElement?
) = route(ReactRouterDom.Route as RClass<RouteProps<T>>, path, exact, strict, render)

fun RBuilder.route(
    path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: () -> ReactElement?
) = route(ReactRouterDom.Route as RClass<RouteProps<RProps>>, path, exact, strict, render)

fun RBuilder.routeLink(
    routeLinkComponent: RClass<LinkProps>,
    to: String,
    replace: Boolean = false,
    className: String? = null,
    handler: RHandler<RProps>?
) = routeLinkComponent {
    attrs {
        this.to = to
        this.replace = replace
        this.className = className
    }
    handler?.invoke(this)
}

fun RBuilder.routeLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    handler: RHandler<RProps>?
) = routeLink(ReactRouterDom.Link, to, replace, className, handler)

fun <T : RProps> RBuilder.navLink(
    navLinkComponent: RClass<NavLinkProps<T>>,
    to: String,
    replace: Boolean = false,
    className: String? = null,
    activeClassName: String = "active",
    exact: Boolean = false,
    strict: Boolean = false,
    isActive: ((match: RouteResultMatch<T>?, location: RouteResultLocation) -> Boolean)? = null,
    handler: RHandler<NavLinkProps<T>>?
) = navLinkComponent {
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

fun <T : RProps> RBuilder.navLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    activeClassName: String = "active",
    exact: Boolean = false,
    strict: Boolean = false,
    isActive: ((match: RouteResultMatch<T>?, location: RouteResultLocation) -> Boolean)? = null,
    handler: RHandler<NavLinkProps<T>>?
) = navLink(ReactRouterDom.NavLink as RClass<NavLinkProps<T>>, to, replace, className, activeClassName, exact, strict, isActive, handler)

fun RBuilder.redirect(
    redirectComponent: RClass<RedirectProps>,
    from: String? = null,
    to: String,
    push: Boolean = false,
    exact: Boolean = false,
    strict: Boolean = false
) = redirectComponent {
    attrs {
        this.from = from
        this.to = to
        this.push = push
        this.exact = exact
        this.strict = strict
    }
}

fun RBuilder.redirect(
    from: String? = null,
    to: String,
    push: Boolean = false,
    exact: Boolean = false,
    strict: Boolean = false
) = redirect(ReactRouterDom.Redirect, from, to, push, exact, strict)
