// Automatically generated - do not modify!

package csstype

external interface StandardLonghandProperties {
    /**
     * The CSS **`align-content`** property sets the distribution of space between and around content items along a flexbox's cross-axis or a grid's block axis.
     *
     * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
     *
     * **Initial value**: `normal`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :------: | :-----: | :-------: | :----: | :----: |
     * |  **29**  | **28**  |   **9**   | **12** | **11** |
     * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/align-content
     */
    var alignContent: AlignContent

    /**
     * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. In Flexbox, it controls the alignment of items on the Cross Axis. In Grid Layout, it controls the alignment of items on the Block Axis within their grid area.
     *
     * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ]`
     *
     * **Initial value**: `normal`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :------: | :-----: | :-----: | :----: | :----: |
     * |  **52**  | **20**  |  **9**  | **12** | **11** |
     * | 21 _-x-_ |         | 7 _-x-_ |        |        |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/align-items
     */
    var alignItems: AlignItems

    /**
     * The **`align-self`** CSS property overrides a grid or flex item's `align-items` value. In Grid, it aligns the item inside the grid area. In Flexbox, it aligns the item on the cross axis.
     *
     * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
     *
     * **Initial value**: `auto`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :------: | :-----: | :-------: | :----: | :----: |
     * |  **36**  | **20**  |   **9**   | **12** | **11** |
     * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
     * | :----: | :-----: | :------: | :----: | :----------: |
     * | **57** | **52**  | **10.1** | **16** | **10** _-x-_ |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/align-self
     */
    var alignSelf: AlignSelf

    /**
     * The **`align-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their block axis.
     *
     * **Syntax**: `[ normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position> ]#`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   |   n/a   |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/align-tracks
     */
    var alignTracks: AlignTracks

    /**
     * The **`animation-delay`** CSS property specifies the amount of time to wait from applying the animation to an element before beginning to perform the animation. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
     *
     * **Syntax**: `<time>#`
     *
     * **Initial value**: `0s`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-delay
     */
    var animationDelay: AnimationDelay

    /**
     * The **`animation-direction`** CSS property sets whether an animation should play forward, backward, or alternate back and forth between playing the sequence forward and backward.
     *
     * **Syntax**: `<single-animation-direction>#`
     *
     * **Initial value**: `normal`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-direction
     */
    var animationDirection: AnimationDirection

    /**
     * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
     *
     * **Syntax**: `<time>#`
     *
     * **Initial value**: `0s`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-duration
     */
    var animationDuration: AnimationDuration

    /**
     * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
     *
     * **Syntax**: `<single-animation-fill-mode>#`
     *
     * **Initial value**: `none`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 5 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-fill-mode
     */
    var animationFillMode: AnimationFillMode

    /**
     * The **`animation-iteration-count`** CSS property sets the number of times an animation sequence should be played before stopping.
     *
     * **Syntax**: `<single-animation-iteration-count>#`
     *
     * **Initial value**: `1`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-iteration-count
     */
    var animationIterationCount: AnimationIterationCount

    /**
     * The **`animation-name`** CSS property specifies the names of one or more `@keyframes` at-rules describing the animation or animations to apply to the element.
     *
     * **Syntax**: `[ none | <keyframes-name> ]#`
     *
     * **Initial value**: `none`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-name
     */
    var animationName: AnimationName

    /**
     * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
     *
     * **Syntax**: `<single-animation-play-state>#`
     *
     * **Initial value**: `running`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-play-state
     */
    var animationPlayState: AnimationPlayState

    /**
     * The **`animation-timing-function`** CSS property sets how an animation progresses through the duration of each cycle.
     *
     * **Syntax**: `<easing-function>#`
     *
     * **Initial value**: `ease`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **43**  | **16**  |  **9**  | **12** | **10** |
     * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation-timing-function
     */
    var animationTimingFunction: AnimationTimingFunction

    /**
     * The `**appearance**` CSS property is used to display an element using platform-native styling, based on the operating system's theme. The **`-moz-appearance`** and **`-webkit-appearance`** properties are non-standard versions of this property, used (respectively) by Gecko (Firefox) and by WebKit-based (e.g., Safari) and Blink-based (e.g., Chrome, Opera) browsers to achieve the same thing. Note that Firefox and Edge also support **`-webkit-appearance`**, for compatibility reasons.
     *
     * **Syntax**: `none | auto | textfield | menulist-button | <compat-auto>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome  | Firefox |   Safari    |   Edge   | IE  |
     * | :-----: | :-----: | :---------: | :------: | :-: |
     * | **84**  | **80**  | **3** _-x-_ |  **84**  | No  |
     * | 1 _-x-_ | 1 _-x-_ |             | 12 _-x-_ |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/appearance
     */
    var appearance: Appearance

    /**
     * The **`aspect-ratio`**  CSS property sets a **preferred aspect ratio** for the box, which will be used in the calculation of auto sizes and some other layout functions.
     *
     * **Syntax**: `auto | <ratio>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **88** |   n/a   |   No   | **88** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/aspect-ratio
     */
    var aspectRatio: AspectRatio

    /**
     * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
     *
     * **Syntax**: `none | <filter-function-list>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |   Safari    |  Edge  | IE  |
     * | :----: | :-----: | :---------: | :----: | :-: |
     * | **76** |   n/a   | **9** _-x-_ | **17** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
     */
    var backdropFilter: BackdropFilter

    /**
     * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
     *
     * **Syntax**: `visible | hidden`
     *
     * **Initial value**: `visible`
     *
     * |  Chrome  | Firefox  |    Safari     |  Edge  |   IE   |
     * | :------: | :------: | :-----------: | :----: | :----: |
     * |  **36**  |  **16**  | **5.1** _-x-_ | **12** | **10** |
     * | 12 _-x-_ | 10 _-x-_ |               |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
     */
    var backfaceVisibility: BackfaceVisibility

    /**
     * The **`background-attachment`** CSS property sets whether a background image's position is fixed within the viewport, or scrolls with its containing block.
     *
     * **Syntax**: `<attachment>#`
     *
     * **Initial value**: `scroll`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
     */
    var backgroundAttachment: BackgroundAttachment

    /**
     * The **`background-blend-mode`** CSS property sets how an element's background images should blend with each other and with the element's background color.
     *
     * **Syntax**: `<blend-mode>#`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **35** | **30**  | **8**  | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
     */
    var backgroundBlendMode: BackgroundBlendMode

    /**
     * The **`background-clip`** CSS property sets whether an element's background extends underneath its border box, padding box, or content box.
     *
     * **Syntax**: `<box>#`
     *
     * **Initial value**: `border-box`
     *
     * | Chrome | Firefox |   Safari    |  Edge  |  IE   |
     * | :----: | :-----: | :---------: | :----: | :---: |
     * | **1**  |  **4**  | **3** _-x-_ | **12** | **9** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
     */
    var backgroundClip: BackgroundClip

    /**
     * The **`background-color`** CSS property sets the background color of an element.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `transparent`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-color
     */
    var backgroundColor: BackgroundColor

    /**
     * The **`background-image`** CSS property sets one or more background images on an element.
     *
     * **Syntax**: `<bg-image>#`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-image
     */
    var backgroundImage: BackgroundImage

    /**
     * The **`background-origin`** CSS property sets the background's origin: from the border start, inside the border, or inside the padding.
     *
     * **Syntax**: `<box>#`
     *
     * **Initial value**: `padding-box`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **4**  | **3**  | **12** | **9** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
     */
    var backgroundOrigin: BackgroundOrigin

    /**
     * The **`background-position-x`** CSS property sets the initial horizontal position for each background image. The position is relative to the position layer set by `background-origin`.
     *
     * **Syntax**: `[ center | [ [ left | right | x-start | x-end ]? <length-percentage>? ]! ]#`
     *
     * **Initial value**: `left`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  | **49**  | **1**  | **12** | **6** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
     */
    var backgroundPositionX: BackgroundPositionX

    /**
     * The **`background-position-y`** CSS property sets the initial vertical position for each background image. The position is relative to the position layer set by `background-origin`.
     *
     * **Syntax**: `[ center | [ [ top | bottom | y-start | y-end ]? <length-percentage>? ]! ]#`
     *
     * **Initial value**: `top`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  | **49**  | **1**  | **12** | **6** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
     */
    var backgroundPositionY: BackgroundPositionY

    /**
     * The **`background-repeat`** CSS property sets how background images are repeated. A background image can be repeated along the horizontal and vertical axes, or not repeated at all.
     *
     * **Syntax**: `<repeat-style>#`
     *
     * **Initial value**: `repeat`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
     */
    var backgroundRepeat: BackgroundRepeat

    /**
     * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
     *
     * **Syntax**: `<bg-size>#`
     *
     * **Initial value**: `auto auto`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * |  **3**  |  **4**  |  **5**  | **12** | **9** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background-size
     */
    var backgroundSize: BackgroundSize

    /**
     * **Syntax**: `clip | ellipsis | <string>`
     *
     * **Initial value**: `clip`
     */
    var blockOverflow: BlockOverflow

    /**
     * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
     *
     * **Syntax**: `<'width'>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/block-size
     */
    var blockSize: BlockSize

    /**
     * The **`border-block-color`** CSS property defines the color of the logical block borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-color'>{1,2}`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-color
     */
    var borderBlockColor: BorderBlockColor

    /**
     * The **`border-block-end-color`** CSS property defines the color of the logical block-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
     */
    var borderBlockEndColor: BorderBlockEndColor

    /**
     * The **`border-block-end-style`** CSS property defines the style of the logical block-end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
     */
    var borderBlockEndStyle: BorderBlockEndStyle

    /**
     * The **`border-block-end-width`** CSS property defines the width of the logical block-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
     */
    var borderBlockEndWidth: BorderBlockEndWidth

    /**
     * The **`border-block-start-color`** CSS property defines the color of the logical block-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
     */
    var borderBlockStartColor: BorderBlockStartColor

    /**
     * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
     */
    var borderBlockStartStyle: BorderBlockStartStyle

    /**
     * The **`border-block-start-width`** CSS property defines the width of the logical block-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
     */
    var borderBlockStartWidth: BorderBlockStartWidth

    /**
     * The **`border-block-style`** CSS property defines the style of the logical block borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-style
     */
    var borderBlockStyle: BorderBlockStyle

    /**
     * The **`border-block-width`** CSS property defines the width of the logical block borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-width
     */
    var borderBlockWidth: BorderBlockWidth

    /**
     * The **`border-bottom-color`** CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties `border-color` or `border-bottom`.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
     */
    var borderBottomColor: BorderBottomColor

    /**
     * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * |  **4**  |  **4**  |  **5**  | **12** | **9** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-left-radius
     */
    var borderBottomLeftRadius: BorderBottomLeftRadius

    /**
     * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * |  **4**  |  **4**  |  **5**  | **12** | **9** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-right-radius
     */
    var borderBottomRightRadius: BorderBottomRightRadius

    /**
     * The **`border-bottom-style`** CSS property sets the line style of an element's bottom `border`.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
     */
    var borderBottomStyle: BorderBottomStyle

    /**
     * The **`border-bottom-width`** CSS property sets the width of the bottom border of an element.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-width
     */
    var borderBottomWidth: BorderBottomWidth

    /**
     * The **`border-collapse`** CSS property sets whether cells inside a `<table>` have shared or separate borders.
     *
     * **Syntax**: `collapse | separate`
     *
     * **Initial value**: `separate`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  |  **1**  | **1.2** | **12** | **5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
     */
    var borderCollapse: BorderCollapse

    /**
     * The **`border-end-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`. This is useful when building styles to work regardless of the text orientation and writing mode.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **89** | **66**  |   No   | **89** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-end-end-radius
     */
    var borderEndEndRadius: BorderEndEndRadius

    /**
     * The **`border-end-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`. This is useful when building styles to work regardless of the text orientation and writing mode.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **89** | **66**  |   No   | **89** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-end-start-radius
     */
    var borderEndStartRadius: BorderEndStartRadius

    /**
     * The **`border-image-outset`** CSS property sets the distance by which an element's border image is set out from its border box.
     *
     * **Syntax**: `[ <length> | <number> ]{1,4}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **15** | **15**  | **6**  | **12** | **11** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-image-outset
     */
    var borderImageOutset: BorderImageOutset

    /**
     * The **`border-image-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's border image.
     *
     * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
     *
     * **Initial value**: `stretch`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **15** | **15**  | **6**  | **12** | **11** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
     */
    var borderImageRepeat: BorderImageRepeat

    /**
     * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
     *
     * **Syntax**: `<number-percentage>{1,4} && fill?`
     *
     * **Initial value**: `100%`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **15** | **15**  | **6**  | **12** | **11** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
     */
    var borderImageSlice: BorderImageSlice

    /**
     * The **`border-image-source`** CSS property sets the source image used to create an element's border image.
     *
     * **Syntax**: `none | <image>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **15** | **15**  | **6**  | **12** | **11** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
     */
    var borderImageSource: BorderImageSource

    /**
     * The **`border-image-width`** CSS property sets the width of an element's border image.
     *
     * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
     *
     * **Initial value**: `1`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **15** | **13**  | **6**  | **12** | **11** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
     */
    var borderImageWidth: BorderImageWidth

    /**
     * The **`border-inline-color`** CSS property defines the color of the logical inline borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-color'>{1,2}`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-color
     */
    var borderInlineColor: BorderInlineColor

    /**
     * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
     * | :----: | :-------------------------: | :------: | :----: | :-: |
     * | **69** |           **41**            | **12.1** | **79** | No  |
     * |        | 3 _(-moz-border-end-color)_ |          |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
     */
    var borderInlineEndColor: BorderInlineEndColor

    /**
     * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
     * | :----: | :-------------------------: | :------: | :----: | :-: |
     * | **69** |           **41**            | **12.1** | **79** | No  |
     * |        | 3 _(-moz-border-end-style)_ |          |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
     */
    var borderInlineEndStyle: BorderInlineEndStyle

    /**
     * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
     * | :----: | :-------------------------: | :------: | :----: | :-: |
     * | **69** |           **41**            | **12.1** | **79** | No  |
     * |        | 3 _(-moz-border-end-width)_ |          |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
     */
    var borderInlineEndWidth: BorderInlineEndWidth

    /**
     * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
     * | :----: | :---------------------------: | :------: | :----: | :-: |
     * | **69** |            **41**             | **12.1** | **79** | No  |
     * |        | 3 _(-moz-border-start-color)_ |          |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
     */
    var borderInlineStartColor: BorderInlineStartColor

    /**
     * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
     * | :----: | :---------------------------: | :------: | :----: | :-: |
     * | **69** |            **41**             | **12.1** | **79** | No  |
     * |        | 3 _(-moz-border-start-style)_ |          |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
     */
    var borderInlineStartStyle: BorderInlineStartStyle

    /**
     * The **`border-inline-start-width`** CSS property defines the width of the logical inline-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
     */
    var borderInlineStartWidth: BorderInlineStartWidth

    /**
     * The **`border-inline-style`** CSS property defines the style of the logical inline borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-style
     */
    var borderInlineStyle: BorderInlineStyle

    /**
     * The **`border-inline-width`** CSS property defines the width of the logical inline borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-width
     */
    var borderInlineWidth: BorderInlineWidth

    /**
     * The **`border-left-color`** CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties `border-color` or `border-left`.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
     */
    var borderLeftColor: BorderLeftColor

    /**
     * The **`border-left-style`** CSS property sets the line style of an element's left `border`.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-left-style
     */
    var borderLeftStyle: BorderLeftStyle

    /**
     * The **`border-left-width`** CSS property sets the width of the left border of an element.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
     */
    var borderLeftWidth: BorderLeftWidth

    /**
     * The **`border-right-color`** CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties `border-color` or `border-right`.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
     */
    var borderRightColor: BorderRightColor

    /**
     * The **`border-right-style`** CSS property sets the line style of an element's right `border`.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-right-style
     */
    var borderRightStyle: BorderRightStyle

    /**
     * The **`border-right-width`** CSS property sets the width of the right border of an element.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
     */
    var borderRightWidth: BorderRightWidth

    /**
     * The **`border-spacing`** CSS property sets the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
     *
     * **Syntax**: `<length> <length>?`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
     */
    var borderSpacing: BorderSpacing

    /**
     * The **`border-start-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`. This is useful when building styles to work regardless of the text orientation and writing mode.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **89** | **66**  |   No   | **89** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-start-end-radius
     */
    var borderStartEndRadius: BorderStartEndRadius

    /**
     * The **`border-start-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`. This is useful when building styles to work regardless of the text orientation and writing mode.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **89** | **66**  |   No   | **89** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-start-start-radius
     */
    var borderStartStartRadius: BorderStartStartRadius

    /**
     * The **`border-top-color`** CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties `border-color` or `border-top`.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
     */
    var borderTopColor: BorderTopColor

    /**
     * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * |  **4**  |  **4**  |  **5**  | **12** | **9** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-top-left-radius
     */
    var borderTopLeftRadius: BorderTopLeftRadius

    /**
     * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
     *
     * **Syntax**: `<length-percentage>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * |  **4**  |  **4**  |  **5**  | **12** | **9** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-top-right-radius
     */
    var borderTopRightRadius: BorderTopRightRadius

    /**
     * The **`border-top-style`** CSS property sets the line style of an element's top `border`.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-top-style
     */
    var borderTopStyle: BorderTopStyle

    /**
     * The **`border-top-width`** CSS property sets the width of the top border of an element.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
     */
    var borderTopWidth: BorderTopWidth

    /**
     * The **`bottom`** CSS property participates in setting the vertical position of a positioned element. It has no effect on non-positioned elements.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/bottom
     */
    var bottom: Bottom

    /**
     * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
     *
     * **Syntax**: `slice | clone`
     *
     * **Initial value**: `slice`
     *
     * |    Chrome    | Firefox |    Safari     |     Edge     | IE  |
     * | :----------: | :-----: | :-----------: | :----------: | :-: |
     * | **22** _-x-_ | **32**  | **6.1** _-x-_ | **79** _-x-_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/box-decoration-break
     */
    var boxDecorationBreak: BoxDecorationBreak

    /**
     * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radius, and color.
     *
     * **Syntax**: `none | <shadow>#`
     *
     * **Initial value**: `none`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * | **10**  |  **4**  | **5.1** | **12** | **9** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/box-shadow
     */
    var boxShadow: BoxShadow

    /**
     * The **`box-sizing`** CSS property sets how the total width and height of an element is calculated.
     *
     * **Syntax**: `content-box | border-box`
     *
     * **Initial value**: `content-box`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * | **10**  | **29**  | **5.1** | **12** | **8** |
     * | 1 _-x-_ | 1 _-x-_ | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/box-sizing
     */
    var boxSizing: BoxSizing

    /**
     * The **`break-after`** CSS property sets how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
     *
     * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
     *
     * **Initial value**: `auto`
     *
     * ---
     *
     * _Supported in Multi-column Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **50** | **65**  |   No   | **12** | **10** |
     *
     * ---
     *
     * _Supported in Paged Media_
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **50** | **65**  | **10** | **12** | **10** |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/break-after
     */
    var breakAfter: BreakAfter

    /**
     * The **`break-before`** CSS property sets how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
     *
     * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
     *
     * **Initial value**: `auto`
     *
     * ---
     *
     * _Supported in Multi-column Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **50** | **65**  |   No   | **12** | **10** |
     *
     * ---
     *
     * _Supported in Paged Media_
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **50** | **65**  | **10** | **12** | **10** |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/break-before
     */
    var breakBefore: BreakBefore

    /**
     * The **`break-inside`** CSS property sets how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
     *
     * **Syntax**: `auto | avoid | avoid-page | avoid-column | avoid-region`
     *
     * **Initial value**: `auto`
     *
     * ---
     *
     * _Supported in Multi-column Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **50** | **65**  | **10** | **12** | **10** |
     *
     * ---
     *
     * _Supported in Paged Media_
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **50** | **65**  | **10** | **12** | **10** |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
     */
    var breakInside: BreakInside

    /**
     * The **`caption-side`** CSS property puts the content of a table's `<caption>` on the specified side. The values are relative to the `writing-mode` of the table.
     *
     * **Syntax**: `top | bottom | block-start | block-end | inline-start | inline-end`
     *
     * **Initial value**: `top`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/caption-side
     */
    var captionSide: CaptionSide

    /**
     * The **`caret-color`** CSS property sets the color of the **insertion caret**, the visible marker where the next character typed will be inserted. This is sometimes referred to as the **text input cursor**. The caret appears in elements such as `<input>` or those with the `contenteditable` attribute. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
     *
     * **Syntax**: `auto | <color>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **53**  | **11.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
     */
    var caretColor: CaretColor

    /**
     * The **`clear`** CSS property sets whether an element must be moved below (cleared) floating elements that precede it. The `clear` property applies to floating and non-floating elements.
     *
     * **Syntax**: `none | left | right | both | inline-start | inline-end`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/clear
     */
    var clear: Clear

    /**
     * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
     *
     * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
     *
     * **Initial value**: `none`
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :------: | :-----: | :-------: | :----: | :----: |
     * |  **55**  | **3.5** |  **9.1**  | **12** | **10** |
     * | 23 _-x-_ |         | 6.1 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
     */
    var clipPath: ClipPath

    /**
     * The **`color`** CSS property sets the foreground color value of an element's text and text decorations, and sets the `<currentcolor>` value. `currentcolor` may be used as an indirect value on _other_ properties and is the default for other color properties, such as `border-color`.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: Varies from one browser to another
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/color
     */
    var color: Color

    /**
     * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
     *
     * **Syntax**: `economy | exact`
     *
     * **Initial value**: `economy`
     *
     * |                Chrome                 | Firefox |                Safari                |                 Edge                  | IE  |
     * | :-----------------------------------: | :-----: | :----------------------------------: | :-----------------------------------: | :-: |
     * | **49** _(-webkit-print-color-adjust)_ | **48**  | **6** _(-webkit-print-color-adjust)_ | **79** _(-webkit-print-color-adjust)_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
     */
    var colorAdjust: ColorAdjust

    /**
     * The **`color-scheme`** CSS property allows an element to indicate which color schemes it can comfortably be rendered in.
     *
     * **Syntax**: `normal | [ light | dark | <custom-ident> ]+`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **81** |   No    | **13** | **81** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/color-scheme
     */
    var colorScheme: ColorScheme

    /**
     * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
     *
     * **Syntax**: `<integer> | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **50**  | **52**  |  **9**  | **12** | **10** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-count
     */
    var columnCount: ColumnCount

    /**
     * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
     *
     * **Syntax**: `auto | balance | balance-all`
     *
     * **Initial value**: `balance`
     *
     * | Chrome | Firefox | Safari  |  Edge  |   IE   |
     * | :----: | :-----: | :-----: | :----: | :----: |
     * | **50** | **52**  |  **9**  | **12** | **10** |
     * |        |         | 8 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
     */
    var columnFill: ColumnFill

    /**
     * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
     *
     * **Syntax**: `normal | <length-percentage>`
     *
     * **Initial value**: `normal`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **84** | **63**  |   No   | **84** | No  |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * |         Chrome         |        Firefox         |          Safari          |  Edge  | IE  |
     * | :--------------------: | :--------------------: | :----------------------: | :----: | :-: |
     * |         **66**         |         **61**         |         **12.1**         | **16** | No  |
     * | 57 _(grid-column-gap)_ | 52 _(grid-column-gap)_ | 10.1 _(grid-column-gap)_ |        |     |
     *
     * ---
     *
     * _Supported in Multi-column Layout_
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **50**  | **52**  | **10**  | **12** | **10** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |        |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-gap
     */
    var columnGap: ColumnGap

    /**
     * The **`column-rule-color`** CSS property sets the color of the line drawn between columns in a multi-column layout.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **50**  | **52**  |  **9**  | **12** | **10** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
     */
    var columnRuleColor: ColumnRuleColor

    /**
     * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
     *
     * **Syntax**: `<'border-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **50**  | **52**  |  **9**  | **12** | **10** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
     */
    var columnRuleStyle: ColumnRuleStyle

    /**
     * The **`column-rule-width`** CSS property sets the width of the line drawn between columns in a multi-column layout.
     *
     * **Syntax**: `<'border-width'>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **50**  | **52**  |  **9**  | **12** | **10** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
     */
    var columnRuleWidth: ColumnRuleWidth

    /**
     * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
     *
     * **Syntax**: `none | all`
     *
     * **Initial value**: `none`
     *
     * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :-----: | :-----: | :-------: | :----: | :----: |
     * | **50**  | **71**  |   **9**   | **12** | **10** |
     * | 6 _-x-_ |         | 5.1 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-span
     */
    var columnSpan: ColumnSpan

    /**
     * The **`column-width`** CSS property sets the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
     *
     * **Syntax**: `<length> | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **50**  | **50**  |  **9**  | **12** | **10** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-width
     */
    var columnWidth: ColumnWidth

    /**
     * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page, leading to obvious performance benefits.
     *
     * **Syntax**: `none | strict | content | [ size || layout || style || paint ]`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **52** | **69**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/contain
     */
    var contain: Contain

    /**
     * The **`content`** CSS property replaces an element with a generated value. Objects inserted using the `content` property are **anonymous replaced elements**_._
     *
     * **Syntax**: `normal | none | [ <content-replacement> | <content-list> ] [/ <string> ]?`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/content
     */
    var content: Content

    /**
     * The **`content-visibility`** CSS property controls whether or not an element renders its contents at all, along with forcing a strong set of containments, allowing user agents to potentially omit large swathes of layout and rendering work until it becomes needed. Basically it enables the user agent to skip an element's rendering work, including layout and painting, until it is needed, makes the initial page load much faster.
     *
     * **Syntax**: `visible | auto | hidden`
     *
     * **Initial value**: `visible`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **85** |   No    |   No   | **85** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/content-visibility
     */
    var contentVisibility: ContentVisibility

    /**
     * The **`counter-increment`** CSS property increases or decreases the value of a CSS counter by a given value.
     *
     * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **2**  |  **1**  | **3**  | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
     */
    var counterIncrement: CounterIncrement

    /**
     * The **`counter-reset`** CSS property resets a CSS counter to a given value.
     *
     * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **2**  |  **1**  | **3**  | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
     */
    var counterReset: CounterReset

    /**
     * The **`counter-set`** CSS property sets a CSS counter to a given value. It manipulates the value of existing counters, and will only create new counters if there isn't already a counter of the given name on the element.
     *
     * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **85** | **68**  |   No   | **85** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/counter-set
     */
    var counterSet: CounterSet

    /**
     * The **`cursor`** CSS property sets the type of mouse cursor, if any, to show when the mouse pointer is over an element.
     *
     * **Syntax**: `[ [ <url> [ <x> <y> ]? , ]* [ auto | default | none | context-menu | help | pointer | progress | wait | cell | crosshair | text | vertical-text | alias | copy | move | no-drop | not-allowed | e-resize | n-resize | ne-resize | nw-resize | s-resize | se-resize | sw-resize | w-resize | ew-resize | ns-resize | nesw-resize | nwse-resize | col-resize | row-resize | all-scroll | zoom-in | zoom-out | grab | grabbing ] ]`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  |  **1**  | **1.2** | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/cursor
     */
    var cursor: Cursor

    /**
     * The **`direction`** CSS property sets the direction of text, table columns, and horizontal overflow. Use `rtl` for languages written from right to left (like Hebrew or Arabic), and `ltr` for those written from left to right (like English and most other languages).
     *
     * **Syntax**: `ltr | rtl`
     *
     * **Initial value**: `ltr`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **2**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/direction
     */
    var direction: Direction

    /**
     * The **`display`** CSS property sets whether an element is treated as a block or inline element and the layout used for its children, such as flow layout, grid or flex.
     *
     * **Syntax**: `[ <display-outside> || <display-inside> ] | <display-listitem> | <display-internal> | <display-box> | <display-legacy>`
     *
     * **Initial value**: `inline`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/display
     */
    var display: Display

    /**
     * The **`empty-cells`** CSS property sets whether borders and backgrounds appear around `<table>` cells that have no visible content.
     *
     * **Syntax**: `show | hide`
     *
     * **Initial value**: `show`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  |  **1**  | **1.2** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
     */
    var emptyCells: EmptyCells

    /**
     * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
     *
     * **Syntax**: `none | <filter-function-list>`
     *
     * **Initial value**: `none`
     *
     * |  Chrome  | Firefox | Safari  |  Edge  | IE  |
     * | :------: | :-----: | :-----: | :----: | :-: |
     * |  **53**  | **35**  | **9.1** | **12** | No  |
     * | 18 _-x-_ |         | 6 _-x-_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/filter
     */
    var filter: Filter

    /**
     * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
     *
     * **Syntax**: `content | <'width'>`
     *
     * **Initial value**: `auto`
     *
     * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :------: | :-----: | :-----: | :----: | :----: |
     * |  **29**  | **22**  |  **9**  | **12** | **11** |
     * | 22 _-x-_ |         | 7 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/flex-basis
     */
    var flexBasis: FlexBasis

    /**
     * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
     *
     * **Syntax**: `row | row-reverse | column | column-reverse`
     *
     * **Initial value**: `row`
     *
     * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
     * | :------: | :-----: | :-----: | :----: | :------: |
     * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
     * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/flex-direction
     */
    var flexDirection: FlexDirection

    /**
     * The **`flex-grow`** CSS property sets the flex grow factor of a flex item main size.
     *
     * **Syntax**: `<number>`
     *
     * **Initial value**: `0`
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |            IE            |
     * | :------: | :-----: | :-------: | :----: | :----------------------: |
     * |  **29**  | **20**  |   **9**   | **12** |          **11**          |
     * | 22 _-x-_ |         | 6.1 _-x-_ |        | 10 _(-ms-flex-positive)_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
     */
    var flexGrow: FlexGrow

    /**
     * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
     *
     * **Syntax**: `<number>`
     *
     * **Initial value**: `1`
     *
     * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :------: | :-----: | :-----: | :----: | :----: |
     * |  **29**  | **20**  |  **9**  | **12** | **10** |
     * | 22 _-x-_ |         | 8 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
     */
    var flexShrink: FlexShrink

    /**
     * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
     *
     * **Syntax**: `nowrap | wrap | wrap-reverse`
     *
     * **Initial value**: `nowrap`
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :------: | :-----: | :-------: | :----: | :----: |
     * |  **29**  | **28**  |   **9**   | **12** | **11** |
     * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/flex-wrap
     */
    var flexWrap: FlexWrap

    /**
     * The **`float`** CSS property places an element on the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the page, though still remaining a part of the flow (in contrast to absolute positioning).
     *
     * **Syntax**: `left | right | none | inline-start | inline-end`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/float
     */
    var float: Float

    /**
     * The **`font-family`** CSS property specifies a prioritized list of one or more font family names and/or generic family names for the selected element.
     *
     * **Syntax**: `[ <family-name> | <generic-family> ]#`
     *
     * **Initial value**: depends on user agent
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-family
     */
    var fontFamily: FontFamily

    /**
     * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
     *
     * **Syntax**: `normal | <feature-tag-value>#`
     *
     * **Initial value**: `normal`
     *
     * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
     * | :------: | :------: | :-----: | :----: | :----: |
     * |  **48**  |  **34**  | **9.1** | **15** | **10** |
     * | 16 _-x-_ | 15 _-x-_ |         |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-feature-settings
     */
    var fontFeatureSettings: FontFeatureSettings

    /**
     * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
     *
     * **Syntax**: `auto | normal | none`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari  |  Edge  | IE  |
     * | :----: | :-----: | :-----: | :----: | :-: |
     * | **33** | **32**  |  **9**  | **79** | No  |
     * |        |         | 6 _-x-_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
     */
    var fontKerning: FontKerning

    /**
     * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
     *
     * **Syntax**: `normal | <string>`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **34**  |   No   |  No  | No  |
     * |        | 4 _-x-_ |        |      |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-language-override
     */
    var fontLanguageOverride: FontLanguageOverride

    /**
     * The **`font-optical-sizing`** CSS property sets whether text rendering is optimized for viewing at different sizes.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **79** | **62**  | **11** | **17** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
     */
    var fontOpticalSizing: FontOpticalSizing

    /**
     * The **`font-size`** CSS property sets the size of the font. Changing the font size also updates the sizes of the font size-relative `<length>` units, such as `em`, `ex`, and so forth.
     *
     * **Syntax**: `<absolute-size> | <relative-size> | <length-percentage>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-size
     */
    var fontSize: FontSize

    /**
     * The **`font-size-adjust`** CSS property sets the size of lower-case letters relative to the current font size (which defines the size of upper-case letters).
     *
     * **Syntax**: `none | <number>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |  n/a   |  **1**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
     */
    var fontSizeAdjust: FontSizeAdjust

    /**
     * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
     *
     * **Syntax**: `auto | never | always | <absolute-size> | <length>`
     *
     * **Initial value**: `auto`
     *
     * |              Chrome              |              Firefox               |              Safari              |               Edge                | IE  |
     * | :------------------------------: | :--------------------------------: | :------------------------------: | :-------------------------------: | :-: |
     * | **5** _(-webkit-font-smoothing)_ | **25** _(-moz-osx-font-smoothing)_ | **4** _(-webkit-font-smoothing)_ | **79** _(-webkit-font-smoothing)_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-smooth
     */
    var fontSmooth: FontSmooth

    /**
     * The **`font-stretch`** CSS property selects a normal, condensed, or expanded face from a font.
     *
     * **Syntax**: `<font-stretch-absolute>`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **60** |  **9**  | **11** | **12** | **9** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-stretch
     */
    var fontStretch: FontStretch

    /**
     * The **`font-style`** CSS property sets whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
     *
     * **Syntax**: `normal | italic | oblique <angle>?`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-style
     */
    var fontStyle: FontStyle

    /**
     * The **`font-synthesis`** CSS property controls which missing typefaces, bold or italic, may be synthesized by the browser.
     *
     * **Syntax**: `none | [ weight || style ]`
     *
     * **Initial value**: `weight style`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **34**  | **9**  |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-synthesis
     */
    var fontSynthesis: FontSynthesis

    /**
     * The **`font-variant`** CSS shorthand property allows you to set all the font variants for a font.
     *
     * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> || stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) || [ small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps ] || <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero || <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
     */
    var fontVariant: FontVariant

    /**
     * The **`font-variant-caps`** CSS property controls the use of alternate glyphs for capital letters.
     *
     * **Syntax**: `normal | small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari  |  Edge  | IE  |
     * | :----: | :-----: | :-----: | :----: | :-: |
     * | **52** | **34**  | **9.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
     */
    var fontVariantCaps: FontVariantCaps

    /**
     * The **`font-variant-east-asian`** CSS property controls the use of alternate glyphs for East Asian scripts, like Japanese and Chinese.
     *
     * **Syntax**: `normal | [ <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **63** | **34**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
     */
    var fontVariantEastAsian: FontVariantEastAsian

    /**
     * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
     *
     * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
     *
     * **Initial value**: `normal`
     *
     * |  Chrome  | Firefox | Safari  |  Edge  | IE  |
     * | :------: | :-----: | :-----: | :----: | :-: |
     * |  **34**  | **34**  | **9.1** | **79** | No  |
     * | 31 _-x-_ |         | 7 _-x-_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-ligatures
     */
    var fontVariantLigatures: FontVariantLigatures

    /**
     * The **`font-variant-numeric`** CSS property controls the usage of alternate glyphs for numbers, fractions, and ordinal markers.
     *
     * **Syntax**: `normal | [ <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero ]`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari  |  Edge  | IE  |
     * | :----: | :-----: | :-----: | :----: | :-: |
     * | **52** | **34**  | **9.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-numeric
     */
    var fontVariantNumeric: FontVariantNumeric

    /**
     * The **`font-variant-position`** CSS property controls the use of alternate, smaller glyphs that are positioned as superscript or subscript.
     *
     * **Syntax**: `normal | sub | super`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **34**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
     */
    var fontVariantPosition: FontVariantPosition

    /**
     * The **`font-variation-settings`** CSS property provides low-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
     *
     * **Syntax**: `normal | [ <string> <number> ]#`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **62** | **62**  | **11** | **17** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
     */
    var fontVariationSettings: FontVariationSettings

    /**
     * The **`font-weight`** CSS property sets the weight (or boldness) of the font. The weights available depend on the `font-family` that is currently set.
     *
     * **Syntax**: `<font-weight-absolute> | bolder | lighter`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **2**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
     */
    var fontWeight: FontWeight

    /**
     * The **`forced-color-adjust`** CSS property allows authors to opt certain elements out of forced colors mode. This then restores the control of those values to CSS.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |              Edge               |                 IE                  |
     * | :----: | :-----: | :----: | :-----------------------------: | :---------------------------------: |
     * | **89** |   No    |   No   |             **79**              | **10** _(-ms-high-contrast-adjust)_ |
     * |        |         |        | 12 _(-ms-high-contrast-adjust)_ |                                     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/forced-color-adjust
     */
    var forcedColorAdjust: ForcedColorAdjust

    /**
     * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track or pattern of tracks.
     *
     * **Syntax**: `<track-size>+`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  |             IE              |
     * | :----: | :-----: | :------: | :----: | :-------------------------: |
     * | **57** | **70**  | **10.1** | **16** | **10** _(-ms-grid-columns)_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
     */
    var gridAutoColumns: GridAutoColumns

    /**
     * The **`grid-auto-flow`** CSS property controls how the auto-placement algorithm works, specifying exactly how auto-placed items get flowed into the grid.
     *
     * **Syntax**: `[ row | column ] || dense`
     *
     * **Initial value**: `row`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
     */
    var gridAutoFlow: GridAutoFlow

    /**
     * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track or pattern of tracks.
     *
     * **Syntax**: `<track-size>+`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  |            IE            |
     * | :----: | :-----: | :------: | :----: | :----------------------: |
     * | **57** | **70**  | **10.1** | **16** | **10** _(-ms-grid-rows)_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
     */
    var gridAutoRows: GridAutoRows

    /**
     * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block-end edge of its grid area.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
     */
    var gridColumnEnd: GridColumnEnd

    /**
     * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block-start edge of the grid area.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
     */
    var gridColumnStart: GridColumnStart

    /**
     * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-end edge of its grid area.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
     */
    var gridRowEnd: GridRowEnd

    /**
     * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start edge of its grid area.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
     */
    var gridRowStart: GridRowStart

    /**
     * The **`grid-template-areas`** CSS property specifies named grid areas, establishing the cells in the grid and assigning them names.
     *
     * **Syntax**: `none | <string>+`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
     */
    var gridTemplateAreas: GridTemplateAreas

    /**
     * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
     *
     * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |  Safari  |  Edge  |             IE              |
     * | :----: | :-----: | :------: | :----: | :-------------------------: |
     * | **57** | **52**  | **10.1** | **16** | **10** _(-ms-grid-columns)_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
     */
    var gridTemplateColumns: GridTemplateColumns

    /**
     * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
     *
     * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |  Safari  |  Edge  |            IE            |
     * | :----: | :-----: | :------: | :----: | :----------------------: |
     * | **57** | **52**  | **10.1** | **16** | **10** _(-ms-grid-rows)_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
     */
    var gridTemplateRows: GridTemplateRows

    /**
     * The **`hanging-punctuation`** CSS property specifies whether a punctuation mark should hang at the start or end of a line of text. Hanging punctuation may be placed outside the line box.
     *
     * **Syntax**: `none | [ first || [ force-end | allow-end ] || last ]`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   |   No    | **10** |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/hanging-punctuation
     */
    var hangingPunctuation: HangingPunctuation

    /**
     * The **`height`** CSS property specifies the height of an element. By default, the property defines the height of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the height of the border area.
     *
     * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content | fit-content(<length-percentage>)`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/height
     */
    var height: Height

    /**
     * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. It can prevent hyphenation entirely, hyphenate at manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
     *
     * **Syntax**: `none | manual | auto`
     *
     * **Initial value**: `manual`
     *
     * |  Chrome  | Firefox |    Safari     |     Edge     |      IE      |
     * | :------: | :-----: | :-----------: | :----------: | :----------: |
     * |  **55**  | **43**  | **5.1** _-x-_ | **12** _-x-_ | **10** _-x-_ |
     * | 13 _-x-_ | 6 _-x-_ |               |              |              |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/hyphens
     */
    var hyphens: Hyphens

    /**
     * The **`image-orientation`** CSS property specifies a layout-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
     *
     * **Syntax**: `from-image | <angle> | [ <angle>? flip ]`
     *
     * **Initial value**: `from-image`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **81** | **26**  | **13.1** | **81** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
     */
    var imageOrientation: ImageOrientation

    /**
     * The **`image-rendering`** CSS property sets an image scaling algorithm. The property applies to an element itself, to any images set in its other properties, and to its descendants.
     *
     * **Syntax**: `auto | crisp-edges | pixelated`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **13** | **3.6** | **6**  | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
     */
    var imageRendering: ImageRendering

    /**
     * **Syntax**: `[ from-image || <resolution> ] && snap?`
     *
     * **Initial value**: `1dppx`
     */
    var imageResolution: ImageResolution

    /**
     * The `initial-letter` CSS property sets styling for dropped, raised, and sunken initial letters.
     *
     * **Syntax**: `normal | [ <number> <integer>? ]`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   |   No    | **9**  |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
     */
    var initialLetter: InitialLetter

    /**
     * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
     *
     * **Syntax**: `<'width'>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
     */
    var inlineSize: InlineSize

    /**
     * The **`inset`** CSS property is a shorthand that corresponds to the `top`, `right`, `bottom`, and/or `left` properties. It has the same multi-value syntax of the `margin` shorthand.
     *
     * **Syntax**: `<'top'>{1,4}`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inset
     */
    var inset: Inset

    /**
     * The **`inset-inline`** CSS property defines the logical start and end offsets of an element in the inline direction, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>{1,2}`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **63**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
     */
    var insetBlock: InsetBlock

    /**
     * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **63**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
     */
    var insetBlockEnd: InsetBlockEnd

    /**
     * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **63**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
     */
    var insetBlockStart: InsetBlockStart

    /**
     * The **`inset-inline`** CSS property defines the logical start and end offsets of an element in the inline direction, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>{1,2}`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **63**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
     */
    var insetInline: InsetInline

    /**
     * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **63**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
     */
    var insetInlineEnd: InsetInlineEnd

    /**
     * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **63**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
     */
    var insetInlineStart: InsetInlineStart

    /**
     * The **`isolation`** CSS property determines whether an element must create a new stacking context.
     *
     * **Syntax**: `auto | isolate`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **41** | **36**  | **8**  | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/isolation
     */
    var isolation: Isolation

    /**
     * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
     *
     * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
     *
     * **Initial value**: `normal`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :------: | :-----: | :-------: | :----: | :----: |
     * |  **52**  | **20**  |   **9**   | **12** | **11** |
     * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/justify-content
     */
    var justifyContent: JustifyContent

    /**
     * The CSS **`justify-items`** property defines the default `justify-self` for all items of the box, giving them all a default way of justifying each box along the appropriate axis.
     *
     * **Syntax**: `normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ] | legacy | legacy && [ left | right | center ]`
     *
     * **Initial value**: `legacy`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **52** | **20**  | **9**  | **12** | **11** |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **45**  | **10.1** | **16** | No  |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/justify-items
     */
    var justifyItems: JustifyItems

    /**
     * The CSS **`justify-self`** property sets the way a box is justified inside its alignment container along the appropriate axis.
     *
     * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ]`
     *
     * **Initial value**: `auto`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **45**  | **10.1** | **16** | No  |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
     * | :----: | :-----: | :------: | :----: | :----------: |
     * | **57** | **45**  | **10.1** | **16** | **10** _-x-_ |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/justify-self
     */
    var justifySelf: JustifySelf

    /**
     * The **`justify-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their inline axis.
     *
     * **Syntax**: `[ normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ] ]#`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   |   n/a   |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/justify-tracks
     */
    var justifyTracks: JustifyTracks

    /**
     * The **`left`** CSS property participates in specifying the horizontal position of a positioned element. It has no effect on non-positioned elements.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/left
     */
    var left: Left

    /**
     * The **`letter-spacing`** CSS property sets the horizontal spacing behavior between text characters. This value is added to the natural spacing between characters while rendering the text. Positive values of `letter-spacing` causes characters to spread farther apart, while negative values of `letter-spacing` bring characters closer together.
     *
     * **Syntax**: `normal | <length>`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
     */
    var letterSpacing: LetterSpacing

    /**
     * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
     *
     * **Syntax**: `auto | loose | normal | strict | anywhere`
     *
     * **Initial value**: `auto`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE    |
     * | :-----: | :-----: | :-----: | :----: | :-----: |
     * | **58**  | **69**  | **11**  | **14** | **5.5** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |         |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/line-break
     */
    var lineBreak: LineBreak

    /**
     * The **`line-height`** CSS property sets the height of a line box. It's commonly used to set the distance between lines of text. On block-level elements, it specifies the minimum height of line boxes within the element. On non-replaced inline elements, it specifies the height that is used to calculate line box height.
     *
     * **Syntax**: `normal | <number> | <length> | <percentage>`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/line-height
     */
    var lineHeight: LineHeight

    /**
     * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |  n/a   |   No    |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/line-height-step
     */
    var lineHeightStep: LineHeightStep

    /**
     * The **`list-style-image`** CSS property sets an image to be used as the list item marker.
     *
     * **Syntax**: `<image> | none`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
     */
    var listStyleImage: ListStyleImage

    /**
     * The **`list-style-position`** CSS property sets the position of the `::marker` relative to a list item.
     *
     * **Syntax**: `inside | outside`
     *
     * **Initial value**: `outside`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
     */
    var listStylePosition: ListStylePosition

    /**
     * The **`list-style-type`** CSS property sets the marker (such as a disc, character, or custom counter style) of a list item element.
     *
     * **Syntax**: `<counter-style> | <string> | none`
     *
     * **Initial value**: `disc`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
     */
    var listStyleType: ListStyleType

    /**
     * The **`margin-block`** CSS shorthand property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'margin-left'>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
     */
    var marginBlock: MarginBlock

    /**
     * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'margin-left'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
     */
    var marginBlockEnd: MarginBlockEnd

    /**
     * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'margin-left'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
     */
    var marginBlockStart: MarginBlockStart

    /**
     * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
     */
    var marginBottom: MarginBottom

    /**
     * The **`margin-inline`** CSS shorthand property is a shorthand property that defines both the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'margin-left'>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
     */
    var marginInline: MarginInline

    /**
     * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'margin-left'>`
     *
     * **Initial value**: `0`
     *
     * |          Chrome          |        Firefox        |          Safari          |  Edge  | IE  |
     * | :----------------------: | :-------------------: | :----------------------: | :----: | :-: |
     * |          **69**          |        **41**         |         **12.1**         | **79** | No  |
     * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ | 3 _(-webkit-margin-end)_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
     */
    var marginInlineEnd: MarginInlineEnd

    /**
     * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Syntax**: `<'margin-left'>`
     *
     * **Initial value**: `0`
     *
     * |           Chrome           |         Firefox         |           Safari           |  Edge  | IE  |
     * | :------------------------: | :---------------------: | :------------------------: | :----: | :-: |
     * |           **69**           |         **41**          |          **12.1**          | **79** | No  |
     * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ | 3 _(-webkit-margin-start)_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
     */
    var marginInlineStart: MarginInlineStart

    /**
     * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
     */
    var marginLeft: MarginLeft

    /**
     * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
     */
    var marginRight: MarginRight

    /**
     * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
     */
    var marginTop: MarginTop

    /**
     * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
     *
     * **Syntax**: `luminance | alpha`
     *
     * **Initial value**: `alpha`
     */
    var maskBorderMode: MaskBorderMode

    /**
     * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
     *
     * **Syntax**: `[ <length> | <number> ]{1,4}`
     *
     * **Initial value**: `0`
     *
     * |                 Chrome                  | Firefox |                  Safari                   |                   Edge                   | IE  |
     * | :-------------------------------------: | :-----: | :---------------------------------------: | :--------------------------------------: | :-: |
     * | **1** _(-webkit-mask-box-image-outset)_ |   No    | **3.1** _(-webkit-mask-box-image-outset)_ | **79** _(-webkit-mask-box-image-outset)_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-border-outset
     */
    var maskBorderOutset: MaskBorderOutset

    /**
     * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
     *
     * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
     *
     * **Initial value**: `stretch`
     *
     * |                 Chrome                  | Firefox |                  Safari                   |                   Edge                   | IE  |
     * | :-------------------------------------: | :-----: | :---------------------------------------: | :--------------------------------------: | :-: |
     * | **1** _(-webkit-mask-box-image-repeat)_ |   No    | **3.1** _(-webkit-mask-box-image-repeat)_ | **79** _(-webkit-mask-box-image-repeat)_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-border-repeat
     */
    var maskBorderRepeat: MaskBorderRepeat

    /**
     * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
     *
     * **Syntax**: `<number-percentage>{1,4} fill?`
     *
     * **Initial value**: `0`
     *
     * |                 Chrome                 | Firefox |                  Safari                  |                  Edge                   | IE  |
     * | :------------------------------------: | :-----: | :--------------------------------------: | :-------------------------------------: | :-: |
     * | **1** _(-webkit-mask-box-image-slice)_ |   No    | **3.1** _(-webkit-mask-box-image-slice)_ | **79** _(-webkit-mask-box-image-slice)_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-border-slice
     */
    var maskBorderSlice: MaskBorderSlice

    /**
     * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
     *
     * **Syntax**: `none | <image>`
     *
     * **Initial value**: `none`
     *
     * |                 Chrome                  | Firefox |                  Safari                   |                   Edge                   | IE  |
     * | :-------------------------------------: | :-----: | :---------------------------------------: | :--------------------------------------: | :-: |
     * | **1** _(-webkit-mask-box-image-source)_ |   No    | **3.1** _(-webkit-mask-box-image-source)_ | **79** _(-webkit-mask-box-image-source)_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-border-source
     */
    var maskBorderSource: MaskBorderSource

    /**
     * The **`mask-border-width`** CSS property sets the width of an element's mask border.
     *
     * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
     *
     * **Initial value**: `auto`
     *
     * |                 Chrome                 | Firefox |                  Safari                  |                  Edge                   | IE  |
     * | :------------------------------------: | :-----: | :--------------------------------------: | :-------------------------------------: | :-: |
     * | **1** _(-webkit-mask-box-image-width)_ |   No    | **3.1** _(-webkit-mask-box-image-width)_ | **79** _(-webkit-mask-box-image-width)_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-border-width
     */
    var maskBorderWidth: MaskBorderWidth

    /**
     * The **`mask-clip`** CSS property determines the area which is affected by a mask. The painted content of an element must be restricted to this area.
     *
     * **Syntax**: `[ <geometry-box> | no-clip ]#`
     *
     * **Initial value**: `border-box`
     *
     * |   Chrome    | Firefox |   Safari    |     Edge     | IE  |
     * | :---------: | :-----: | :---------: | :----------: | :-: |
     * | **1** _-x-_ | **53**  | **4** _-x-_ | **79** _-x-_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
     */
    var maskClip: MaskClip

    /**
     * The **`mask-composite`** CSS property represents a compositing operation used on the current mask layer with the mask layers below it.
     *
     * **Syntax**: `<compositing-operator>#`
     *
     * **Initial value**: `add`
     *
     * | Chrome | Firefox | Safari | Edge  | IE  |
     * | :----: | :-----: | :----: | :---: | :-: |
     * |   No   | **53**  |   No   | 18-79 | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-composite
     */
    var maskComposite: MaskComposite

    /**
     * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
     *
     * **Syntax**: `<mask-reference>#`
     *
     * **Initial value**: `none`
     *
     * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
     * | :---------: | :-----: | :---------: | :----: | :-: |
     * | **1** _-x-_ | **53**  | **4** _-x-_ | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-image
     */
    var maskImage: MaskImage

    /**
     * The **`mask-mode`** CSS property sets whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
     *
     * **Syntax**: `<masking-mode>#`
     *
     * **Initial value**: `match-source`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **53**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
     */
    var maskMode: MaskMode

    /**
     * The **`mask-origin`** CSS property sets the origin of a mask.
     *
     * **Syntax**: `<geometry-box>#`
     *
     * **Initial value**: `border-box`
     *
     * |   Chrome    | Firefox |   Safari    |     Edge     | IE  |
     * | :---------: | :-----: | :---------: | :----------: | :-: |
     * | **1** _-x-_ | **53**  | **4** _-x-_ | **79** _-x-_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
     */
    var maskOrigin: MaskOrigin

    /**
     * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
     *
     * **Syntax**: `<position>#`
     *
     * **Initial value**: `center`
     *
     * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
     * | :---------: | :-----: | :-----------: | :----: | :-: |
     * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
     */
    var maskPosition: MaskPosition

    /**
     * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
     *
     * **Syntax**: `<repeat-style>#`
     *
     * **Initial value**: `no-repeat`
     *
     * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
     * | :---------: | :-----: | :-----------: | :----: | :-: |
     * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
     */
    var maskRepeat: MaskRepeat

    /**
     * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
     *
     * **Syntax**: `<bg-size>#`
     *
     * **Initial value**: `auto`
     *
     * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
     * | :---------: | :-----: | :---------: | :----: | :-: |
     * | **4** _-x-_ | **53**  | **4** _-x-_ | **18** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
     */
    var maskSize: MaskSize

    /**
     * The **`mask-type`** CSS property sets whether an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
     *
     * **Syntax**: `luminance | alpha`
     *
     * **Initial value**: `luminance`
     *
     * | Chrome | Firefox | Safari  |  Edge  | IE  |
     * | :----: | :-----: | :-----: | :----: | :-: |
     * | **24** | **35**  | **6.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
     */
    var maskType: MaskType

    /**
     * The `math-style` property indicates whether MathML equations should render with normal or compact height.
     *
     * **Syntax**: `normal | compact`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |  n/a   |   n/a   |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/math-style
     */
    var mathStyle: MathStyle

    /**
     * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
     *
     * **Syntax**: `<'max-width'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
     */
    var maxBlockSize: MaxBlockSize

    /**
     * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
     *
     * **Syntax**: `none | <length-percentage> | min-content | max-content | fit-content | fit-content(<length-percentage>)`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **18** |  **1**  | **1.3** | **12** | **7** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/max-height
     */
    var maxHeight: MaxHeight

    /**
     * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block, depending on its writing mode. It corresponds to either the `max-width` or the `max-height` property, depending on the value of `writing-mode`.
     *
     * **Syntax**: `<'max-width'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |   Safari   |  Edge  | IE  |
     * | :----: | :-----: | :--------: | :----: | :-: |
     * | **57** | **41**  |  **12.1**  | **79** | No  |
     * |        |         | 10.1 _-x-_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
     */
    var maxInlineSize: MaxInlineSize

    /**
     * **Syntax**: `none | <integer>`
     *
     * **Initial value**: `none`
     */
    var maxLines: MaxLines

    /**
     * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
     *
     * **Syntax**: `none | <length-percentage> | min-content | max-content | fit-content | fit-content(<length-percentage>)`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **7** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/max-width
     */
    var maxWidth: MaxWidth

    /**
     * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
     *
     * **Syntax**: `<'min-width'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
     */
    var minBlockSize: MinBlockSize

    /**
     * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
     *
     * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content | fit-content(<length-percentage>)`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  |  **3**  | **1.3** | **12** | **7** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/min-height
     */
    var minHeight: MinHeight

    /**
     * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
     *
     * **Syntax**: `<'min-width'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
     */
    var minInlineSize: MinInlineSize

    /**
     * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
     *
     * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content | fit-content(<length-percentage>)`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **7** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/min-width
     */
    var minWidth: MinWidth

    /**
     * The **`mix-blend-mode`** CSS property sets how an element's content should blend with the content of the element's parent and the element's background.
     *
     * **Syntax**: `<blend-mode>`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **41** | **32**  | **8**  | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
     */
    var mixBlendMode: MixBlendMode

    /**
     * The **`offset-distance`** CSS property specifies a position along an `offset-path` for an element to be placed.
     *
     * **Syntax**: `<length-percentage>`
     *
     * **Initial value**: `0`
     *
     * |         Chrome         | Firefox | Safari |  Edge  | IE  |
     * | :--------------------: | :-----: | :----: | :----: | :-: |
     * |         **55**         | **72**  |   No   | **79** | No  |
     * | 46 _(motion-distance)_ |         |        |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
     */
    var motionDistance: OffsetDistance

    /**
     * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
     *
     * **Syntax**: `none | ray( [ <angle> && <size> && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
     *
     * **Initial value**: `none`
     *
     * |       Chrome       | Firefox | Safari |  Edge  | IE  |
     * | :----------------: | :-----: | :----: | :----: | :-: |
     * |       **55**       | **72**  |   No   | **79** | No  |
     * | 46 _(motion-path)_ |         |        |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
     */
    var motionPath: OffsetPath

    /**
     * The **`offset-rotate`** CSS property defines the orientation/direction of the element as it is positioned along the `offset-path`.
     *
     * **Syntax**: `[ auto | reverse ] || <angle>`
     *
     * **Initial value**: `auto`
     *
     * |         Chrome         | Firefox | Safari |  Edge  | IE  |
     * | :--------------------: | :-----: | :----: | :----: | :-: |
     * |         **56**         | **72**  |   No   | **79** | No  |
     * | 46 _(motion-rotation)_ |         |        |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
     */
    var motionRotation: OffsetRotate

    /**
     * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
     *
     * **Syntax**: `fill | contain | cover | none | scale-down`
     *
     * **Initial value**: `fill`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **32** | **36**  | **10** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
     */
    var objectFit: ObjectFit

    /**
     * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
     *
     * **Syntax**: `<position>`
     *
     * **Initial value**: `50% 50%`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **32** | **36**  | **10** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/object-position
     */
    var objectPosition: ObjectPosition

    /**
     * **Syntax**: `auto | <position>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **79** | **72**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-anchor
     */
    var offsetAnchor: OffsetAnchor

    /**
     * The **`offset-distance`** CSS property specifies a position along an `offset-path` for an element to be placed.
     *
     * **Syntax**: `<length-percentage>`
     *
     * **Initial value**: `0`
     *
     * |         Chrome         | Firefox | Safari |  Edge  | IE  |
     * | :--------------------: | :-----: | :----: | :----: | :-: |
     * |         **55**         | **72**  |   No   | **79** | No  |
     * | 46 _(motion-distance)_ |         |        |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
     */
    var offsetDistance: OffsetDistance

    /**
     * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
     *
     * **Syntax**: `none | ray( [ <angle> && <size> && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
     *
     * **Initial value**: `none`
     *
     * |       Chrome       | Firefox | Safari |  Edge  | IE  |
     * | :----------------: | :-----: | :----: | :----: | :-: |
     * |       **55**       | **72**  |   No   | **79** | No  |
     * | 46 _(motion-path)_ |         |        |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
     */
    var offsetPath: OffsetPath

    /**
     * The **`offset-rotate`** CSS property defines the orientation/direction of the element as it is positioned along the `offset-path`.
     *
     * **Syntax**: `[ auto | reverse ] || <angle>`
     *
     * **Initial value**: `auto`
     *
     * |         Chrome         | Firefox | Safari |  Edge  | IE  |
     * | :--------------------: | :-----: | :----: | :----: | :-: |
     * |         **56**         | **72**  |   No   | **79** | No  |
     * | 46 _(motion-rotation)_ |         |        |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
     */
    var offsetRotate: OffsetRotate

    /**
     * The **`offset-rotate`** CSS property defines the orientation/direction of the element as it is positioned along the `offset-path`.
     *
     * **Syntax**: `[ auto | reverse ] || <angle>`
     *
     * **Initial value**: `auto`
     *
     * |         Chrome         | Firefox | Safari |  Edge  | IE  |
     * | :--------------------: | :-----: | :----: | :----: | :-: |
     * |         **56**         | **72**  |   No   | **79** | No  |
     * | 46 _(motion-rotation)_ |         |        |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
     */
    var offsetRotation: OffsetRotate

    /**
     * The **`opacity`** CSS property sets the opacity of an element. Opacity is the degree to which content behind an element is hidden, and is the opposite of transparency.
     *
     * **Syntax**: `<alpha-value>`
     *
     * **Initial value**: `1.0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **2**  | **12** | **9** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/opacity
     */
    var opacity: Opacity

    /**
     * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
     *
     * **Syntax**: `<integer>`
     *
     * **Initial value**: `0`
     *
     * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
     * | :------: | :-----: | :-----: | :----: | :------: |
     * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
     * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/order
     */
    var order: Order

    /**
     * The **`orphans`** CSS property sets the minimum number of lines in a block container that must be shown at the _bottom_ of a page, region, or column.
     *
     * **Syntax**: `<integer>`
     *
     * **Initial value**: `2`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **25** |   No    | **1.3** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/orphans
     */
    var orphans: Orphans

    /**
     * The **`outline-color`** CSS property sets the color of an element's outline.
     *
     * **Syntax**: `<color> | invert`
     *
     * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  | **1.5** | **1.2** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/outline-color
     */
    var outlineColor: OutlineColor

    /**
     * The **`outline-offset`** CSS property sets the amount of space between an outline and the edge or border of an element.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari  |  Edge  | IE  |
     * | :----: | :-----: | :-----: | :----: | :-: |
     * | **1**  | **1.5** | **1.2** | **15** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
     */
    var outlineOffset: OutlineOffset

    /**
     * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
     *
     * **Syntax**: `auto | <'border-style'>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  | **1.5** | **1.2** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/outline-style
     */
    var outlineStyle: OutlineStyle

    /**
     * The CSS **`outline-width`** property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  | **1.5** | **1.2** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
     */
    var outlineWidth: OutlineWidth

    /**
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **56** | **66**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
     */
    var overflowAnchor: OverflowAnchor

    /**
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **69**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overflow-block
     */
    var overflowBlock: OverflowBlock

    /**
     * The **`overflow-clip-box`** CSS property specifies relative to which box the clipping happens when there is an overflow. It is short hand for the `overflow-clip-box-inline` and `overflow-clip-box-block` properties.
     *
     * **Syntax**: `padding-box | content-box`
     *
     * **Initial value**: `padding-box`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **29**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Mozilla/Gecko/Chrome/CSS/overflow-clip-box
     */
    var overflowClipBox: OverflowClipBox

    /**
     * **Syntax**: `<visual-box> || <length [0,∞]>`
     *
     * **Initial value**: `0px`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **90** |   No    |   No   | **90** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overflow-clip-margin
     */
    var overflowClipMargin: OverflowClipMargin

    /**
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **69**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overflow-inline
     */
    var overflowInline: OverflowInline

    /**
     * The `**overflow-wrap**` CSS property applies to inline elements, setting whether the browser should insert line breaks within an otherwise unbreakable string to prevent text from overflowing its line box.
     *
     * **Syntax**: `normal | break-word | anywhere`
     *
     * **Initial value**: `normal`
     *
     * |     Chrome      |      Firefox      |     Safari      |       Edge       |          IE           |
     * | :-------------: | :---------------: | :-------------: | :--------------: | :-------------------: |
     * |     **23**      |      **49**       |     **6.1**     |      **18**      | **5.5** _(word-wrap)_ |
     * | 1 _(word-wrap)_ | 3.5 _(word-wrap)_ | 1 _(word-wrap)_ | 12 _(word-wrap)_ |                       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
     */
    var overflowWrap: OverflowWrap

    /**
     * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
     *
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `visible`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  | **3.5** | **3**  | **12** | **5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
     */
    var overflowX: OverflowX

    /**
     * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
     *
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `visible`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  | **3.5** | **3**  | **12** | **5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
     */
    var overflowY: OverflowY

    /**
     * The **`overscroll-behavior-block`** CSS property sets the browser's behavior when the block direction boundary of a scrolling area is reached.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **77** | **73**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-block
     */
    var overscrollBehaviorBlock: OverscrollBehaviorBlock

    /**
     * The **`overscroll-behavior-inline`** CSS property sets the browser's behavior when the inline direction boundary of a scrolling area is reached.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **77** | **73**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-inline
     */
    var overscrollBehaviorInline: OverscrollBehaviorInline

    /**
     * The **`overscroll-behavior-x`** CSS property sets the browser's behavior when the horizontal boundary of a scrolling area is reached.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **63** | **59**  |   No   | **18** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
     */
    var overscrollBehaviorX: OverscrollBehaviorX

    /**
     * The **`overscroll-behavior-y`** CSS property sets the browser's behavior when the vertical boundary of a scrolling area is reached.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **63** | **59**  |   No   | **18** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
     */
    var overscrollBehaviorY: OverscrollBehaviorY

    /**
     * The **`padding-block`** CSS shorthand property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
     */
    var paddingBlock: PaddingBlock

    /**
     * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
     */
    var paddingBlockEnd: PaddingBlockEnd

    /**
     * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **69** | **41**  | **12.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
     */
    var paddingBlockStart: PaddingBlockStart

    /**
     * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
     */
    var paddingBottom: PaddingBottom

    /**
     * The **`padding-inline`** CSS shorthand property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **87** | **66**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
     */
    var paddingInline: PaddingInline

    /**
     * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>`
     *
     * **Initial value**: `0`
     *
     * |          Chrome           |        Firefox         |          Safari           |  Edge  | IE  |
     * | :-----------------------: | :--------------------: | :-----------------------: | :----: | :-: |
     * |          **69**           |         **41**         |         **12.1**          | **79** | No  |
     * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ | 3 _(-webkit-padding-end)_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
     */
    var paddingInlineEnd: PaddingInlineEnd

    /**
     * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation.
     *
     * **Syntax**: `<'padding-left'>`
     *
     * **Initial value**: `0`
     *
     * |           Chrome            |         Firefox          |           Safari            |  Edge  | IE  |
     * | :-------------------------: | :----------------------: | :-------------------------: | :----: | :-: |
     * |           **69**            |          **41**          |          **12.1**           | **79** | No  |
     * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ | 3 _(-webkit-padding-start)_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
     */
    var paddingInlineStart: PaddingInlineStart

    /**
     * The **`padding-left`** CSS property sets the width of the padding area to the left of an element.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
     */
    var paddingLeft: PaddingLeft

    /**
     * The **`padding-right`** CSS property sets the width of the padding area on the right of an element.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
     */
    var paddingRight: PaddingRight

    /**
     * The **`padding-top`** CSS property sets the height of the padding area on the top of an element.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
     */
    var paddingTop: PaddingTop

    /**
     * The **`page-break-after`** CSS property adjusts page breaks _after_ the current element.
     *
     * **Syntax**: `auto | always | avoid | left | right | recto | verso`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  |  **1**  | **1.2** | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/page-break-after
     */
    var pageBreakAfter: PageBreakAfter

    /**
     * The **`page-break-before`** CSS property adjusts page breaks _before_ the current element.
     *
     * **Syntax**: `auto | always | avoid | left | right | recto | verso`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  |  **1**  | **1.2** | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/page-break-before
     */
    var pageBreakBefore: PageBreakBefore

    /**
     * The **`page-break-inside`** CSS property adjusts page breaks _inside_ the current element.
     *
     * **Syntax**: `auto | avoid`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  | **19**  | **1.3** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/page-break-inside
     */
    var pageBreakInside: PageBreakInside

    /**
     * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
     *
     * **Syntax**: `normal | [ fill || stroke || markers ]`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **35** | **60**  | **8**  | **17** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
     */
    var paintOrder: PaintOrder

    /**
     * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective.
     *
     * **Syntax**: `none | <length>`
     *
     * **Initial value**: `none`
     *
     * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
     * | :------: | :------: | :-----: | :----: | :----: |
     * |  **36**  |  **16**  |  **9**  | **12** | **10** |
     * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/perspective
     */
    var perspective: Perspective

    /**
     * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
     *
     * **Syntax**: `<position>`
     *
     * **Initial value**: `50% 50%`
     *
     * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
     * | :------: | :------: | :-----: | :----: | :----: |
     * |  **36**  |  **16**  |  **9**  | **12** | **10** |
     * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/perspective-origin
     */
    var perspectiveOrigin: PerspectiveOrigin

    /**
     * The `**place-content**` CSS shorthand property allows you to align content along both the block and inline directions at once (i.e. the `align-content` and `justify-content` properties) in a relevant layout system such as Grid or Flexbox.
     *
     * **Syntax**: `<'align-content'> <'justify-content'>?`
     *
     * **Initial value**: `normal`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **59** | **45**  | **9**  | **79** | No  |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **59** | **53**  | **11** | **79** | No  |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/place-content
     */
    var placeContent: PlaceContent

    /**
     * The **`pointer-events`** CSS property sets under what circumstances (if any) a particular graphic element can become the target of pointer events.
     *
     * **Syntax**: `auto | none | visiblePainted | visibleFill | visibleStroke | visible | painted | fill | stroke | all | inherit`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * | **1**  | **1.5** | **4**  | **12** | **11** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
     */
    var pointerEvents: PointerEvents

    /**
     * The **`position`** CSS property sets how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
     *
     * **Syntax**: `static | relative | absolute | sticky | fixed`
     *
     * **Initial value**: `static`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/position
     */
    var position: Position

    /**
     * The **`quotes`** CSS property sets how the browser should render quotation marks that are added using the `open-quotes` or `close-quotes` values of the CSS `content` property.
     *
     * **Syntax**: `none | auto | [ <string> <string> ]+`
     *
     * **Initial value**: depends on user agent
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **11** | **1.5** | **9**  | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/quotes
     */
    var quotes: Quotes

    /**
     * The **`resize`** CSS property sets whether an element is resizable, and if so, in which directions.
     *
     * **Syntax**: `none | both | horizontal | vertical | block | inline`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **1**  |  **4**  | **3**  | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/resize
     */
    var resize: Resize

    /**
     * The **`right`** CSS property participates in specifying the horizontal position of a positioned element. It has no effect on non-positioned elements.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/right
     */
    var right: Right

    /**
     * The **`rotate`** CSS property allows you to specify rotation transforms individually and independently of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` property.
     *
     * **Syntax**: `none | <angle> | [ x | y | z | <number>{3} ] && <angle>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **72**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/rotate
     */
    var rotate: Rotate

    /**
     * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
     *
     * **Syntax**: `normal | <length-percentage>`
     *
     * **Initial value**: `normal`
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **84** | **63**  |   No   | **84** | No  |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * |       Chrome        |       Firefox       |        Safari         |  Edge  | IE  |
     * | :-----------------: | :-----------------: | :-------------------: | :----: | :-: |
     * |       **66**        |       **61**        |       **12.1**        | **16** | No  |
     * | 57 _(grid-row-gap)_ | 52 _(grid-row-gap)_ | 10.1 _(grid-row-gap)_ |        |     |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/row-gap
     */
    var rowGap: RowGap

    /**
     * The `**ruby-align**` CSS property defines the distribution of the different ruby elements over the base.
     *
     * **Syntax**: `start | center | space-between | space-around`
     *
     * **Initial value**: `space-around`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **38**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/ruby-align
     */
    var rubyAlign: RubyAlign

    /**
     * **Syntax**: `separate | collapse | auto`
     *
     * **Initial value**: `separate`
     */
    var rubyMerge: RubyMerge

    /**
     * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
     *
     * **Syntax**: `[ alternate || [ over | under ] ] | inter-character`
     *
     * **Initial value**: `alternate`
     *
     * | Chrome  | Firefox |    Safari     | Edge  | IE  |
     * | :-----: | :-----: | :-----------: | :---: | :-: |
     * | **84**  | **38**  | **6.1** _-x-_ | 12-79 | No  |
     * | 1 _-x-_ |         |               |       |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
     */
    var rubyPosition: RubyPosition

    /**
     * The **`scale`** CSS property allows you to specify scale transforms individually and independently of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
     *
     * **Syntax**: `none | <number>{1,3}`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **72**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scale
     */
    var scale: Scale

    /**
     * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
     *
     * **Syntax**: `auto | smooth`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **61** | **36**  |  n/a   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
     */
    var scrollBehavior: ScrollBehavior

    /**
     * The **`scroll-margin`** shorthand property sets all of the scroll margins of an element at once, assigning values much like the `margin` property does for margins of an element.
     *
     * **Syntax**: `<length>{1,4}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |            Safari             |  Edge  | IE  |
     * | :----: | :-----: | :---------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
     */
    var scrollMargin: ScrollMargin

    /**
     * The `scroll-margin-block` shorthand property sets the scroll margins of an element in the block dimension.
     *
     * **Syntax**: `<length>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
     */
    var scrollMarginBlock: ScrollMarginBlock

    /**
     * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
     */
    var scrollMarginBlockEnd: ScrollMarginBlockEnd

    /**
     * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
     */
    var scrollMarginBlockStart: ScrollMarginBlockStart

    /**
     * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |                Safari                |  Edge  | IE  |
     * | :----: | :-----: | :----------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-bottom)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
     */
    var scrollMarginBottom: ScrollMarginBottom

    /**
     * The `scroll-margin-inline` shorthand property sets the scroll margins of an element in the inline dimension.
     *
     * **Syntax**: `<length>{1,2}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **68**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline
     */
    var scrollMarginInline: ScrollMarginInline

    /**
     * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
     */
    var scrollMarginInlineEnd: ScrollMarginInlineEnd

    /**
     * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
     */
    var scrollMarginInlineStart: ScrollMarginInlineStart

    /**
     * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |               Safari               |  Edge  | IE  |
     * | :----: | :-----: | :--------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-left)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
     */
    var scrollMarginLeft: ScrollMarginLeft

    /**
     * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |               Safari                |  Edge  | IE  |
     * | :----: | :-----: | :---------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-right)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
     */
    var scrollMarginRight: ScrollMarginRight

    /**
     * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |              Safari               |  Edge  | IE  |
     * | :----: | :-----: | :-------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-top)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
     */
    var scrollMarginTop: ScrollMarginTop

    /**
     * The **`scroll-padding`** shorthand property sets scroll padding on all sides of an element at once, much like the `padding` property does for padding on an element.
     *
     * **Syntax**: `[ auto | <length-percentage> ]{1,4}`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  | **11** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
     */
    var scrollPadding: ScrollPadding

    /**
     * The `scroll-padding-block` shorthand property sets the scroll padding of an element in the block dimension.
     *
     * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
     */
    var scrollPaddingBlock: ScrollPaddingBlock

    /**
     * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
     */
    var scrollPaddingBlockEnd: ScrollPaddingBlockEnd

    /**
     * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
     */
    var scrollPaddingBlockStart: ScrollPaddingBlockStart

    /**
     * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  | **11** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
     */
    var scrollPaddingBottom: ScrollPaddingBottom

    /**
     * The `scroll-padding-inline` shorthand property sets the scroll padding of an element in the inline dimension.
     *
     * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
     */
    var scrollPaddingInline: ScrollPaddingInline

    /**
     * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
     */
    var scrollPaddingInlineEnd: ScrollPaddingInlineEnd

    /**
     * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
     */
    var scrollPaddingInlineStart: ScrollPaddingInlineStart

    /**
     * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  | **11** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
     */
    var scrollPaddingLeft: ScrollPaddingLeft

    /**
     * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  | **11** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
     */
    var scrollPaddingRight: ScrollPaddingRight

    /**
     * The **`scroll-padding-top`** property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  | **11** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
     */
    var scrollPaddingTop: ScrollPaddingTop

    /**
     * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
     *
     * **Syntax**: `[ none | start | end | center ]{1,2}`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **69** | **68**  | **11** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
     */
    var scrollSnapAlign: ScrollSnapAlign

    /**
     * The **`scroll-margin`** shorthand property sets all of the scroll margins of an element at once, assigning values much like the `margin` property does for margins of an element.
     *
     * **Syntax**: `<length>{1,4}`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |            Safari             |  Edge  | IE  |
     * | :----: | :-----: | :---------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
     */
    var scrollSnapMargin: ScrollMargin

    /**
     * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |                Safari                |  Edge  | IE  |
     * | :----: | :-----: | :----------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-bottom)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
     */
    var scrollSnapMarginBottom: ScrollMarginBottom

    /**
     * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |               Safari               |  Edge  | IE  |
     * | :----: | :-----: | :--------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-left)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
     */
    var scrollSnapMarginLeft: ScrollMarginLeft

    /**
     * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |               Safari                |  Edge  | IE  |
     * | :----: | :-----: | :---------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-right)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
     */
    var scrollSnapMarginRight: ScrollMarginRight

    /**
     * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |              Safari               |  Edge  | IE  |
     * | :----: | :-----: | :-------------------------------: | :----: | :-: |
     * | **69** | **68**  | **11** _(scroll-snap-margin-top)_ | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
     */
    var scrollSnapMarginTop: ScrollMarginTop

    /**
     * The **`scroll-snap-stop`** CSS property defines whether the scroll container is allowed to "pass over" possible snap positions.
     *
     * **Syntax**: `normal | always`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **75** |   No    |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-stop
     */
    var scrollSnapStop: ScrollSnapStop

    /**
     * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
     *
     * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari  |     Edge     |      IE      |
     * | :----: | :-----: | :-----: | :----------: | :----------: |
     * | **69** |  39-68  | **11**  | **12** _-x-_ | **10** _-x-_ |
     * |        |         | 9 _-x-_ |              |              |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-type
     */
    var scrollSnapType: ScrollSnapType

    /**
     * The **`scrollbar-color`** CSS property sets the color of the scrollbar track and thumb.
     *
     * **Syntax**: `auto | dark | light | <color>{2}`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **64**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-color
     */
    var scrollbarColor: ScrollbarColor

    /**
     * The **`scrollbar-gutter`** CSS property allows authors to reserve space for the scrollbar, preventing unwanted layout changes as the content grows while also avoiding unnecessary visuals when scrolling isn't needed.
     *
     * **Syntax**: `auto | [ stable | always ] && both? && force?`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |  n/a   |   No    |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-gutter
     */
    var scrollbarGutter: ScrollbarGutter

    /**
     * The **`scrollbar-width`** property allows the author to set the maximum thickness of an element’s scrollbars when they are shown.
     *
     * **Syntax**: `auto | thin | none`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **64**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-width
     */
    var scrollbarWidth: ScrollbarWidth

    /**
     * The **`shape-image-threshold`** CSS property sets the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
     *
     * **Syntax**: `<alpha-value>`
     *
     * **Initial value**: `0.0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **37** | **62**  | **10.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
     */
    var shapeImageThreshold: ShapeImageThreshold

    /**
     * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
     *
     * **Syntax**: `<length-percentage>`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **37** | **62**  | **10.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
     */
    var shapeMargin: ShapeMargin

    /**
     * The **`shape-outside`** CSS property defines a shape—which may be non-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
     *
     * **Syntax**: `none | [ <shape-box> || <basic-shape> ] | <image>`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **37** | **62**  | **10.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
     */
    var shapeOutside: ShapeOutside

    /**
     * The **`tab-size`** CSS property is used to customize the width of tab characters (U+0009).
     *
     * **Syntax**: `<integer> | <length>`
     *
     * **Initial value**: `8`
     *
     * | Chrome |   Firefox   | Safari  |  Edge  | IE  |
     * | :----: | :---------: | :-----: | :----: | :-: |
     * | **21** | **4** _-x-_ | **6.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/tab-size
     */
    var tabSize: TabSize

    /**
     * The **`table-layout`** CSS property sets the algorithm used to lay out `<table>` cells, rows, and columns.
     *
     * **Syntax**: `auto | fixed`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **14** |  **1**  | **1**  | **12** | **5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
     */
    var tableLayout: TableLayout

    /**
     * The **`text-align`** CSS property sets the horizontal alignment of a block element or table-cell box. This means it works like `vertical-align` but in the horizontal direction.
     *
     * **Syntax**: `start | end | left | right | center | justify | match-parent`
     *
     * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-align
     */
    var textAlign: TextAlign

    /**
     * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
     *
     * **Syntax**: `auto | start | end | left | right | center | justify`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **47** | **49**  |   No   | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
     */
    var textAlignLast: TextAlignLast

    /**
     * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
     *
     * **Syntax**: `none | all | [ digits <integer>? ]`
     *
     * **Initial value**: `none`
     *
     * |           Chrome           | Firefox |              Safari              | Edge  |                   IE                   |
     * | :------------------------: | :-----: | :------------------------------: | :---: | :------------------------------------: |
     * |           **48**           | **48**  | **5.1** _(-webkit-text-combine)_ | 15-79 | **11** _(-ms-text-combine-horizontal)_ |
     * | 9 _(-webkit-text-combine)_ |         |                                  |       |                                        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
     */
    var textCombineUpright: TextCombineUpright

    /**
     * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **36**  | **12.1** | **79** | No  |
     * |        |         | 8 _-x-_  |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
     */
    var textDecorationColor: TextDecorationColor

    /**
     * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
     *
     * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **36**  | **12.1** | **79** | No  |
     * |        |         | 8 _-x-_  |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
     */
    var textDecorationLine: TextDecorationLine

    /**
     * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
     *
     * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
     *
     * **Initial value**: `objects`
     *
     * | Chrome | Firefox |  Safari  | Edge | IE  |
     * | :----: | :-----: | :------: | :--: | :-: |
     * | 57-64  |   No    | **12.1** |  No  | No  |
     * |        |         | 8 _-x-_  |      |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip
     */
    var textDecorationSkip: TextDecorationSkip

    /**
     * The **`text-decoration-skip-ink`** CSS property specifies how overlines and underlines are drawn when they pass over glyph ascenders and descenders.
     *
     * **Syntax**: `auto | all | none`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **64** | **70**  |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip-ink
     */
    var textDecorationSkipInk: TextDecorationSkipInk

    /**
     * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
     *
     * **Syntax**: `solid | double | dotted | dashed | wavy`
     *
     * **Initial value**: `solid`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **36**  | **12.1** | **79** | No  |
     * |        |         | 8 _-x-_  |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
     */
    var textDecorationStyle: TextDecorationStyle

    /**
     * The **`text-decoration-thickness`** CSS property sets the stroke thickness of the decoration line that is used on text in an element, such as a line-through, underline, or overline.
     *
     * **Syntax**: `auto | from-font | <length> | <percentage> `
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **89** | **70**  | **12.1** | **89** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-thickness
     */
    var textDecorationThickness: TextDecorationThickness

    /**
     * The **`text-decoration-thickness`** CSS property sets the stroke thickness of the decoration line that is used on text in an element, such as a line-through, underline, or overline.
     *
     * **Syntax**: `auto | from-font | <length> | <percentage> `
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  | Edge  | IE  |
     * | :----: | :-----: | :------: | :---: | :-: |
     * | 87-89  | **70**  | **12.1** | 87-89 | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-thickness
     */
    var textDecorationWidth: TextDecorationThickness

    /**
     * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
     * | :----------: | :-----: | :-----: | :----------: | :-: |
     * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
     */
    var textEmphasisColor: TextEmphasisColor

    /**
     * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
     *
     * **Syntax**: `[ over | under ] && [ right | left ]`
     *
     * **Initial value**: `over right`
     *
     * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
     * | :----------: | :-----: | :-----: | :----------: | :-: |
     * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
     */
    var textEmphasisPosition: TextEmphasisPosition

    /**
     * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
     *
     * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
     *
     * **Initial value**: `none`
     *
     * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
     * | :----------: | :-----: | :-----: | :----------: | :-: |
     * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
     */
    var textEmphasisStyle: TextEmphasisStyle

    /**
     * The **`text-indent`** CSS property sets the length of empty space (indentation) that is put before lines of text in a block.
     *
     * **Syntax**: `<length-percentage> && hanging? && each-line?`
     *
     * **Initial value**: `0`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
     */
    var textIndent: TextIndent

    /**
     * The **`text-justify`** CSS property sets what type of justification should be applied to text when `text-align``: justify;` is set on an element.
     *
     * **Syntax**: `auto | inter-character | inter-word | none`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE   |
     * | :----: | :-----: | :----: | :----: | :----: |
     * |  n/a   | **55**  |   No   | **12** | **11** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
     */
    var textJustify: TextJustify

    /**
     * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
     *
     * **Syntax**: `mixed | upright | sideways`
     *
     * **Initial value**: `mixed`
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  | IE  |
     * | :------: | :-----: | :-------: | :----: | :-: |
     * |  **48**  | **41**  |  **14**   | **79** | No  |
     * | 11 _-x-_ |         | 5.1 _-x-_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
     */
    var textOrientation: TextOrientation

    /**
     * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
     *
     * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
     *
     * **Initial value**: `clip`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  |  **7**  | **1.3** | **12** | **6** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
     */
    var textOverflow: TextOverflow

    /**
     * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
     *
     * **Syntax**: `auto | optimizeSpeed | optimizeLegibility | geometricPrecision`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **4**  |  **1**  | **5**  | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
     */
    var textRendering: TextRendering

    /**
     * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
     *
     * **Syntax**: `none | <shadow-t>#`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari  |  Edge  |   IE   |
     * | :----: | :-----: | :-----: | :----: | :----: |
     * | **2**  | **3.5** | **1.1** | **12** | **10** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
     */
    var textShadow: TextShadow

    /**
     * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
     *
     * **Syntax**: `none | auto | <percentage>`
     *
     * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **54** |   No    |   No   | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-size-adjust
     */
    var textSizeAdjust: TextSizeAdjust

    /**
     * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all-uppercase or all-lowercase, or with each word capitalized. It also can help improve legibility for ruby.
     *
     * **Syntax**: `none | capitalize | uppercase | lowercase | full-width | full-size-kana`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
     */
    var textTransform: TextTransform

    /**
     * The **`text-underline-offset`** CSS property sets the offset distance of an underline text decoration line (applied using `text-decoration`) from its original position.
     *
     * **Syntax**: `auto | <length> | <percentage> `
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **87** | **70**  | **12.1** | **87** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-offset
     */
    var textUnderlineOffset: TextUnderlineOffset

    /**
     * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
     *
     * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox |  Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :------: | :----: | :---: |
     * | **33** | **74**  | **12.1** | **12** | **6** |
     * |        |         | 9 _-x-_  |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-position
     */
    var textUnderlinePosition: TextUnderlinePosition

    /**
     * The **`top`** CSS property participates in specifying the vertical position of a positioned element. It has no effect on non-positioned elements.
     *
     * **Syntax**: `<length> | <percentage> | auto`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/top
     */
    var top: Top

    /**
     * The **`touch-action`** CSS property sets how an element's region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
     *
     * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |    IE    |
     * | :----: | :-----: | :----: | :----: | :------: |
     * | **36** | **52**  | **13** | **12** |  **11**  |
     * |        |         |        |        | 10 _-x-_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/touch-action
     */
    var touchAction: TouchAction

    /**
     * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
     *
     * **Syntax**: `none | <transform-list>`
     *
     * **Initial value**: `none`
     *
     * | Chrome  | Firefox |  Safari   |  Edge  |   IE    |
     * | :-----: | :-----: | :-------: | :----: | :-----: |
     * | **36**  | **16**  |   **9**   | **12** | **10**  |
     * | 1 _-x-_ |         | 3.1 _-x-_ |        | 9 _-x-_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transform
     */
    var transform: Transform

    /**
     * The **`transform-box`** CSS property defines the layout box to which the `transform` and `transform-origin` properties relate.
     *
     * **Syntax**: `content-box | border-box | fill-box | stroke-box | view-box`
     *
     * **Initial value**: `view-box`
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **64** | **55**  | **11** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transform-box
     */
    var transformBox: TransformBox

    /**
     * The **`transform-origin`** CSS property sets the origin for an element's transformations.
     *
     * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
     *
     * **Initial value**: `50% 50% 0`
     *
     * | Chrome  |  Firefox  | Safari  |  Edge  |   IE    |
     * | :-----: | :-------: | :-----: | :----: | :-----: |
     * | **36**  |  **16**   |  **9**  | **12** | **10**  |
     * | 1 _-x-_ | 3.5 _-x-_ | 2 _-x-_ |        | 9 _-x-_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
     */
    var transformOrigin: TransformOrigin

    /**
     * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
     *
     * **Syntax**: `flat | preserve-3d`
     *
     * **Initial value**: `flat`
     *
     * |  Chrome  | Firefox  | Safari  |  Edge  | IE  |
     * | :------: | :------: | :-----: | :----: | :-: |
     * |  **36**  |  **16**  |  **9**  | **12** | No  |
     * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |     |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transform-style
     */
    var transformStyle: TransformStyle

    /**
     * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
     *
     * **Syntax**: `<time>#`
     *
     * **Initial value**: `0s`
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **26**  | **16**  |  **9**  | **12** | **10** |
     * | 1 _-x-_ | 4 _-x-_ | 4 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transition-delay
     */
    var transitionDelay: TransitionDelay

    /**
     * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
     *
     * **Syntax**: `<time>#`
     *
     * **Initial value**: `0s`
     *
     * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :-----: | :-----: | :-------: | :----: | :----: |
     * | **26**  | **16**  |   **9**   | **12** | **10** |
     * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transition-duration
     */
    var transitionDuration: TransitionDuration

    /**
     * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
     *
     * **Syntax**: `none | <single-transition-property>#`
     *
     * **Initial value**: all
     *
     * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :-----: | :-----: | :-------: | :----: | :----: |
     * | **26**  | **16**  |   **9**   | **12** | **10** |
     * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transition-property
     */
    var transitionProperty: TransitionProperty

    /**
     * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
     *
     * **Syntax**: `<easing-function>#`
     *
     * **Initial value**: `ease`
     *
     * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :-----: | :-----: | :-------: | :----: | :----: |
     * | **26**  | **16**  |   **9**   | **12** | **10** |
     * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transition-timing-function
     */
    var transitionTimingFunction: TransitionTimingFunction

    /**
     * The **`translate`** CSS property allows you to specify translation transforms individually and independently of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
     *
     * **Syntax**: `none | <length-percentage> [ <length-percentage> <length>? ]?`
     *
     * **Initial value**: `none`
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **72**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/translate
     */
    var translate: Translate

    /**
     * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left-to-right and right-to-left text, the user-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
     *
     * **Syntax**: `normal | embed | isolate | bidi-override | isolate-override | plaintext`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari  |  Edge  |   IE    |
     * | :----: | :-----: | :-----: | :----: | :-----: |
     * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
     */
    var unicodeBidi: UnicodeBidi

    /**
     * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
     *
     * **Syntax**: `auto | text | none | contain | all`
     *
     * **Initial value**: `auto`
     *
     * | Chrome  | Firefox |   Safari    |     Edge     |      IE      |
     * | :-----: | :-----: | :---------: | :----------: | :----------: |
     * | **54**  | **69**  | **3** _-x-_ | **12** _-x-_ | **10** _-x-_ |
     * | 1 _-x-_ | 1 _-x-_ |             |              |              |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/user-select
     */
    var userSelect: UserSelect

    /**
     * The **`vertical-align`** CSS property sets vertical alignment of an inline, inline-block or table-cell box.
     *
     * **Syntax**: `baseline | sub | super | text-top | text-bottom | middle | top | bottom | <percentage> | <length>`
     *
     * **Initial value**: `baseline`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
     */
    var verticalAlign: VerticalAlign

    /**
     * The **`visibility`** CSS property shows or hides an element without changing the layout of a document. The property can also hide rows or columns in a `<table>`.
     *
     * **Syntax**: `visible | hidden | collapse`
     *
     * **Initial value**: `visible`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/visibility
     */
    var visibility: Visibility

    /**
     * The **`white-space`** CSS property sets how white space inside an element is handled.
     *
     * **Syntax**: `normal | pre | nowrap | pre-wrap | pre-line | break-spaces`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/white-space
     */
    var whiteSpace: WhiteSpace

    /**
     * The **`widows`** CSS property sets the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column.
     *
     * **Syntax**: `<integer>`
     *
     * **Initial value**: `2`
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **25** |   No    | **1.3** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/widows
     */
    var widows: Widows

    /**
     * The **`width`** CSS property sets an element's width. By default, it sets the width of the content area, but if `box-sizing` is set to `border-box`, it sets the width of the border area.
     *
     * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content | fit-content(<length-percentage>)`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/width
     */
    var width: Width

    /**
     * The **`will-change`** CSS property hints to browsers how an element is expected to change. Browsers may set up optimizations before an element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work before they are actually required.
     *
     * **Syntax**: `auto | <animateable-feature>#`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari  |  Edge  | IE  |
     * | :----: | :-----: | :-----: | :----: | :-: |
     * | **36** | **36**  | **9.1** | **79** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/will-change
     */
    var willChange: WillChange

    /**
     * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
     *
     * **Syntax**: `normal | break-all | keep-all | break-word`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  | **15**  | **3**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/word-break
     */
    var wordBreak: WordBreak

    /**
     * The **`word-spacing`** CSS property sets the length of space between words and between tags.
     *
     * **Syntax**: `normal | <length-percentage>`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **6** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
     */
    var wordSpacing: WordSpacing

    /**
     * The `**overflow-wrap**` CSS property applies to inline elements, setting whether the browser should insert line breaks within an otherwise unbreakable string to prevent text from overflowing its line box.
     *
     * **Syntax**: `normal | break-word`
     *
     * **Initial value**: `normal`
     */
    var wordWrap: WordWrap

    /**
     * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress. When set for an entire document, it should be set on the root element (`html` element for HTML documents).
     *
     * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
     *
     * **Initial value**: `horizontal-tb`
     *
     * | Chrome  | Firefox |  Safari   |  Edge  |  IE   |
     * | :-----: | :-----: | :-------: | :----: | :---: |
     * | **48**  | **41**  | **10.1**  | **12** | **9** |
     * | 8 _-x-_ |         | 5.1 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
     */
    var writingMode: WritingMode

    /**
     * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
     *
     * **Syntax**: `auto | <integer>`
     *
     * **Initial value**: `auto`
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/z-index
     */
    var zIndex: ZIndex

    /**
     * The non-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
     *
     * **Syntax**: `normal | reset | <number> | <percentage>`
     *
     * **Initial value**: `normal`
     *
     * | Chrome | Firefox | Safari  |  Edge  |   IE    |
     * | :----: | :-----: | :-----: | :----: | :-----: |
     * | **1**  |   No    | **3.1** | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/zoom
     */
    var zoom: Zoom
}
