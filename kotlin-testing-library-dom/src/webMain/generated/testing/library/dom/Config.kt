// Automatically generated - do not modify!

package testing.library.dom

import js.promise.Promise
import web.dom.Element

external interface Config {
    var testIdAttribute: String

    /**
     * WARNING: `unstable` prefix means this API may change in patch and minor releases.
     * @param cb
     */
    fun unstable_advanceTimersWrapper(cb: Function<Any?> /* (...args: unknown[]) => unknown */): Any?

    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    fun asyncWrapper(cb: Function<Any?> /* (...args: any[]) => any */): Promise<Any?>

    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    fun eventWrapper(cb: Function<Any?> /* (...args: any[]) => any */)

    var asyncUtilTimeout: Double
    var computedStyleSupportsPseudoElements: Boolean
    var defaultHidden: Boolean

    /** default value for the `ignore` option in `ByText` queries */
    var defaultIgnore: String
    var showOriginalStackTrace: Boolean
    var throwSuggestions: Boolean
    var getElementError: (message: String?, container: Element) -> js.errors.JsError
}
