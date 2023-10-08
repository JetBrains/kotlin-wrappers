// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface TreeViewProps : TreeViewPropsBase

external interface TreeViewPropsBase :
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * className applied to the root element.
     */
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TreeViewClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}
