// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface TabPanelUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>

external interface TabPanelUnstyledOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
     */
    var value: dynamic

    /**
     * The components used for each slot inside the TabPanel.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the TabPanel.
     * @default {}
     */
    var componentsProps: dynamic
}
