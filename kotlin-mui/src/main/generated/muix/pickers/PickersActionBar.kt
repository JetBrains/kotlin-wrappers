// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/PickersActionBar")
@file:JsNonModule

package muix.pickers

external interface PickersActionBarProps : react.Props {
    /**
     * Ordered array of actions to display.
     * If empty, does not display that action bar.
     * @default `['cancel', 'accept']` for mobile and `[]` for desktop
     */
    var actions: dynamic

    var onAccept: () -> Unit

    var onClear: () -> Unit

    var onCancel: () -> Unit

    var onSetToday: () -> Unit
}


external val PickersActionBar: react.FC<PickersActionBarProps>
