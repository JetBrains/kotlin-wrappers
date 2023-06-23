// Automatically generated - do not modify!

package web.console

import js.core.ReadonlyArray

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console) */
sealed external interface Console {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/assert) */
    fun assert(
        condition: Boolean = definedExternally,
        vararg data: Any?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/clear) */
    fun clear()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/count) */
    fun count(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/countReset) */
    fun countReset(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/debug) */
    fun debug(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dir) */
    fun dir(
        item: Any? = definedExternally,
        options: Any? = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dirxml) */
    fun dirxml(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/error) */
    fun error(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/group) */
    fun group(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupCollapsed) */
    fun groupCollapsed(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupEnd) */
    fun groupEnd()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/info) */
    fun info(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/log) */
    fun log(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/table) */
    fun table(
        tabularData: Any? = definedExternally,
        properties: ReadonlyArray<String> = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/time) */
    fun time(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeEnd) */
    fun timeEnd(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeLog) */
    fun timeLog(
        label: String = definedExternally,
        vararg data: Any?,
    )

    fun timeStamp(label: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/trace) */
    fun trace(vararg data: Any?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/warn) */
    fun warn(vararg data: Any?)
}
