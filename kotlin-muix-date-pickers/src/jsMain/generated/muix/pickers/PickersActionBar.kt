// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray

external interface PickersActionBarProps : react.Props {
    /**
     * Ordered array of actions to display.
     * If empty, does not display that action bar.
     * @default `['cancel', 'accept']` for mobile and `[]` for desktop
     */
    var actions: ReadonlyArray<PickersActionBarAction>?

    var onAccept: () -> Unit

    var onClear: () -> Unit

    var onCancel: () -> Unit

    var onSetToday: () -> Unit
}
