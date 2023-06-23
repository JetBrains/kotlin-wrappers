// Automatically generated - do not modify!

package web.worklets

import js.core.Void
import web.url.URL
import kotlin.js.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet)
 */
abstract external class Worklet {
    /**
     * Loads and executes the module script given by moduleURL into all of worklet's global scopes. It can also create additional global scopes as part of this process, depending on the worklet type. The returned promise will fulfill once the script has been successfully loaded and run in all global scopes.
     *
     * The credentials option can be set to a credentials mode to modify the script-fetching process. It defaults to "same-origin".
     *
     * Any failures in fetching the script or its dependencies will cause the returned promise to be rejected with an "AbortError" DOMException. Any errors in parsing the script or its dependencies will cause the returned promise to be rejected with the exception generated during parsing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet/addModule)
     */
    fun addModule(
        moduleURL: String,
        options: WorkletOptions = definedExternally,
    ): Promise<Void>

    fun addModule(
        moduleURL: URL,
        options: WorkletOptions = definedExternally,
    ): Promise<Void>
}
