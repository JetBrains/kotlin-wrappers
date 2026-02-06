// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testing.library.dom

// unhandled import: * as queries from "./queries"
import web.html.HTMLElement

external fun <
        QueriesToBind : Queries, /* default is Any /* typeof queries */ */ // Extra type parameter required for reassignment.
        T : QueriesToBind, // default is QueriesToBind
        > getQueriesForElement(
    element: HTMLElement,
    queriesToBind: T = definedExternally,
): BoundFunctions
