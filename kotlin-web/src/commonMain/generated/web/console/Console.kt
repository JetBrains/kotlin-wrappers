// Automatically generated - do not modify!

package web.console

import js.array.ReadonlyArray
import js.core.JsAny

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console)
 */
sealed external interface Console {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/assert_static)
     */
    fun assert(
        condition: Boolean = definedExternally,
        vararg data: JsAny?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/clear_static)
     */
    fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/count_static)
     */
    fun count(label: String = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/countReset_static)
     */
    fun countReset(label: String = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/debug_static)
     */
    fun debug(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dir_static)
     */
    fun dir(
        item: JsAny? = definedExternally,
        options: JsAny? = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dirxml_static)
     */
    fun dirxml(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/error_static)
     */
    fun error(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/group_static)
     */
    fun group(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupCollapsed_static)
     */
    fun groupCollapsed(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupEnd_static)
     */
    fun groupEnd()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/info_static)
     */
    fun info(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/log_static)
     */
    fun log(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/table_static)
     */
    fun table(
        tabularData: JsAny? = definedExternally,
        properties: ReadonlyArray<String> = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/time_static)
     */
    fun time(label: String = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeEnd_static)
     */
    fun timeEnd(label: String = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeLog_static)
     */
    fun timeLog(
        label: String = definedExternally,
        vararg data: JsAny?,
    )

    fun timeStamp(label: String = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/trace_static)
     */
    fun trace(vararg data: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/warn_static)
     */
    fun warn(vararg data: JsAny?)
}
