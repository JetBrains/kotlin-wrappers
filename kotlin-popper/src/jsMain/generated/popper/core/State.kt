// Automatically generated - do not modify!

package popper.core

import js.core.ReadonlyArray

external interface State {
    val elements: dynamic /* {
        reference: Element | VirtualElement;
        popper: HTMLElement;
        arrow?: HTMLElement;
    }; */
    val options: OptionsGeneric<*>
    val placement: Placement
    val strategy: PositioningStrategy
    val orderedModifiers: ReadonlyArray<Modifier<*>>
    val rects: StateRects
    val scrollParents: dynamic /* {
        reference: Array<Element | Window | VisualViewport>;
        popper: Array<Element | Window | VisualViewport>;
    }; */
    val styles: dynamic /* {
        [key: string]: Partial<CSSStyleDeclaration>;
    }; */
    val attributes: dynamic /* {
        [key: string]: {
            [key: string]: string | boolean;
        };
    }; */
    val modifiersData: dynamic /* {
        arrow?: {
            x?: number;
            y?: number;
            centerOffset: number;
        };
        hide?: {
            isReferenceHidden: boolean;
            hasPopperEscaped: boolean;
            referenceClippingOffsets: SideObject;
            popperEscapeOffsets: SideObject;
        };
        offset?: OffsetData;
        preventOverflow?: Offsets;
        popperOffsets?: Offsets;
        [key: string]: any;
    }; */
    val reset: Boolean
}
