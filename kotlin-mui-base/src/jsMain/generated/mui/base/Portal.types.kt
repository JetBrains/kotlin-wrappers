// Automatically generated - do not modify!

package mui.base

import web.dom.Element

external interface PortalProps : react.PropsWithChildren {
    /**
     * The children to render into the `container`.
     */
    override var children: react.ReactNode?

    /**
     * An HTML element or function that returns one.
     * The `container` will have the portal children appended to it.
     *
     * By default, it uses the body of the top-level document object,
     * so it's simply `document.body` most of the time.
     */
    var container: Element?

    /**
     * The `children` will be under the DOM hierarchy of the parent component.
     * @default false
     */
    var disablePortal: Boolean?
}
