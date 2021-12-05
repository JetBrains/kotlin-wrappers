package ringui

import kotlinext.js.ReadonlyArray
import kotlinext.js.jso
import react.*
import react.dom.div

external interface JsIterator<T> {
    fun next(): JsIteratorResult<T>
}

operator fun <T> JsIterator<T>.iterator(): Iterator<T> =
    object : Iterator<T> {
        private var element = this@iterator.next()
        override fun hasNext(): Boolean = !element.done
        override fun next(): T {
            val toReturn = element.value ?: error("No values available")
            element = this@iterator.next()
            return toReturn
        }
    }


external class JsIteratorResult<T> {
    val done: Boolean
    val value: T?
}

@JsName("Set")
external class JsSet<T> {
    val size: Int
        get() = definedExternally

    fun add(value: T): JsSet<T>
    fun clear()
    fun delete(value: T)
    fun entries(): JsIterator<T>
    fun has(value: T): Boolean
    fun forEach(callback: (value: T, key: T, set: JsSet<T>) -> Unit)
    fun values(): JsIterator<T>
}


external interface ColumnProps : PropsWithClassName {
    var id: String
    var title: String
    var getDataTest: String?
    var rightAlign: Boolean?
    var sortable: Boolean?
    var getValue: (RowData) -> dynamic
}

fun ColumnProps(init: ColumnProps.() -> Unit): ColumnProps = jso(init)

sealed external interface RowData

fun RowData(init: RowData.() -> Unit): RowData = jso(init)

operator fun RowData.get(key: String) = this.asDynamic()[key]
operator fun RowData.get(key: ColumnProps) = this.asDynamic()[key.id]
operator fun RowData.set(key: String, value: ReactElement) {
    this.asDynamic()[key] = value
}

operator fun RowData.set(key: String, value: String) {
    this.asDynamic()[key] = value
}

operator fun RowData.set(key: String, value: RBuilder.() -> Unit) {
    this.asDynamic()[key] = RBuilderSingle().apply {
        div {
            value()
        }
    }.childList.first()
}

operator fun RowData.set(key: ColumnProps, value: ReactElement) {
    this.asDynamic()[key.id] = value
}

operator fun RowData.set(key: ColumnProps, value: String) {
    this.asDynamic()[key.id] = value
}

operator fun RowData.set(key: ColumnProps, value: RBuilder.() -> Unit) {
    this.asDynamic()[key.id] = RBuilderSingle().apply {
        div {
            value()
        }
    }.childList.first()
}

external interface SelectionConstructor {
    var data: ReadonlyArray<RowData>
    var selected: JsSet<RowData>
    var focused: RowData?
    var getKey: (RowData) -> String
    var getChildren: () -> Children
    var isItemSelectable: (RowData) -> Boolean
}

@JsModule("@jetbrains/ring-ui/components/table/selection")
@JsNonModule
@JsName("default")
external class Selection(constructor: SelectionConstructor) {
    fun cloneWith(data: ReadonlyArray<RowData>, selected: JsSet<RowData>, focused: RowData?): Selection
    fun focus(rowData: RowData): Selection
    fun moveUp(): Selection
    fun moveDown(): Selection
    fun moveStart(): Selection
    fun moveEnd(): Selection
    fun select(value: RowData = definedExternally)
    fun deselect(value: RowData = definedExternally)
    fun toggleSelection(value: RowData = definedExternally)
    fun selectAll(): Selection
    fun resetFocus(): Selection
    fun resetSelection(): Selection
    fun reset(): Selection
    fun isFocused(value: RowData): Boolean
    fun isSelected(value: RowData): Boolean
    fun getFocused(): RowData?
    fun getSelected(): JsSet<RowData>
    fun getActive(): JsSet<RowData>
}