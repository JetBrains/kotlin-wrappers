// Automatically generated - do not modify!

package mui.base

import js.core.ReadonlyArray
import web.dom.Element

external interface SelectOption<TValue> {
    var value: TValue

    var label: react.ReactNode

    var disabled: Boolean?
}

external interface SelectOptionGroup {
    var options: dynamic

    var label: react.ReactNode

    var disabled: Boolean?
}

external interface UseSelectSingleParameters<TValue> {
    var defaultValue: TValue?

    var multiple: Boolean? /* false */

    var onChange: ((e: react.dom.events.SyntheticEvent<Element, web.events.Event>?, value: TValue?) -> Unit)?

    var value: TValue?
}

external interface UseSelectMultiParameters<TValue> {
    var defaultValue: ReadonlyArray<TValue>?

    var multiple: Boolean /* true */

    var onChange: ((e: react.dom.events.SyntheticEvent<Element, web.events.Event>?, value: ReadonlyArray<TValue>) -> Unit)?

    var value: ReadonlyArray<TValue>?
}

external interface UseSelectSingleResult<TValue> {
    var value: TValue?
}

external interface UseSelectMultiResult<TValue> {
    var value: ReadonlyArray<TValue>
}
