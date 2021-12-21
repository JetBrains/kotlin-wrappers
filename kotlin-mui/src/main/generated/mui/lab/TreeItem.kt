// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TreeItem")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.lab

external interface TreeItemProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLLIElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TreeItemClasses?

    /**
     * The icon used to collapse the node.
     */
    var collapseIcon: react.ReactNode?

    /**
     * The component used for the content node.
     * @default TreeItemContent
     */
    var ContentComponent: react.ComponentType<TreeItemContentProps>?

    /**
     * Props applied to ContentComponent
     */
    var ContentProps: react.dom.html.HTMLAttributes<org.w3c.dom.HTMLElement>?

    /**
     * If `true`, the node is disabled.
     */
    var disabled: Boolean?

    /**
     * The icon displayed next to a end node.
     */
    var endIcon: react.ReactNode?

    /**
     * The icon used to expand the node.
     */
    var expandIcon: react.ReactNode?

    /**
     * The icon to display next to the tree node's label.
     */
    var icon: react.ReactNode?

    /**
     * This prop isn't supported.
     * Use the `onNodeFocus` callback on the tree if you need to monitor a node's focus.
     */
    var onFocus: Nothing?

    /**
     * The tree node label.
     */
    var label: react.ReactNode?

    /**
     * The id of the node.
     */
    var nodeId: String

    /**
     * The component used for the transition.
     * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var TransitionComponent: react.ComponentType<mui.material.transitions.TransitionProps>?

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition/) component.
     */
    var TransitionProps: mui.material.transitions.TransitionProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Tree View](https://mui.com/components/tree-view/)
 *
 * API:
 *
 * - [TreeItem API](https://mui.com/api/tree-item/)
 */
@JsName("default")
external val TreeItem: react.FC<TreeItemProps>
