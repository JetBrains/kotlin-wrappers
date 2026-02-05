// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testinglibrary.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"
import js.promise.Promise
import web.html.HTMLElement

@JsName("findByTestId")
external fun <T : HTMLElement /* default is HTMLElement */> findByTestIdAsync(
    container: HTMLElement,
    id: Matcher,
    options: MatcherOptions = definedExternally,
    waitForElementOptions: waitForOptions = definedExternally,
): Promise<T>
