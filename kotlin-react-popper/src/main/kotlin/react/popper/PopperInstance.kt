package react.popper

import kotlinext.js.Record
import popper.core.ForceUpdate
import popper.core.State
import popper.core.Update
import react.CSSProperties
import react.Props

external interface PopperInstance {
    val styles: Record<String, CSSProperties>
    val attributes: Record<String, Props>
    val state: State?
    val update: Update?
    val forceUpdate: ForceUpdate?
}
