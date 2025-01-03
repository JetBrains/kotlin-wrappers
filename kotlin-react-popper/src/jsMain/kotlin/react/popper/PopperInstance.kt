package react.popper

import js.objects.ReadonlyRecord
import popper.core.ForceUpdate
import popper.core.Name
import popper.core.State
import popper.core.Update
import react.CSSProperties
import react.Props

external interface PopperInstance {
    val styles: ReadonlyRecord<Name, CSSProperties>
    val attributes: ReadonlyRecord<Name, Props>
    val state: State?
    val update: Update?
    val forceUpdate: ForceUpdate?
}
