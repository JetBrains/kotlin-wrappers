@file:JsModule("react-popper")
@file:JsNonModule

package react.popper

import kotlinx.js.ReadonlyArray
import popper.core.Modifier
import popper.core.Placement
import popper.core.PositioningStrategy
import popper.core.ReferenceElement
import react.*
import kotlin.js.Promise

external interface PopperArrowProps :
    PropsWithRef<Any>,
    PropsWithStyle

external interface PopperChildrenProps :
    PropsWithRef<Any>,
    PropsWithStyle {

    var placement: Placement
    var isReferenceHidden: Boolean
    var hasPopperEscaped: Boolean

    var update: () -> Promise<State?>
    var forceUpdate: () -> State?
    var arrowProps: PopperArrowProps
}

external interface PopperProps : Props {
    var children: FC<PopperChildrenProps>
    var innerRef: Ref<*>
    var modifiers: ReadonlyArray<Modifier<*>>
    var placement: Placement
    var strategy: PositioningStrategy
    var referenceElement: ReferenceElement
    var onFirstUpdate: (state: State) -> Unit
}

external val Popper: ComponentClass<PopperProps>
