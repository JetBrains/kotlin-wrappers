package react.router.dom

import kotlinext.js.jso
import react.*
import kotlin.reflect.KClass

fun RBuilder.hashRouter(
    basename: String = "",
    hashType: HashType = HashType.slash,
    getUserConfirmation: GetUserConfirmation? = null,
    handler: RHandler<PropsWithChildren>,
) {
    HashRouter {
        attrs {
            this.basename = basename
            this.hashType = hashType.name
            this.getUserConfirmation = getUserConfirmation
        }

        handler.invoke(this)
    }
}

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

fun RBuilder.switch(
    handler: RHandler<PropsWithChildren>,
) {
    Switch(handler)
}

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

fun RBuilder.route(
    vararg path: String,
    component: KClass<out Component<Props, *>>,
    exact: Boolean = false,
    strict: Boolean = false,
) {
    route(
        path = path,
        component = component.react,
        exact = exact,
        strict = strict,
    )
}

fun RBuilder.route(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: RBuilder.(RouteResultProps) -> Unit,
) {
    Route {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = { props -> buildElements({ render(props) }) }
        }
    }
}

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

fun matchPath(
    pathName: String,
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match? {
    val options: RouteMatchOptions = jso {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return rawMatchPath(pathName, options)
}
