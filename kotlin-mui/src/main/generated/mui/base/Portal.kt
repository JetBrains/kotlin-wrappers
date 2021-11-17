// Automatically generated - do not modify!

@file:JsModule("@mui/base/Portal")
@file:JsNonModule

package mui.base

import kotlinext.js.ReadonlyArray

external interface PortalProps : react.PropsWithChildren {
    /**
     * The children to render into the `container`.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * An HTML element or function that returns one.
     * The `container` will have the portal children appended to it.
     *
     * By default, it uses the body of the top-level document object,
     * so it's simply `document.body` most of the time.
     */
    var container: dynamic

    /**
     * The `children` will be under the DOM hierarchy of the parent component.
     * @default false
     */
    var disablePortal: Boolean?
}

/**
 * Portals provide a first-class way to render children into a DOM node
 * that exists outside the DOM hierarchy of the parent component.
 *
 * Demos:
 *
 * - [Portal](https://mui.com/components/portal/)
 *
 * API:
 *
 * - [Portal API](https://mui.com/api/portal/)
 */
@JsName("default")
external val Portal: react.FC<PortalProps>
