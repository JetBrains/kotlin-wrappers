// Automatically generated - do not modify!

package web.console

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`console`** object provides access to the debugging console (e.g., the Web console in Firefox).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console)
 */
external interface Console {
    /**
     * The **`console.assert()`** static method writes an error message to the console if the assertion is false. If the assertion is true, nothing happens.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/assert_static)
     */
    fun assert(
        condition: Boolean = definedExternally,
        vararg data: JsAny?,
    )

    /**
     * The **`console.clear()`** static method clears the console if possible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/clear_static)
     */
    fun clear()

    /**
     * The **`console.count()`** static method logs the number of times that this particular call to count() has been called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/count_static)
     */
    fun count(label: String = definedExternally)

    /**
     * The **`console.countReset()`** static method resets counter used with console.count().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/countReset_static)
     */
    fun countReset(label: String = definedExternally)

    /**
     * The **`console.debug()`** static method outputs a message to the console at the "debug" log level. The message is only displayed to the user if the console is configured to display debug output. In most cases, the log level is configured within the console UI. This log level might correspond to the Debug or Verbose log level.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/debug_static)
     */
    fun debug(vararg data: JsAny?)
    fun debug(vararg data: String?)

    /**
     * The **`console.dir()`** static method displays a list of the properties of the specified JavaScript object. In browser consoles, the output is presented as a hierarchical listing with disclosure triangles that let you see the contents of child objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dir_static)
     */
    fun dir(
        item: JsAny? = definedExternally,
        options: JsAny? = definedExternally,
    )

    /**
     * The **`console.dirxml()`** static method displays an interactive tree of the descendant elements of the specified XML/HTML element. If it is not possible to display as an element the JavaScript Object view is shown instead. The output is presented as a hierarchical listing of expandable nodes that let you see the contents of child nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dirxml_static)
     */
    fun dirxml(vararg data: JsAny?)
    fun dirxml(vararg data: String?)

    /**
     * The **`console.error()`** static method outputs a message to the console at the "error" log level. The message is only displayed to the user if the console is configured to display error output. In most cases, the log level is configured within the console UI. The message may be formatted as an error, with red colors and call stack information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/error_static)
     */
    fun error(vararg data: JsAny?)
    fun error(vararg data: String?)

    /**
     * The **`console.group()`** static method creates a new inline group in the Web console log, causing any subsequent console messages to be indented by an additional level, until console.groupEnd() is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/group_static)
     */
    fun group(vararg data: JsAny?)
    fun group(vararg data: String?)

    /**
     * The **`console.groupCollapsed()`** static method creates a new inline group in the console. Unlike console.group(), however, the new group is created collapsed. The user will need to use the disclosure button next to it to expand it, revealing the entries created in the group.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupCollapsed_static)
     */
    fun groupCollapsed(vararg data: JsAny?)
    fun groupCollapsed(vararg data: String?)

    /**
     * The **`console.groupEnd()`** static method exits the current inline group in the console. See Using groups in the console in the console documentation for details and examples.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupEnd_static)
     */
    fun groupEnd()

    /**
     * The **`console.info()`** static method outputs a message to the console at the "info" log level. The message is only displayed to the user if the console is configured to display info output. In most cases, the log level is configured within the console UI. The message may receive special formatting, such as a small "i" icon next to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/info_static)
     */
    fun info(vararg data: JsAny?)
    fun info(vararg data: String?)

    /**
     * The **`console.log()`** static method outputs a message to the console.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/log_static)
     */
    fun log(vararg data: JsAny?)
    fun log(vararg data: String?)

    /**
     * The **`console.table()`** static method displays tabular data as a table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/table_static)
     */
    fun table(
        tabularData: JsAny? = definedExternally,
        properties: ReadonlyArray<JsString> = definedExternally,
    )

    /**
     * The **`console.time()`** static method starts a timer you can use to track how long an operation takes. You give each timer a unique name, and may have up to 10,000 timers running on a given page. When you call console.timeEnd() with the same name, the browser will output the time, in milliseconds, that elapsed since the timer was started.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/time_static)
     */
    fun time(label: String = definedExternally)

    /**
     * The **`console.timeEnd()`** static method stops a timer that was previously started by calling console.time().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeEnd_static)
     */
    fun timeEnd(label: String = definedExternally)

    /**
     * The **`console.timeLog()`** static method logs the current value of a timer that was previously started by calling console.time().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeLog_static)
     */
    fun timeLog(
        label: String = definedExternally,
        vararg data: JsAny?,
    )

    /**
     * The **`console.timeStamp()`** static method adds a single marker to the browser's Performance tool (Firefox bug 1387528, Chrome). This lets you correlate a point in your code with the other events recorded in the timeline, such as layout and paint events.
     */
    fun timeStamp(label: String = definedExternally)

    /**
     * The **`console.trace()`** static method outputs a stack trace to the console.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/trace_static)
     */
    fun trace(vararg data: JsAny?)
    fun trace(vararg data: String?)

    /**
     * The **`console.warn()`** static method outputs a warning message to the console at the "warning" log level. The message is only displayed to the user if the console is configured to display warning output. In most cases, the log level is configured within the console UI. The message may receive special formatting, such as yellow colors and a warning icon.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/warn_static)
     */
    fun warn(vararg data: JsAny?)
    fun warn(vararg data: String?)
}
