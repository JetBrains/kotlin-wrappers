// Automatically generated - do not modify!

package popper.core

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord

external interface State {
    val elements: ReadonlyRecord<String, Any> /* {
        reference: Element | VirtualElement;
        popper: HTMLElement;
        arrow?: HTMLElement;
    }; */
    val options: OptionsGeneric<*>
    val placement: Placement
    val strategy: PositioningStrategy
    val orderedModifiers: ReadonlyArray<Modifier<*>>
    val rects: StateRects
    val scrollParents: ReadonlyRecord<String, Any> /* {
        reference: Array<Element | Window | VisualViewport>;
        popper: Array<Element | Window | VisualViewport>;
    }; */
    val styles: ReadonlyRecord<String, Any> /* {
        [key: string]: Partial<CSSStyleDeclaration>;
    }; */
    val attributes: ReadonlyRecord<String, Any> /* {
        [key: string]: {
            [key: string]: string | boolean;
        };
    }; */
    val modifiersData: ReadonlyRecord<String, Any> /* {
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
