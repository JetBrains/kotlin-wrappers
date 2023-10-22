package react.router.dom

import web.html.HTMLAnchorElement


sealed external interface NavLinkProps : react.Props, react.PropsWithRef<HTMLAnchorElement>, LinkProps {
    @JsName("children")
    var childrenFn: ((props: NavLinkRenderProps) -> react.ReactNode)?
    var caseSensitive: Boolean?

    @JsName("className")
    var classNameFn: ((props: NavLinkRenderProps) -> String?)?
    var end: Boolean?

    @JsName("style")
    var styleFn: ((props: NavLinkRenderProps) -> react.CSSProperties?)?
    var unstable_viewTransition: Boolean?
}
