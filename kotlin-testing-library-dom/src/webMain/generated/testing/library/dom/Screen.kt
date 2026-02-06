// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: OptionsReceived from "pretty-format"
// unhandled import: BoundFunctions from "./get-queries-for-element"
// unhandled import: Queries from "./get-queries-for-element"
// unhandled import: * as queries from "./queries"

external interface Screen<Q : Queries /* default is Any /* typeof queries */ */> : BoundFunctions<Q> {
    /**
     * Convenience function for `pretty-dom` which also allows an array
     * of elements
     */
    var debug: (
        element: Any?, /* Array<Element | HTMLDocument> | Element | HTMLDocument */ /* use undefined for default */
        maxLength: Double?, /* use undefined for default */
        options: Any /* TODO: OptionsReceived */?, // use undefined for default
    ) -> Unit

    /**
     * Convenience function for `Testing Playground` which logs and returns the URL that
     * can be opened in a browser
     */
    var logTestingPlaygroundURL: (element: Any? /* Element | HTMLDocument */ /* use undefined for default */) -> String
}
