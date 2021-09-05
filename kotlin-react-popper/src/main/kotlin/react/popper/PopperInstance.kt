package react.popper

import kotlinext.js.Record
import popper.ForceUpdate
import popper.State
import popper.Update
import react.CSSProperties
import react.Props

external interface PopperInstance {
    val styles: Record<String, CSSProperties>
    val attributes: Record<String, Props>
    val state: State?
    val update: Update?
    val forceUpdate: ForceUpdate?
}
