package react.popper

import kotlinext.js.Record
import popper.core.ForceUpdate
import popper.core.Name
import popper.core.State
import popper.core.Update
import react.CSSProperties
import react.Props

external interface PopperInstance {
    val styles: Record<Name, CSSProperties>
    val attributes: Record<Name, Props>
    val state: State?
    val update: Update?
    val forceUpdate: ForceUpdate?
}
