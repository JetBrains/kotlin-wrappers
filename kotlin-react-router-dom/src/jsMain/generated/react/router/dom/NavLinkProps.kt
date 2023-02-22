@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import web.html.HTMLAnchorElement


external interface NavLinkProps : react.Props, react.PropsWithRef<HTMLAnchorElement>, LinkProps {
    @JsName("children")
    var childrenFn: ((props: NavLinkOptions) -> react.ReactNode)?
    var caseSensitive: Boolean?

    @JsName("className")
    var classNameFn: ((props: NavLinkOptions) -> String?)?
    var end: Boolean?

    @JsName("style")
    var styleFn: ((props: NavLinkOptions) -> react.CSSProperties?)?
}

