// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: ByRoleMatcher from "./matches"
// unhandled import: Matcher from "./matches"
// unhandled import: MatcherOptions from "./matches"
// unhandled import: SelectorMatcherOptions from "./query-helpers"
// unhandled import: waitForOptions from "./wait-for"

external interface ByRoleOptions {
    /** suppress suggestions for a specific query */
    var suggest: Boolean?

    /**
     * If true includes elements in the query set that are usually excluded from
     * the accessibility tree. `role="none"` or `role="presentation"` are included
     * in either case.
     */
    var hidden: Boolean?

    /**
     * If true only includes elements in the query set that are marked as
     * selected in the accessibility tree, i.e., `aria-selected="true"`
     */
    var selected: Boolean?

    /**
     * If true only includes elements in the query set that are marked as
     * busy in the accessibility tree, i.e., `aria-busy="true"`
     */
    var busy: Boolean?

    /**
     * If true only includes elements in the query set that are marked as
     * checked in the accessibility tree, i.e., `aria-checked="true"`
     */
    var checked: Boolean?

    /**
     * If true only includes elements in the query set that are marked as
     * pressed in the accessibility tree, i.e., `aria-pressed="true"`
     */
    var pressed: Boolean?

    /**
     * Filters elements by their `aria-current` state. `true` and `false` match `aria-current="true"` and `aria-current="false"` (as well as a missing `aria-current` attribute) respectively.
     */
    var current: (Any /* boolean | string */)?

    /**
     * If true only includes elements in the query set that are marked as
     * expanded in the accessibility tree, i.e., `aria-expanded="true"`
     */
    var expanded: Boolean?

    /**
     * Includes elements with the `"heading"` role matching the indicated level,
     * either by the semantic HTML heading elements `<h1>-<h6>` or matching
     * the `aria-level` attribute.
     */
    var level: Double?
    var value: (ByRoleOptionsValue)?

    /**
     * Includes every role used in the `role` attribute
     * For example *ByRole('progressbar', {queryFallbacks: true})` will find <div role="meter progressbar">`.
     */
    var queryFallbacks: Boolean?

    /**
     * Only considers elements with the specified accessible name.
     */
    var name: (Any /* RegExp | string | ((accessibleName: string, element: Element) => boolean) */)?

    /**
     * Only considers elements with the specified accessible description.
     */
    var description: (Any /* RegExp | string | ((accessibleDescription: string, element: Element) => boolean) */)?
}
