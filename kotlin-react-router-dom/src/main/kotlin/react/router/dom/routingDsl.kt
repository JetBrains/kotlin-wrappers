package react.router.dom

import react.*
import kotlin.reflect.*

fun RBuilder.hashRouter(handler: RHandler<RProps>) = child(HashRouterComponent::class, handler)

fun RBuilder.browserRouter(handler: RHandler<RProps>) = child(BrowserRouterComponent::class, handler)

fun RBuilder.switch(handler: RHandler<RProps>) = child(SwitchComponent::class, handler)

fun RBuilder.route(
    path: String,
    component: KClass<out Component<*, *>>,
    exact: Boolean = false,
    strict: Boolean = false
): ReactElement {
    return child<RouteProps<RProps>, RouteComponent<RProps>> {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.component = component.js.unsafeCast<RClass<RProps>>()
        }
    }
}

fun <T : RProps> RBuilder.route(
    path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: (props: RouteResultProps<T>) -> ReactElement?
): ReactElement {
    return child<RouteProps<T>, RouteComponent<T>> {
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
    return child<RouteProps<RProps>, RouteComponent<RProps>> {
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
) = child(LinkComponent::class) {
    attrs {
        this.to = to
        this.replace = replace
        this.className = className
    }
    handler?.invoke(this)
}

fun RBuilder.navLink(
        to: String,
        replace: Boolean = false,
        className: String? = null,
        activeClassName: String = "active",
        exact: Boolean = false,
        isActive: (() -> Unit)? = null,
        handler: RHandler<RProps>?
) = child(NavLinkComponent::class) {
    attrs {
        this.to = to
        this.replace = replace
        this.className = className
        this.activeClassName = activeClassName
        this.exact = exact
        this.isActive = isActive
    }
    handler?.invoke(this)
}

fun RBuilder.redirect(
    from: String,
    to: String,
    push: Boolean = false,
    exact: Boolean = false,
    strict: Boolean = false
) = child(RedirectComponent::class) {
    attrs {
        this.from = from
        this.to = to
        this.push = push
        this.exact = exact
        this.strict = strict
    }
}
