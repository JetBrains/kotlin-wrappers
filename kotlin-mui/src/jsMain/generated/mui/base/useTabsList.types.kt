// Automatically generated - do not modify!

package mui.base

external interface UseTabsListParameters : react.PropsWithChildren {
    // var `aria-label`: String?

    // var `aria-labelledby`: String?

    /**
     * The content of the component.
     */
    override var children: react.ReactNode?
}

external interface UseTabsListReturnValue {
    /**
     * If `true`, it will indicate that the text's direction in right-to-left.
     * @default false
     */
    var isRtl: Boolean

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: mui.material.Orientation

    /**
     * The value of the currently selected `Tab`.
     */
    var value: Any /* String or Number or Boolean /* false */ */

    /**
     * Callback for processing the children of the tabs list. It adds the necessary attributes for correct a11y and navigation.
     */
    var processChildren: () -> react.ReactElement<*>?

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <TOther extends Record<string, any> = {}>(externalProps?: TOther) => UseTabsListRootSlotProps<TOther> */
}
