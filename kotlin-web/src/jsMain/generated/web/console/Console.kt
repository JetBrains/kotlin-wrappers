// Automatically generated - do not modify!

package web.console

import js.core.ReadonlyArray

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console) */
sealed external interface Console {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/assert_static) */
    fun assert(
        condition: Boolean = definedExternally,
        vararg data: Any?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/clear_static) */
    fun clear()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/count_static) */
    fun count(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/countReset_static) */
    fun countReset(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/debug_static) */
    fun debug(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dir_static) */
    fun dir(
        item: Any? = definedExternally,
        options: Any? = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dirxml_static) */
    fun dirxml(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/error_static) */
    fun error(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/group_static) */
    fun group(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupCollapsed_static) */
    fun groupCollapsed(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupEnd_static) */
    fun groupEnd()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/info_static) */
    fun info(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/log_static) */
    fun log(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/table_static) */
    fun table(
        tabularData: Any? = definedExternally,
        properties: ReadonlyArray<String> = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/time_static) */
    fun time(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeEnd_static) */
    fun timeEnd(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeLog_static) */
    fun timeLog(
        label: String = definedExternally,
        vararg data: Any?,
    )

    fun timeStamp(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/trace_static) */
    fun trace(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/warn_static) */
    fun warn(vararg data: Any?)
}
