// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"

@seskar.js.JsAsync
external suspend fun findAllByRole(
    container: web.html.HTMLElement,
    role: ByRoleMatcher,
    options: ByRoleOptions = definedExternally,
    waitForElementOptions: waitForOptions = definedExternally,
): js.array.ReadonlyArray<web.html.HTMLElement>
