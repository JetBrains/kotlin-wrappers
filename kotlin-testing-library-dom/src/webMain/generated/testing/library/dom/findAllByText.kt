// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testing.library.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"

@JsName("findAllByText")
external fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByTextAsync(
    container: web.html.HTMLElement,
    id: Matcher,
    options: SelectorMatcherOptions = definedExternally,
    waitForElementOptions: waitForOptions = definedExternally,
): js.promise.Promise<js.array.ReadonlyArray<T>>
