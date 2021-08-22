package react.router.dom

import kotlinext.js.jsObject
import react.*
import kotlin.reflect.KClass

@Suppress("EnumEntryName")
enum class HashType {
    slash, noslash, hashbang
}

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
    child<RouteProps<Props>, Route<Props>> {
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

fun <T : Props> RBuilder.route(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: RBuilder.(RouteResultProps<T>) -> Unit,
) {
    child<RouteProps<T>, Route<T>> {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = { props -> buildElements({ render(props) }) }
        }
    }
}

fun RBuilder.route(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: Render,
) {
    child<RouteProps<Props>, Route<Props>> {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = { buildElements(render) }
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

fun <T : Props> RBuilder.navLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    activeClassName: String = "active",
    exact: Boolean = false,
    strict: Boolean = false,
    isActive: ((match: Match<T>?, location: Location) -> Boolean)? = null,
    handler: RHandler<NavLinkProps<T>>?,
) {
    child<NavLinkProps<T>, NavLink<T>> {
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

fun <T : Props> matchPath(
    patName: String,
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match<T>? {
    val options: RouteMatchOptions = jsObject {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return rawMatchPath(patName, options)
}
