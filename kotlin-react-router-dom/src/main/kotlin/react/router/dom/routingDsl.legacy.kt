package react.router.dom

import react.*
import kotlin.reflect.KClass

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("HashRouter", "react.router.dom.HashRouter"),
)
fun RBuilder.hashRouter(
    basename: String = "",
    hashType: HashType = HashType.slash,
    getUserConfirmation: GetUserConfirmation? = null,
    handler: RHandler<PropsWithChildren>,
) {
    HashRouter {
        attrs {
            this.basename = basename
            this.hashType = hashType
            this.getUserConfirmation = getUserConfirmation
        }

        handler.invoke(this)
    }
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("BrowserRouter", "react.router.dom.BrowserRouter"),
)
fun RBuilder.browserRouter(
    basename: String = "",
    getUserConfirmation: GetUserConfirmation? = null,
    forceRefresh: Boolean = false,
    keyLength: Int = 6,
    handler: RHandler<PropsWithChildren>,
) {
    BrowserRouter {
        attrs {
            this.basename = basename
            this.getUserConfirmation = getUserConfirmation
            this.forceRefresh = forceRefresh
            this.keyLength = keyLength
        }

        handler.invoke(this)
    }
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("Switch", "react.router.dom.Switch"),
)
fun RBuilder.switch(
    handler: RHandler<PropsWithChildren>,
) {
    Switch(handler)
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("Route", "react.router.dom.Route"),
)
fun RBuilder.route(
    vararg path: String,
    component: ComponentType<*>,
    exact: Boolean = false,
    strict: Boolean = false,
) {
    Route {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.component = component
        }
    }
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("Route", "react.router.dom.Route"),
)
fun RBuilder.route(
    vararg path: String,
    component: KClass<out Component<Props, *>>,
    exact: Boolean = false,
    strict: Boolean = false,
) {
    Route {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.component = component.react
        }
    }
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("Route", "react.router.dom.Route"),
)
fun RBuilder.route(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: RBuilder.() -> Unit,
) {
    Route {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
        }

        render()
    }
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("Link", "react.router.dom.Link"),
)
fun RBuilder.routeLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    handler: RHandler<PropsWithChildren>?,
) {
    Link {
        attrs {
            this.to = to
            this.replace = replace
            this.className = className
        }
        handler?.invoke(this)
    }
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("NavLink", "react.router.dom.NavLink"),
)
fun RBuilder.navLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    activeClassName: String = "active",
    exact: Boolean = false,
    strict: Boolean = false,
    isActive: ((match: Match?, location: Location) -> Boolean)? = null,
    handler: RHandler<NavLinkProps>?,
) {
    NavLink {
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
}

@Deprecated(
    message = "Legacy component extension",
    replaceWith = ReplaceWith("Redirect", "react.router.dom.Redirect"),
)
fun RBuilder.redirect(
    from: String? = null,
    to: String,
    push: Boolean = false,
    exact: Boolean = false,
    strict: Boolean = false,
) {
    Redirect {
        attrs {
            this.from = from
            this.to = to
            this.push = push
            this.exact = exact
            this.strict = strict
        }
    }
}
