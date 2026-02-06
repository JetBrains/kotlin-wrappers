// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"
import js.promise.Promise
import web.html.HTMLElement

typealias FindAllByRole<T /*  : HTMLElement default is HTMLElement */> = (container: HTMLElement, role: ByRoleMatcher, options: ByRoleOptions? /* use undefined for default */, waitForElementOptions: waitForOptions? /* use undefined for default */) -> Promise<js.array.ReadonlyArray<T>>
