// Automatically generated - do not modify!

package mui.base

import web.dom.ElementId
import web.html.HTMLElement

external interface UseTabPanelParameters {
    /**
     * The id of the TabPanel.
     */
    var id: ElementId?

    /**
     * The ref of the TabPanel.
     */
    var rootRef: react.Ref<HTMLElement>?

    /**
     * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
     */
    var value: dynamic
}

external interface UseTabPanelReturnValue {
    /**
     * If `true`, it indicates that the tab panel will be hidden.
     */
    var hidden: Boolean

    /**
     * Resolver for the root slot's props.
     * @param externalProps additional props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <ExternalProps extends Record<string, unknown> = {}>(externalProps?: ExternalProps) => UseTabPanelRootSlotProps<ExternalProps> */

    var rootRef: react.Ref<HTMLElement>
}
