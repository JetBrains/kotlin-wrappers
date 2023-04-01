// Automatically generated - do not modify!

package csstype

external interface StandardShorthandProperties {
    /**
     * The **`all`** shorthand CSS property resets all of an element's properties except `unicode-bidi`, `direction`, and CSS Custom Properties. It can set properties to their initial or inherited values, or to the values specified in another cascade layer or stylesheet origin.
     *
     * **Syntax**: `initial | inherit | unset | revert | revert-layer`
     *
     * **Initial value**: There is no practical initial value for it.
     *
     *    | Chrome | Firefox | Safari  | Edge | IE  |
     *    | :----: | :-----: | :-----: | :--: | :-: |
     *    |   37   |   27    |   9.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/all">MDN</a>
     */
    var all: All?

    /**
     * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
     *
     * **Syntax**: `<single-animation>#`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/animation">MDN</a>
     */
    var animation: Animation?

    /**
     * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
     *
     * **Syntax**: `[ <bg-layer> , ]* <final-bg-layer>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/background">MDN</a>
     */
    var background: Background?

    /**
     * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
     *
     * **Syntax**: `<bg-position>#`
     *
     * **Initial value**: `0% 0%`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/background-position">MDN</a>
     */
    var backgroundPosition: BackgroundPosition?

    /**
     * The **`border`** shorthand CSS property sets an element's border. It sets the values of `border-width`, `border-style`, and `border-color`.
     *
     * **Syntax**: `<line-width> || <line-style> || <color>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border">MDN</a>
     */
    var border: Border?

    /**
     * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
     *
     * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   66    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-block">MDN</a>
     */
    var borderBlock: BorderBlock?

    /**
     * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
     *
     * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   69   |   41    |   12.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-block-end">MDN</a>
     */
    var borderBlockEnd: BorderBlockEnd?

    /**
     * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
     *
     * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   69   |   41    |   12.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-block-start">MDN</a>
     */
    var borderBlockStart: BorderBlockStart?

    /**
     * The **`border-bottom`** shorthand CSS property sets an element's bottom border. It sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`.
     *
     * **Syntax**: `<line-width> || <line-style> || <color>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-bottom">MDN</a>
     */
    var borderBottom: BorderBottom?

    /**
     * The **`border-color`** shorthand CSS property sets the color of an element's border.
     *
     * **Syntax**: `<color>{1,4}`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-color">MDN</a>
     */
    var borderColor: BorderColor?

    /**
     * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
     *
     * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
     *
     *    | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
     *    | :-----: | :-------: | :-----: | :----: | :----: |
     *    |   16    |    15     |    6    |   12   |   11   |
     *    |    7′   |    3.5′   |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-image">MDN</a>
     */
    var borderImage: BorderImage?

    /**
     * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
     *
     * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   66    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-inline">MDN</a>
     */
    var borderInline: BorderInline?

    /**
     * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
     *
     * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   69   |   41    |   12.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-inline-end">MDN</a>
     */
    var borderInlineEnd: BorderInlineEnd?

    /**
     * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
     *
     * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   69   |   41    |   12.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-inline-start">MDN</a>
     */
    var borderInlineStart: BorderInlineStart?

    /**
     * The **`border-left`** shorthand CSS property sets all the properties of an element's left border.
     *
     * **Syntax**: `<line-width> || <line-style> || <color>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-left">MDN</a>
     */
    var borderLeft: BorderLeft?

    /**
     * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
     *
     * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |    4    |    4    |    5    |   12   |   9   |
     *    |    1′   |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-radius">MDN</a>
     */
    var borderRadius: BorderRadius?

    /**
     * The **`border-right`** shorthand CSS property sets all the properties of an element's right border.
     *
     * **Syntax**: `<line-width> || <line-style> || <color>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-right">MDN</a>
     */
    var borderRight: BorderRight?

    /**
     * The **`border-style`** shorthand CSS property sets the line style for all four sides of an element's border.
     *
     * **Syntax**: `<line-style>{1,4}`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-style">MDN</a>
     */
    var borderStyle: BorderStyle?

    /**
     * The **`border-top`** shorthand CSS property sets all the properties of an element's top border.
     *
     * **Syntax**: `<line-width> || <line-style> || <color>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-top">MDN</a>
     */
    var borderTop: BorderTop?

    /**
     * The **`border-width`** shorthand CSS property sets the width of an element's border.
     *
     * **Syntax**: `<line-width>{1,4}`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/border-width">MDN</a>
     */
    var borderWidth: BorderWidth?

    /** **Syntax**: `<'caret-color'> || <'caret-shape'>` */
    var caret: Caret?

    /**
     * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
     *
     * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   50    |   52    |    9    |   12   |   10   |
     *    |    1′   |         |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/column-rule">MDN</a>
     */
    var columnRule: ColumnRule?

    /**
     * The **`columns`** CSS shorthand property sets the number of columns to use when drawing an element's contents, as well as those columns' widths.
     *
     * **Syntax**: `<'column-width'> || <'column-count'>`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |   IE   |
     *    | :----: | :-----: | :-----: | :----: | :----: |
     *    |   50   |   52    |    9    |   12   |   10   |
     *    |        |         |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/columns">MDN</a>
     */
    var columns: Columns?

    /**
     * The **`contain-intrinsic-size`** CSS shorthand property sets the size of an element that a browser will use for layout when the element is subject to size containment.
     *
     * **Syntax**: `[ none | <length> | auto <length> ]{1,2}`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   83   |   107   |   No   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/contain-intrinsic-size">MDN</a>
     */
    var containIntrinsicSize: ContainIntrinsicSize?

    /**
     * The **container** shorthand CSS property establishes the element as a query container and specifies the name or name for the containment context used in a container query.
     *
     * **Syntax**: `<'container-name'> [ / <'container-type'> ]?`
     *
     *    | Chrome  | Firefox | Safari | Edge | IE  |
     *    | :-----: | :-----: | :----: | :--: | :-: |
     *    |   105   |   110   |   16   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/container">MDN</a>
     */
    var container: Container?

    /**
     * The **`flex`** CSS shorthand property sets how a flex _item_ will grow or shrink to fit the space available in its flex container.
     *
     * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
     *    | :------: | :-----: | :-----: | :----: | :------: |
     *    |    29    |   20    |    9    |   12   |    11    |
     *    |    21′   |         |    7′   |        |    10′   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/flex">MDN</a>
     */
    var flex: Flex?

    /**
     * The **`flex-flow`** CSS shorthand property specifies the direction of a flex container, as well as its wrapping behavior.
     *
     * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   28    |    9    |   12   |   11   |
     *    |    21′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/flex-flow">MDN</a>
     */
    var flexFlow: FlexFlow?

    /**
     * The **`font`** CSS shorthand property sets all the different properties of an element's font. Alternatively, it sets an element's font to a system font.
     *
     * **Syntax**: `[ [ <'font-style'> || <font-variant-css21> || <'font-weight'> || <'font-stretch'> ]? <'font-size'> [ / <'line-height'> ]? <'font-family'> ] | caption | icon | menu | message-box | small-caption | status-bar`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/font">MDN</a>
     */
    var font: Font?

    /**
     * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
     *
     * **Syntax**: `<'row-gap'> <'column-gap'>?`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/gap">MDN</a>
     */
    var gap: Gap?

    /**
     * The **`grid`** CSS property is a shorthand property that sets all of the explicit and implicit grid properties in a single declaration.
     *
     * **Syntax**: `<'grid-template'> | <'grid-template-rows'> / [ auto-flow && dense? ] <'grid-auto-columns'>? | [ auto-flow && dense? ] <'grid-auto-rows'>? / <'grid-template-columns'>`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/grid">MDN</a>
     */
    var grid: Grid?

    /**
     * The **`grid-area`** CSS shorthand property specifies a grid item's size and location within a grid by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
     *
     * **Syntax**: `<grid-line> [ / <grid-line> ]{0,3}`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/grid-area">MDN</a>
     */
    var gridArea: GridArea?

    /**
     * The **`grid-column`** CSS shorthand property specifies a grid item's size and location within a grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
     *
     * **Syntax**: `<grid-line> [ / <grid-line> ]?`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/grid-column">MDN</a>
     */
    var gridColumn: GridColumn?

    /**
     * The **`grid-row`** CSS shorthand property specifies a grid item's size and location within a grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
     *
     * **Syntax**: `<grid-line> [ / <grid-line> ]?`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/grid-row">MDN</a>
     */
    var gridRow: GridRow?

    /**
     * The **`grid-template`** CSS property is a shorthand property for defining grid columns, grid rows, and grid areas.
     *
     * **Syntax**: `none | [ <'grid-template-rows'> / <'grid-template-columns'> ] | [ <line-names>? <string> <track-size>? <line-names>? ]+ [ / <explicit-track-list> ]?`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/grid-template">MDN</a>
     */
    var gridTemplate: GridTemplate?

    /**
     * The **`inset`** CSS property is a shorthand that corresponds to the `top`, `right`, `bottom`, and/or `left` properties. It has the same multi-value syntax of the `margin` shorthand.
     *
     * **Syntax**: `<'top'>{1,4}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   66    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/inset">MDN</a>
     */
    var inset: Inset?

    /**
     * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   63    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/inset-block">MDN</a>
     */
    var insetBlock: InsetBlock?

    /**
     * The **`inset-inline`** CSS property defines the logical start and end offsets of an element in the inline direction, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   63    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/inset-inline">MDN</a>
     */
    var insetInline: InsetInline?

    /**
     * **Syntax**: `none | <integer>`
     *
     * **Initial value**: `none`
     */
    var lineClamp: LineClamp?

    /**
     * The **`list-style`** CSS shorthand property allows you to set all the list style properties at once.
     *
     * **Syntax**: `<'list-style-type'> || <'list-style-position'> || <'list-style-image'>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/list-style">MDN</a>
     */
    var listStyle: ListStyle?

    /**
     * The **`margin`** CSS shorthand property sets the margin area on all four sides of an element.
     *
     * **Syntax**: `[ <length> | <percentage> | auto ]{1,4}`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/margin">MDN</a>
     */
    var margin: Margin?

    /**
     * The **`margin-block`** CSS shorthand property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'margin-left'>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   66    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/margin-block">MDN</a>
     */
    var marginBlock: MarginBlock?

    /**
     * The **`margin-inline`** CSS shorthand property is a shorthand property that defines both the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'margin-left'>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   66    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/margin-inline">MDN</a>
     */
    var marginInline: MarginInline?

    /**
     * The **`mask`** CSS shorthand property hides an element (partially or fully) by masking or clipping the image at specific points.
     *
     * **Syntax**: `<mask-layer>#`
     *
     *    | Chrome | Firefox | Safari  | Edge  | IE  |
     *    | :----: | :-----: | :-----: | :---: | :-: |
     *    |   1    |    2    |   3.1   | 12-79 | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/mask">MDN</a>
     */
    var mask: Mask?

    /**
     * The **`mask-border`** CSS shorthand property lets you create a mask along the edge of an element's border.
     *
     * **Syntax**: `<'mask-border-source'> || <'mask-border-slice'> [ / <'mask-border-width'>? [ / <'mask-border-outset'> ]? ]? || <'mask-border-repeat'> || <'mask-border-mode'>`
     *
     *    |              Chrome              | Firefox |               Safari               | Edge | IE  |
     *    | :------------------------------: | :-----: | :--------------------------------: | :--: | :-: |
     *    |   1   _(-webkit-mask-box-image)_ |   No    |   3.1   _(-webkit-mask-box-image)_ | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/mask-border">MDN</a>
     */
    var maskBorder: MaskBorder?

    /**
     * The **`offset`** CSS shorthand property sets all the properties required for animating an element along a defined path.
     *
     * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
     *
     *    |    Chrome     | Firefox | Safari | Edge | IE  |
     *    | :-----------: | :-----: | :----: | :--: | :-: |
     *    |      55       |   72    |   16   | n/a  | No  |
     *    | 46 _(motion)_ |         |        |      |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/offset">MDN</a>
     */
    var motion: Offset?

    /**
     * The **`offset`** CSS shorthand property sets all the properties required for animating an element along a defined path.
     *
     * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
     *
     *    |    Chrome     | Firefox | Safari | Edge | IE  |
     *    | :-----------: | :-----: | :----: | :--: | :-: |
     *    |      55       |   72    |   16   | n/a  | No  |
     *    | 46 _(motion)_ |         |        |      |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/offset">MDN</a>
     */
    var offset: Offset?

    /**
     * The **`outline`** CSS shorthand property sets most of the outline properties in a single declaration.
     *
     * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   94   |   88    |   1.2   |   94   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/outline">MDN</a>
     */
    var outline: Outline?

    /**
     * The **`overflow`** CSS shorthand property sets the desired behavior for an element's overflow — i.e. when an element's content is too big to fit in its block formatting context — in both directions.
     *
     * **Syntax**: `[ visible | hidden | clip | scroll | auto ]{1,2}`
     *
     * **Initial value**: `visible`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/overflow">MDN</a>
     */
    var overflow: Overflow?

    /**
     * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
     *
     * **Syntax**: `[ contain | none | auto ]{1,2}`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   63   |   59    |   16   |   18   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior">MDN</a>
     */
    var overscrollBehavior: OverscrollBehavior?

    /**
     * The **`padding`** CSS shorthand property sets the padding area on all four sides of an element at once.
     *
     * **Syntax**: `[ <length> | <percentage> ]{1,4}`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/padding">MDN</a>
     */
    var padding: Padding?

    /**
     * The **`padding-block`** CSS shorthand property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   66    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/padding-block">MDN</a>
     */
    var paddingBlock: PaddingBlock?

    /**
     * The **`padding-inline`** CSS shorthand property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   87   |   66    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/padding-inline">MDN</a>
     */
    var paddingInline: PaddingInline?

    /**
     * The **`place-content`** CSS shorthand property allows you to align content along both the block and inline directions at once (i.e. the `align-content` and `justify-content` properties) in a relevant layout system such as Grid or Flexbox.
     *
     * **Syntax**: `<'align-content'> <'justify-content'>?`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   59   |   45    |   9    | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/place-content">MDN</a>
     */
    var placeContent: PlaceContent?

    /**
     * The CSS **`place-items`** shorthand property allows you to align items along both the block and inline directions at once (i.e. the `align-items` and `justify-items` properties) in a relevant layout system such as Grid or Flexbox. If the second value is not set, the first value is also used for it.
     *
     * **Syntax**: `<'align-items'> <'justify-items'>?`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   59   |   45    |   11   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/place-items">MDN</a>
     */
    var placeItems: PlaceItems?

    /**
     * The **`place-self`** CSS shorthand property allows you to align an individual item in both the block and inline directions at once (i.e. the `align-self` and `justify-self` properties) in a relevant layout system such as Grid or Flexbox. If the second value is not present, the first value is also used for it.
     *
     * **Syntax**: `<'align-self'> <'justify-self'>?`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   59   |   45    |   11   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/place-self">MDN</a>
     */
    var placeSelf: PlaceSelf?

    /**
     * The **`scroll-margin`** shorthand property sets all of the scroll margins of an element at once, assigning values much like the `margin` property does for margins of an element.
     *
     * **Syntax**: `<length>{1,4}`
     *
     *    | Chrome | Firefox |          Safari           | Edge | IE  |
     *    | :----: | :-----: | :-----------------------: | :--: | :-: |
     *    |   69   |   90    |           14.1            | n/a  | No  |
     *    |        |         | 11 _(scroll-snap-margin)_ |      |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-margin">MDN</a>
     */
    var scrollMargin: ScrollMargin?

    /**
     * The `scroll-margin-block` shorthand property sets the scroll margins of an element in the block dimension.
     *
     * **Syntax**: `<length>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   69   |   68    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block">MDN</a>
     */
    var scrollMarginBlock: ScrollMarginBlock?

    /**
     * The `scroll-margin-inline` shorthand property sets the scroll margins of an element in the inline dimension.
     *
     * **Syntax**: `<length>{1,2}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   69   |   68    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline">MDN</a>
     */
    var scrollMarginInline: ScrollMarginInline?

    /**
     * The **`scroll-padding`** shorthand property sets scroll padding on all sides of an element at once, much like the `padding` property does for padding on an element.
     *
     * **Syntax**: `[ auto | <length-percentage> ]{1,4}`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   69   |   68    |   14.1   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-padding">MDN</a>
     */
    var scrollPadding: ScrollPadding?

    /**
     * The `scroll-padding-block` shorthand property sets the scroll padding of an element in the block dimension.
     *
     * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   69   |   68    |   15   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block">MDN</a>
     */
    var scrollPaddingBlock: ScrollPaddingBlock?

    /**
     * The `scroll-padding-inline` shorthand property sets the scroll padding of an element in the inline dimension.
     *
     * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   69   |   68    |   15   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline">MDN</a>
     */
    var scrollPaddingInline: ScrollPaddingInline?

    /**
     * The **`scroll-margin`** shorthand property sets all of the scroll margins of an element at once, assigning values much like the `margin` property does for margins of an element.
     *
     * **Syntax**: `<length>{1,4}`
     *
     *    | Chrome | Firefox |          Safari           | Edge | IE  |
     *    | :----: | :-----: | :-----------------------: | :--: | :-: |
     *    |   69   |  68-90  |           14.1            | n/a  | No  |
     *    |        |         | 11 _(scroll-snap-margin)_ |      |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-margin">MDN</a>
     */
    var scrollSnapMargin: ScrollMargin?

    /**
     * The **`scroll-timeline`** CSS shorthand property defines a name that can be used to identify the source element of a scroll timeline, along with the scrollbar axis that should provide the timeline.
     *
     * **Syntax**: `[<'scroll-timeline-name'> <'scroll-timeline-axis'>?]#`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   No   |   n/a   |   No   | n/a  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/scroll-timeline">MDN</a>
     */
    var scrollTimeline: ScrollTimeline?

    /**
     * The **`text-decoration`** shorthand CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, `text-decoration-style`, and the newer `text-decoration-thickness` property.
     *
     * **Syntax**: `<'text-decoration-line'> || <'text-decoration-style'> || <'text-decoration-color'> || <'text-decoration-thickness'>`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/text-decoration">MDN</a>
     */
    var textDecoration: TextDecoration?

    /**
     * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
     *
     * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
     *
     *    |  Chrome  | Firefox | Safari | Edge | IE  |
     *    | :------: | :-----: | :----: | :--: | :-: |
     *    |    99    |   46    |   7    | n/a  | No  |
     *    |    25′   |         |        |      |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/text-emphasis">MDN</a>
     */
    var textEmphasis: TextEmphasis?

    /**
     * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
     *
     * **Syntax**: `<single-transition>#`
     *
     *    | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     *    | :-----: | :-----: | :-------: | :----: | :----: |
     *    |   26    |   16    |     9     |   12   |   10   |
     *    |    1′   |    4′   |    3.1′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/transition">MDN</a>
     */
    var transition: Transition?
}
