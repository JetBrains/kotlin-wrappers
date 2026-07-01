// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/PickersActionBar")

package muix.pickers

import js.array.ReadonlyArray
import react.FC
import react.Props

external interface PickersActionBarProps : Props {
    /**
     * Ordered array of actions to display.
     * If empty, does not display that action bar.
     * @default
     * - `[]` for Pickers with one selection step which `closeOnSelect`.
     * - `['cancel', 'nextOrAccept']` for all other Pickers.
     */
    var actions: ReadonlyArray<PickersActionBarAction>?
}


external val PickersActionBar: FC<PickersActionBarProps>
