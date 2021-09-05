@file:JsModule("react-popper")
@file:JsNonModule

package react.popper

import kotlinext.js.ReadonlyArray
import org.w3c.dom.HTMLElement
import popper.Modifier
import popper.Placement
import popper.PositioningStrategy
import react.*
import kotlin.js.Promise

external interface PopperArrowProps : Props {
    var ref: Ref<*>
    var style: CSSProperties
}

external interface PopperChildrenProps : Props {
    var ref: Ref<*>
    var style: CSSProperties

    var placement: Placement
    var isReferenceHidden: Boolean
    var hasPopperEscaped: Boolean

    var update: () -> Promise<State?>
    var forceUpdate: () -> State?
    var arrowProps: PopperArrowProps
}

external interface PopperProps<Modifiers> : Props {
    var children: FC<PopperChildrenProps>
    var innerRef: Ref<*>
    var modifiers: ReadonlyArray<Modifier<Modifiers>>
    var placement: Placement
    var strategy: PositioningStrategy
    var referenceElement: HTMLElement // or PopperJS.VirtualElement
    var onFirstUpdate: (state: State) -> Unit
}

external val Popper: ComponentClass<PopperProps<*>>
