@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import web.html.HTMLAnchorElement


external interface NavLinkProps : react.Props, react.PropsWithRef<HTMLAnchorElement>, LinkProps {
    @Deprecated(message = "use childrenFn", level = DeprecationLevel.HIDDEN)
    override var children: react.ReactNode?

    @JsName("children")
    var childrenFn: ((props: NavLinkOptions) -> react.ReactNode)?
    var caseSensitive: Boolean?

    @Deprecated(message = "use classNameFn", level = DeprecationLevel.HIDDEN)
    override var className: csstype.ClassName?

    @JsName("className")
    var classNameFn: ((props: NavLinkOptions) -> String?)?
    var end: Boolean?

    @Deprecated(message = "use styleFn", level = DeprecationLevel.HIDDEN)
    override var style: react.CSSProperties?

    @JsName("style")
    var styleFn: ((props: NavLinkOptions) -> react.CSSProperties?)?
}

