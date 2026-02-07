// Automatically generated - do not modify!

package popper.core

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import kotlin.js.JsAny
import kotlin.js.JsString

@JsPlainObject
external interface State {
    val elements: ReadonlyRecord<JsString, JsAny> /* {
        reference: Element | VirtualElement;
        popper: HTMLElement;
        arrow?: HTMLElement;
    }; */
    val options: OptionsGeneric<*>
    val placement: Placement
    val strategy: PositioningStrategy
    val orderedModifiers: ReadonlyArray<Modifier<*>>
    val rects: StateRects
    val scrollParents: ReadonlyRecord<JsString, JsAny> /* {
        reference: Array<Element | Window | VisualViewport>;
        popper: Array<Element | Window | VisualViewport>;
    }; */
    val styles: ReadonlyRecord<JsString, JsAny> /* {
        [key: string]: Partial<CSSStyleDeclaration>;
    }; */
    val attributes: ReadonlyRecord<JsString, JsAny> /* {
        [key: string]: {
            [key: string]: string | boolean;
        };
    }; */
    val modifiersData: ReadonlyRecord<JsString, JsAny> /* {
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
