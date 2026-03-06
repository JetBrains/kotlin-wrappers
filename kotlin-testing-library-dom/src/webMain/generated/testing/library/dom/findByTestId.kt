// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testing.library.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"

@JsName("findByTestId")
external fun findByTestIdAsync(
    container: web.html.HTMLElement,
    id: Matcher,
    options: MatcherOptions = definedExternally,
    waitForElementOptions: waitForOptions = definedExternally,
): js.promise.Promise<web.html.HTMLElement>
