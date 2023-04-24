// Automatically generated - do not modify!

package mui.base

import web.events.Event

external interface UseSliderParameters {
    // var `aria-labelledby`: String?

    var defaultValue: dynamic

    var disabled: Boolean?

    var disableSwap: Boolean?

    var isRtl: Boolean?

    var marks: dynamic

    var max: Number?

    var min: Number?

    var name: String?

    var onChange: ((event: Event, value: dynamic, activeThumb: Number) -> Unit)?

    var onChangeCommitted: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    var orientation: mui.material.Orientation?

    var scale: ((value: Number) -> Number)?

    var step: Number?

    var tabIndex: Int?

    var value: dynamic
}

external interface Mark {
    var value: Number

    var label: react.ReactNode?
}
