package tanstack.react.router

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import react.dom.html.LinkHTMLAttributes
import react.dom.html.MetaHTMLAttributes
import react.dom.html.ScriptHTMLAttributes
import react.dom.html.StyleHTMLAttributes
import web.html.HTMLLinkElement
import web.html.HTMLMetaElement
import web.html.HTMLScriptElement
import web.html.HTMLStyleElement

@JsPlainObject
external interface RouteMatch :
    tanstack.router.core.RouteMatch {
    val meta: ReadonlyArray<MetaHTMLAttributes<HTMLMetaElement>?>?
    val links: ReadonlyArray<LinkHTMLAttributes<HTMLLinkElement>?>?
    val scripts: ReadonlyArray<ScriptHTMLAttributes<HTMLScriptElement>?>?
    val styles: ReadonlyArray<StyleHTMLAttributes<HTMLStyleElement>?>?
    val headScripts: ReadonlyArray<ScriptHTMLAttributes<HTMLScriptElement>?>?
}
