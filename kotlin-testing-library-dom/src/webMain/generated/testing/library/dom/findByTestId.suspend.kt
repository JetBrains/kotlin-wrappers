// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"
import web.html.HTMLElement

@seskar.js.JsAsync
external suspend fun <T : HTMLElement /* default is HTMLElement */> findByTestId(
    container: HTMLElement,
    id: Matcher,
    options: MatcherOptions = definedExternally,
    waitForElementOptions: waitForOptions = definedExternally,
): T
