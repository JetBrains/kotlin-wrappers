package tanstack.react.router

import react.dom.html.AnchorHTMLAttributes
import web.html.HTMLAnchorElement

external interface LinkComponentProps :
    AnchorHTMLAttributes<HTMLAnchorElement>,
    LinkProps
