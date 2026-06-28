// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray
import react.Props

external interface PickersActionBarProps : Props {
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
