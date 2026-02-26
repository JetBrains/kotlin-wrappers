// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"

@seskar.js.JsAsync
external suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByTitle(
    container: web.html.HTMLElement,
    id: Matcher,
    options: MatcherOptions = definedExternally,
    waitForElementOptions: waitForOptions = definedExternally,
): T
