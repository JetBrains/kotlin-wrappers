// Automatically generated - do not modify!

package mui.base

import web.dom.Element
import web.html.HTMLElement

external interface UseMenuButtonParameters {
    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, allows a disabled button to receive focus.
     * @default false
     */
    var focusableWhenDisabled: Boolean?

    /**
     * The ref to the root element.
     */
    var rootRef: react.Ref<HTMLElement>?
}

external interface UseMenuButtonReturnValue {
    /**
     * If `true`, the component is active (pressed).
     */
    var active: Boolean

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: Any /* <ExternalProps extends Record<string, unknown> = {}>(externalProps?: ExternalProps) => UseMenuButtonRootSlotProps<ExternalProps> */

    var open: Boolean

    /**
     * The ref to the root element.
     */
    var rootRef: react.RefCallback<Element>?
}
