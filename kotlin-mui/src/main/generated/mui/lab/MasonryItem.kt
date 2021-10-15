// Automatically generated - do not modify!

@file:JsModule("@mui/lab/MasonryItem")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.lab

external interface MasonryItemProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    /**
     * The content of the component, normally an `<img />` or a `<div />`. It should be only one element.
     */
    var children: dynamic

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MasonryItemClasses

    /**
     * The initial height of the component in px. This is provided for server-side rendering.
     */
    var defaultHeight: Number

    /**
     * The number of columns taken up by the component
     * @default 1
     */
    var columnSpan: Number

    /**
     * Allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Masonry](https://mui.com/components/masonry/)
 *
 * API:
 *
 * - [MasonryItem API](https://mui.com/api/masonry-item/)
 */
@JsName("default")
external val MasonryItem: react.FC<MasonryItemProps>
