// Automatically generated - do not modify!

package web.console

import js.core.ReadonlyArray

sealed external interface Console {
    fun assert(
        condition: Boolean = definedExternally,
        vararg data: Any?,
    )

    fun clear()
    fun count(label: String = definedExternally)
    fun countReset(label: String = definedExternally)
    fun debug(vararg data: Any?)
    fun dir(
        item: Any? = definedExternally,
        options: Any? = definedExternally,
    )

    fun dirxml(vararg data: Any?)
    fun error(vararg data: Any?)
    fun group(vararg data: Any?)
    fun groupCollapsed(vararg data: Any?)
    fun groupEnd()
    fun info(vararg data: Any?)
    fun log(vararg data: Any?)
    fun table(
        tabularData: Any? = definedExternally,
        properties: ReadonlyArray<String> = definedExternally,
    )

    fun time(label: String = definedExternally)
    fun timeEnd(label: String = definedExternally)
    fun timeLog(
        label: String = definedExternally,
        vararg data: Any?,
    )

    fun timeStamp(label: String = definedExternally)
    fun trace(vararg data: Any?)
    fun warn(vararg data: Any?)
}
