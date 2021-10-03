// Automatically generated - do not modify!

@file:JsModule("@mui/material/ImageListItemBar")
@file:JsNonModule

package mui.material

external interface ImageListItemBarProps : react.Props {
    /**
     * An IconButton element to be used as secondary action target
     * (primary action target is the item itself).
     */
    var actionIcon: react.ReactNode

    /**
     * Position of secondary action IconButton.
     * @default 'right'
     */
    var actionPosition: Union /* 'left' | 'right' */

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ImageListItemBarClasses

    /**
     * Position of the title bar.
     * @default 'bottom'
     */
    var position: Union /* 'below' | 'top' | 'bottom' */

    /**
     * String or element serving as subtitle (support text).
     */
    var subtitle: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * Title to be displayed.
     */
    var title: react.ReactNode
}

/**
 *
 * Demos:
 *
 * - [Image List](https://mui.com/components/image-list/)
 *
 * API:
 *
 * - [ImageListItemBar API](https://mui.com/api/image-list-item-bar/)
 */
@JsName("default")
external val ImageListItemBar: react.FC<ImageListItemBarProps>
