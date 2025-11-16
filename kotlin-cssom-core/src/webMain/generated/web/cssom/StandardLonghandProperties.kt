// Automatically generated - do not modify!

package web.cssom

external interface StandardLonghandProperties {
    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | <color>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   93   |   92    |   15.4   |   93   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/accent-color">MDN</a>
     */
    var accentColor: AccentColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
     *
     * **Initial value**: `normal`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   28    |    9    |   12   |   11   |
     *    |    21′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/align-content">MDN</a>
     */
    var alignContent: AlignContent?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ] | anchor-center`
     *
     * **Initial value**: `normal`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   20    |    9    |   12   |   11   |
     *    |    21′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/align-items">MDN</a>
     */
    var alignItems: AlignItems?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position> | anchor-center`
     *
     * **Initial value**: `auto`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   20    |    9    |   12   |   10   |
     *    |    21′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/align-self">MDN</a>
     */
    var alignSelf: AlignSelf?

    /**
     * **Syntax**: `[ normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position> ]#`
     *
     * **Initial value**: `normal`
     */
    var alignTracks: AlignTracks?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `baseline | alphabetic | ideographic | middle | central | mathematical | text-before-edge | text-after-edge`
     *
     * **Initial value**: `baseline`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   1    |   No    |   5.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/alignment-baseline">MDN</a>
     */
    var alignmentBaseline: AlignmentBaseline?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | <dashed-ident>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  |   Firefox   | Safari |  Edge   | IE  |
     *    | :-----: | :---------: | :----: | :-----: | :-: |
     *    |   125   |   preview   |   26   |   125   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/anchor-name">MDN</a>
     */
    var anchorName: AnchorName?

    /**
     * **Syntax**: `none | all | <dashed-ident>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  |   Firefox   | Safari |  Edge   | IE  |
     *    | :-----: | :---------: | :----: | :-----: | :-: |
     *    |   131   |   preview   |   26   |   131   | No  |
     */
    var anchorScope: AnchorScope?

    /**
     * Since July 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<single-animation-composition>#`
     *
     * **Initial value**: `replace`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   112   |   115   |   16   |   112   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-composition">MDN</a>
     */
    var animationComposition: AnimationComposition?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<time>#`
     *
     * **Initial value**: `0s`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-delay">MDN</a>
     */
    var animationDelay: AnimationDelay?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<single-animation-direction>#`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-direction">MDN</a>
     */
    var animationDirection: AnimationDirection?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `[ auto | <time [0s,∞]> ]#`
     *
     * **Initial value**: `0s`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-duration">MDN</a>
     */
    var animationDuration: AnimationDuration?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<single-animation-fill-mode>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    5′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-fill-mode">MDN</a>
     */
    var animationFillMode: AnimationFillMode?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<single-animation-iteration-count>#`
     *
     * **Initial value**: `1`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-iteration-count">MDN</a>
     */
    var animationIterationCount: AnimationIterationCount?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `[ none | <keyframes-name> ]#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-name">MDN</a>
     */
    var animationName: AnimationName?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<single-animation-play-state>#`
     *
     * **Initial value**: `running`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-play-state">MDN</a>
     */
    var animationPlayState: AnimationPlayState?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ normal | <length-percentage> | <timeline-range-name> <length-percentage>? ]#`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-range-end">MDN</a>
     */
    var animationRangeEnd: AnimationRange?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ normal | <length-percentage> | <timeline-range-name> <length-percentage>? ]#`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-range-start">MDN</a>
     */
    var animationRangeStart: AnimationRange?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `<single-animation-timeline>#`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-timeline">MDN</a>
     */
    var animationTimeline: AnimationTimeline?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<easing-function>#`
     *
     * **Initial value**: `ease`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   43    |   16    |    9    |   12   |   10   |
     *    |    3′   |    5′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/animation-timing-function">MDN</a>
     */
    var animationTimingFunction: AnimationTimingFunction?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `none | auto | <compat-auto> | <compat-special>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  |   Edge   | IE  |
     *    | :-----: | :-----: | :------: | :------: | :-: |
     *    |   84    |   80    |   15.4   |    84    | No  |
     *    |    1′   |    1′   |    3′    |    12′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/appearance">MDN</a>
     */
    var appearance: Appearance?
    var WebkitAppearance: Appearance?
    var MozAppearance: Appearance?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `auto || <ratio>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   88   |   89    |   15   |   88   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/aspect-ratio">MDN</a>
     */
    var aspectRatio: AspectRatio?

    /**
     * Since September 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `none | <filter-value-list>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   76   |   103   |   18    |   79   | No  |
     *    |        |         |    9′   |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/backdrop-filter">MDN</a>
     */
    var backdropFilter: BackdropFilter?
    var WebkitBackdropFilter: BackdropFilter?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `visible | hidden`
     *
     * **Initial value**: `visible`
     *
     *    |  Chrome  | Firefox  |  Safari   |  Edge  |   IE   |
     *    | :------: | :------: | :-------: | :----: | :----: |
     *    |    36    |    16    |   15.4    |   12   |   10   |
     *    |    12′   |    10′   |    5.1′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/backface-visibility">MDN</a>
     */
    var backfaceVisibility: BackfaceVisibility?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<attachment>#`
     *
     * **Initial value**: `scroll`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-attachment">MDN</a>
     */
    var backgroundAttachment: BackgroundAttachment?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<blend-mode>#`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   35   |   30    |   8    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-blend-mode">MDN</a>
     */
    var backgroundBlendMode: BackgroundBlendMode?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<bg-clip>#`
     *
     * **Initial value**: `border-box`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |    4    |    5    |   12   |   9   |
     *    |        |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-clip">MDN</a>
     */
    var backgroundClip: BackgroundClip?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `transparent`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-color">MDN</a>
     */
    var backgroundColor: BackgroundColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<bg-image>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-image">MDN</a>
     */
    var backgroundImage: BackgroundImage?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<visual-box>#`
     *
     * **Initial value**: `padding-box`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    4    |   3    |   12   |   9   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-origin">MDN</a>
     */
    var backgroundOrigin: BackgroundOrigin?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2016.
     *
     * **Syntax**: `[ center | [ [ left | right | x-start | x-end ]? <length-percentage>? ]! ]#`
     *
     * **Initial value**: `0%`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |   49    |   1    |   12   |   6   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-position-x">MDN</a>
     */
    var backgroundPositionX: BackgroundPositionX?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2016.
     *
     * **Syntax**: `[ center | [ [ top | bottom | y-start | y-end ]? <length-percentage>? ]! ]#`
     *
     * **Initial value**: `0%`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |   49    |   1    |   12   |   6   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-position-y">MDN</a>
     */
    var backgroundPositionY: BackgroundPositionY?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<repeat-style>#`
     *
     * **Initial value**: `repeat`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-repeat">MDN</a>
     */
    var backgroundRepeat: BackgroundRepeat?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<bg-size>#`
     *
     * **Initial value**: `auto auto`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |    3    |    4    |    5    |   12   |   9   |
     *    |    1′   |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/background-size">MDN</a>
     */
    var backgroundSize: BackgroundSize?

    /**
     * **Syntax**: `<length-percentage> | sub | super | baseline`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   1    |   No    |   4    |   79   | No  |
     */
    var baselineShift: BaselineShift?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'width'>`
     *
     * **Initial value**: `auto`
     *
     *    |            Chrome            | Firefox |             Safari             |  Edge  | IE  |
     *    | :--------------------------: | :-----: | :----------------------------: | :----: | :-: |
     *    |              57              |   41    |              12.1              |   79   | No  |
     *    | 8 _(-webkit-logical-height)_ |         | 5.1 _(-webkit-logical-height)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/block-size">MDN</a>
     */
    var blockSize: BlockSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-block-end-color">MDN</a>
     */
    var borderBlockEndColor: BorderBlockEndColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-block-end-style">MDN</a>
     */
    var borderBlockEndStyle: BorderBlockEndStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-block-end-width">MDN</a>
     */
    var borderBlockEndWidth: BorderBlockEndWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-block-start-color">MDN</a>
     */
    var borderBlockStartColor: BorderBlockStartColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-block-start-style">MDN</a>
     */
    var borderBlockStartStyle: BorderBlockStartStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-block-start-width">MDN</a>
     */
    var borderBlockStartWidth: BorderBlockStartWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-bottom-color">MDN</a>
     */
    var borderBottomColor: BorderBottomColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>{1,2}`
     *
     * **Initial value**: `0`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |    4    |    4    |    5    |   12   |   9   |
     *    |    1′   |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-bottom-left-radius">MDN</a>
     */
    var borderBottomLeftRadius: BorderBottomLeftRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>{1,2}`
     *
     * **Initial value**: `0`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |    4    |    4    |    5    |   12   |   9   |
     *    |    1′   |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-bottom-right-radius">MDN</a>
     */
    var borderBottomRightRadius: BorderBottomRightRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-bottom-style">MDN</a>
     */
    var borderBottomStyle: BorderBottomStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-bottom-width">MDN</a>
     */
    var borderBottomWidth: BorderBottomWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `separate | collapse`
     *
     * **Initial value**: `separate`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |    1    |   1.1   |   12   |   5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-collapse">MDN</a>
     */
    var borderCollapse: BorderCollapse?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<'border-top-left-radius'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   89   |   66    |   15   |   89   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-end-end-radius">MDN</a>
     */
    var borderEndEndRadius: BorderEndEndRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<'border-top-left-radius'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   89   |   66    |   15   |   89   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-end-start-radius">MDN</a>
     */
    var borderEndStartRadius: BorderEndStartRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ <length [0,∞]> | <number [0,∞]> ]{1,4}  `
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   15   |   15    |   6    |   12   |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-image-outset">MDN</a>
     */
    var borderImageOutset: BorderImageOutset?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2016.
     *
     * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
     *
     * **Initial value**: `stretch`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   15   |   15    |   6    |   12   |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-image-repeat">MDN</a>
     */
    var borderImageRepeat: BorderImageRepeat?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ <number [0,∞]> | <percentage [0,∞]> ]{1,4}  && fill?`
     *
     * **Initial value**: `100%`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   15   |   15    |   6    |   12   |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-image-slice">MDN</a>
     */
    var borderImageSlice: BorderImageSlice?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `none | <image>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   15   |   15    |   6    |   12   |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-image-source">MDN</a>
     */
    var borderImageSource: BorderImageSource?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ <length-percentage [0,∞]> | <number [0,∞]> | auto ]{1,4}`
     *
     * **Initial value**: `1`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   16   |   13    |   6    |   12   |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-image-width">MDN</a>
     */
    var borderImageWidth: BorderImageWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
     *    | :----: | :-------------------------: | :------: | :----: | :-: |
     *    |   69   |             41              |   12.1   |   79   | No  |
     *    |        | 3 _(-moz-border-end-color)_ |          |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-inline-end-color">MDN</a>
     */
    var borderInlineEndColor: BorderInlineEndColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
     *    | :----: | :-------------------------: | :------: | :----: | :-: |
     *    |   69   |             41              |   12.1   |   79   | No  |
     *    |        | 3 _(-moz-border-end-style)_ |          |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-inline-end-style">MDN</a>
     */
    var borderInlineEndStyle: BorderInlineEndStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
     *    | :----: | :-------------------------: | :------: | :----: | :-: |
     *    |   69   |             41              |   12.1   |   79   | No  |
     *    |        | 3 _(-moz-border-end-width)_ |          |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-inline-end-width">MDN</a>
     */
    var borderInlineEndWidth: BorderInlineEndWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-color'>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
     *    | :----: | :---------------------------: | :------: | :----: | :-: |
     *    |   69   |              41               |   12.1   |   79   | No  |
     *    |        | 3 _(-moz-border-start-color)_ |          |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-inline-start-color">MDN</a>
     */
    var borderInlineStartColor: BorderInlineStartColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-style'>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
     *    | :----: | :---------------------------: | :------: | :----: | :-: |
     *    |   69   |              41               |   12.1   |   79   | No  |
     *    |        | 3 _(-moz-border-start-style)_ |          |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-inline-start-style">MDN</a>
     */
    var borderInlineStartStyle: BorderInlineStartStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'border-top-width'>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-inline-start-width">MDN</a>
     */
    var borderInlineStartWidth: BorderInlineStartWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-left-color">MDN</a>
     */
    var borderLeftColor: BorderLeftColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-left-style">MDN</a>
     */
    var borderLeftStyle: BorderLeftStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-left-width">MDN</a>
     */
    var borderLeftWidth: BorderLeftWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-right-color">MDN</a>
     */
    var borderRightColor: BorderRightColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-right-style">MDN</a>
     */
    var borderRightStyle: BorderRightStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-right-width">MDN</a>
     */
    var borderRightWidth: BorderRightWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length>{1,2}`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-spacing">MDN</a>
     */
    var borderSpacing: BorderSpacing?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<'border-top-left-radius'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   89   |   66    |   15   |   89   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-start-end-radius">MDN</a>
     */
    var borderStartEndRadius: BorderStartEndRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<'border-top-left-radius'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   89   |   66    |   15   |   89   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-start-start-radius">MDN</a>
     */
    var borderStartStartRadius: BorderStartStartRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-top-color">MDN</a>
     */
    var borderTopColor: BorderTopColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>{1,2}`
     *
     * **Initial value**: `0`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |    4    |    4    |    5    |   12   |   9   |
     *    |    1′   |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-top-left-radius">MDN</a>
     */
    var borderTopLeftRadius: BorderTopLeftRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>{1,2}`
     *
     * **Initial value**: `0`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |    4    |    4    |    5    |   12   |   9   |
     *    |    1′   |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-top-right-radius">MDN</a>
     */
    var borderTopRightRadius: BorderTopRightRadius?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-style>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-top-style">MDN</a>
     */
    var borderTopStyle: BorderTopStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/border-top-width">MDN</a>
     */
    var borderTopWidth: BorderTopWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage> | <anchor()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/bottom">MDN</a>
     */
    var bottom: Bottom?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `slice | clone`
     *
     * **Initial value**: `slice`
     *
     *    |  Chrome  | Firefox |   Safari    |   Edge   | IE  |
     *    | :------: | :-----: | :---------: | :------: | :-: |
     *    |   130    |   32    |       7′    |   130    | No  |
     *    |    22′   |         |             |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/box-decoration-break">MDN</a>
     */
    var boxDecorationBreak: BoxDecorationBreak?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `none | <shadow>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |   10    |    4    |   5.1   |   12   |   9   |
     *    |    1′   |         |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/box-shadow">MDN</a>
     */
    var boxShadow: BoxShadow?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `content-box | border-box`
     *
     * **Initial value**: `content-box`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     *    | :-----: | :-----: | :-----: | :----: | :---: |
     *    |   10    |   29    |   5.1   |   12   |   8   |
     *    |    1′   |    1′   |    3′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/box-sizing">MDN</a>
     */
    var boxSizing: BoxSizing?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2019.
     *
     * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   50   |   65    |   10   |   12   |   10   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/break-after">MDN</a>
     */
    var breakAfter: BreakAfter?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2019.
     *
     * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   50   |   65    |   10   |   12   |   10   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/break-before">MDN</a>
     */
    var breakBefore: BreakBefore?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2019.
     *
     * **Syntax**: `auto | avoid | avoid-page | avoid-column | avoid-region`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   50   |   65    |   10   |   12   |   10   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/break-inside">MDN</a>
     */
    var breakInside: BreakInside?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `top | bottom`
     *
     * **Initial value**: `top`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/caption-side">MDN</a>
     */
    var captionSide: CaptionSide?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | <color>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   53    |   11.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/caret-color">MDN</a>
     */
    var caretColor: CaretColor?

    /**
     * **Syntax**: `auto | bar | block | underscore`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   No   |   No    |   No   |  No  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/caret-shape">MDN</a>
     */
    var caretShape: CaretShape?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `none | left | right | both | inline-start | inline-end`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/clear">MDN</a>
     */
    var clear: Clear?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
     *
     * **Initial value**: `none`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    55    |   3.5   |   9.1   |   79   |   10   |
     *    |    23′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/clip-path">MDN</a>
     */
    var clipPath: ClipPath?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `nonzero | evenodd`
     *
     * **Initial value**: `nonzero`
     *
     *    | Chrome  | Firefox | Safari |  Edge  | IE  |
     *    | :-----: | :-----: | :----: | :----: | :-: |
     *    |   ≤15   |   3.5   |   ≤5   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/clip-rule">MDN</a>
     */
    var clipRule: ClipRule?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `canvastext`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/color">MDN</a>
     */
    var color: ColorProperty?

    /**
     * Since May 2025, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `economy | exact`
     *
     * **Initial value**: `economy`
     *
     *    |  Chrome  |       Firefox       |  Safari  |   Edge   | IE  |
     *    | :------: | :-----------------: | :------: | :------: | :-: |
     *    |   136    |         97          |   15.4   |   136    | No  |
     *    |    17′   | 48 _(color-adjust)_ |    6′    |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/print-color-adjust">MDN</a>
     */
    var colorAdjust: PrintColorAdjust?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | sRGB | linearRGB`
     *
     * **Initial value**: `linearRGB`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   1    |    3    |   3    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/color-interpolation-filters">MDN</a>
     */
    var colorInterpolationFilters: ColorInterpolationFilters?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2022.
     *
     * **Syntax**: `normal | [ light | dark | <custom-ident> ]+ && only?`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   81   |   96    |   13   |   81   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/color-scheme">MDN</a>
     */
    var colorScheme: ColorScheme?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2017.
     *
     * **Syntax**: `<integer> | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   50    |   52    |    9    |   12   |   10   |
     *    |    1′   |         |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-count">MDN</a>
     */
    var columnCount: ColumnCount?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2017.
     *
     * **Syntax**: `auto | balance`
     *
     * **Initial value**: `balance`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |   IE   |
     *    | :----: | :-----: | :-----: | :----: | :----: |
     *    |   50   |   52    |    9    |   12   |   10   |
     *    |        |         |    8′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-fill">MDN</a>
     */
    var columnFill: ColumnFill?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | <length-percentage>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   1    |   1.5   |   3    |   12   |   10   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-gap">MDN</a>
     */
    var columnGap: ColumnGap?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2017.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   50    |   52    |    9    |   12   |   10   |
     *    |    1′   |         |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-rule-color">MDN</a>
     */
    var columnRuleColor: ColumnRuleColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2017.
     *
     * **Syntax**: `<'border-style'>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   50    |   52    |    9    |   12   |   10   |
     *    |    1′   |         |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-rule-style">MDN</a>
     */
    var columnRuleStyle: ColumnRuleStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2017.
     *
     * **Syntax**: `<'border-width'>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   50    |   52    |    9    |   12   |   10   |
     *    |    1′   |         |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-rule-width">MDN</a>
     */
    var columnRuleWidth: ColumnRuleWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `none | all`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     *    | :-----: | :-----: | :-------: | :----: | :----: |
     *    |   50    |   71    |     9     |   12   |   10   |
     *    |    6′   |         |    5.1′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-span">MDN</a>
     */
    var columnSpan: ColumnSpan?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since November 2016.
     *
     * **Syntax**: `<length> | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   50    |   50    |    9    |   12   |   10   |
     *    |    1′   |         |    3′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/column-width">MDN</a>
     */
    var columnWidth: ColumnWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `none | strict | content | [ [ size || inline-size ] || layout || style || paint ]`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   52   |   69    |   15.4   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/contain">MDN</a>
     */
    var contain: Contain?

    /**
     * Since September 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto? [ none | <length> ]`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   95   |   107   |   17   |   95   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/contain-intrinsic-block-size">MDN</a>
     */
    var containIntrinsicBlockSize: ContainIntrinsicBlockSize?

    /**
     * Since September 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto? [ none | <length> ]`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   95   |   107   |   17   |   95   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/contain-intrinsic-height">MDN</a>
     */
    var containIntrinsicHeight: ContainIntrinsicHeight?

    /**
     * Since September 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto? [ none | <length> ]`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   95   |   107   |   17   |   95   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/contain-intrinsic-inline-size">MDN</a>
     */
    var containIntrinsicInlineSize: ContainIntrinsicInlineSize?

    /**
     * Since September 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto? [ none | <length> ]`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   95   |   107   |   17   |   95   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/contain-intrinsic-width">MDN</a>
     */
    var containIntrinsicWidth: ContainIntrinsicWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since February 2023.
     *
     * **Syntax**: `none | <custom-ident>+`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   105   |   110   |   16   |   105   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/container-name">MDN</a>
     */
    var containerName: ContainerName?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since February 2023.
     *
     * **Syntax**: `normal | [ [ size | inline-size ] || scroll-state ]`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   105   |   110   |   16   |   105   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/container-type">MDN</a>
     */
    var containerType: ContainerType?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | none | [ <content-replacement> | <content-list> ] [ / [ <string> | <counter> | <attr()> ]+ ]?`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/content">MDN</a>
     */
    var content: Content?

    /**
     * Since September 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `visible | auto | hidden`
     *
     * **Initial value**: `visible`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   85   |   125   |   18   |   85   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/content-visibility">MDN</a>
     */
    var contentVisibility: ContentVisibility?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ <counter-name> <integer>? ]+ | none`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   2    |    1    |   3    |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/counter-increment">MDN</a>
     */
    var counterIncrement: CounterIncrement?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ <counter-name> <integer>? | <reversed-counter-name> <integer>? ]+ | none`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   2    |    1    |   3    |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/counter-reset">MDN</a>
     */
    var counterReset: CounterReset?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `[ <counter-name> <integer>? ]+ | none`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   85   |   68    |   17.2   |   85   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/counter-set">MDN</a>
     */
    var counterSet: CounterSet?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since December 2021.
     *
     * **Syntax**: `[ [ <url> [ <x> <y> ]? , ]* <cursor-predefined> ]`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |    1    |   1.2   |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/cursor">MDN</a>
     */
    var cursor: Cursor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   43   |   69    |   9    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/cx">MDN</a>
     */
    var cx: Cx?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   43   |   69    |   9    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/cy">MDN</a>
     */
    var cy: Cy?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | path(<string>)`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   52   |   97    |   No   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/d">MDN</a>
     */
    var d: D?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `ltr | rtl`
     *
     * **Initial value**: `ltr`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   2    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/direction">MDN</a>
     */
    var direction: Direction?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ <display-outside> || <display-inside> ] | <display-listitem> | <display-internal> | <display-box> | <display-legacy>`
     *
     * **Initial value**: `inline`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/display">MDN</a>
     */
    var display: Display?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | text-bottom | alphabetic | ideographic | middle | central | mathematical | hanging | text-top`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   1    |    1    |   4    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/dominant-baseline">MDN</a>
     */
    var dominantBaseline: DominantBaseline?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `show | hide`
     *
     * **Initial value**: `show`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |    1    |   1.2   |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/empty-cells">MDN</a>
     */
    var emptyCells: EmptyCells?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `content | fixed`
     *
     * **Initial value**: `fixed`
     *
     *    | Chrome  | Firefox |   Safari    |  Edge   | IE  |
     *    | :-----: | :-----: | :---------: | :-----: | :-: |
     *    |   123   |   No    |   preview   |   123   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/field-sizing">MDN</a>
     */
    var fieldSizing: FieldSizing?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<paint>`
     *
     * **Initial value**: `black`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/fill">MDN</a>
     */
    var fill: Fill?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<'opacity'>`
     *
     * **Initial value**: `1`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    1    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/fill-opacity">MDN</a>
     */
    var fillOpacity: FillOpacity?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `nonzero | evenodd`
     *
     * **Initial value**: `nonzero`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/fill-rule">MDN</a>
     */
    var fillRule: FillRule?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2016.
     *
     * **Syntax**: `none | <filter-value-list>`
     *
     * **Initial value**: `none`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  | IE  |
     *    | :------: | :-----: | :-----: | :----: | :-: |
     *    |    53    |   35    |   9.1   |   12   | No  |
     *    |    18′   |         |    6′   |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/filter">MDN</a>
     */
    var filter: Filter?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `content | <'width'>`
     *
     * **Initial value**: `auto`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   22    |    9    |   12   |   11   |
     *    |    22′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/flex-basis">MDN</a>
     */
    var flexBasis: FlexBasis?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `row | row-reverse | column | column-reverse`
     *
     * **Initial value**: `row`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
     *    | :------: | :-----: | :-----: | :----: | :------: |
     *    |    29    |   22    |    9    |   12   |    11    |
     *    |    21′   |         |    7′   |        |    10′   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/flex-direction">MDN</a>
     */
    var flexDirection: FlexDirection?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<number>`
     *
     * **Initial value**: `0`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |            IE            |
     *    | :------: | :-----: | :-----: | :----: | :----------------------: |
     *    |    29    |   20    |    9    |   12   |            11            |
     *    |    22′   |         |    7′   |        | 10 _(-ms-flex-positive)_ |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/flex-grow">MDN</a>
     */
    var flexGrow: FlexGrow?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<number>`
     *
     * **Initial value**: `1`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   20    |    9    |   12   |   10   |
     *    |    22′   |         |    8′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/flex-shrink">MDN</a>
     */
    var flexShrink: FlexShrink?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `nowrap | wrap | wrap-reverse`
     *
     * **Initial value**: `nowrap`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   28    |    9    |   12   |   11   |
     *    |    21′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/flex-wrap">MDN</a>
     */
    var flexWrap: FlexWrap?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `left | right | none | inline-start | inline-end`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/float">MDN</a>
     */
    var float: Float?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `black`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   5    |    3    |   6    |   12   |   ≤11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/flood-color">MDN</a>
     */
    var floodColor: FloodColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<'opacity'>`
     *
     * **Initial value**: `black`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   5    |    3    |   6    |   12   |   ≤11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/flood-opacity">MDN</a>
     */
    var floodOpacity: FloodOpacity?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ <family-name> | <generic-family> ]#`
     *
     * **Initial value**: depends on user agent
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-family">MDN</a>
     */
    var fontFamily: FontFamily?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `normal | <feature-tag-value>#`
     *
     * **Initial value**: `normal`
     *
     *    |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
     *    | :------: | :------: | :-----: | :----: | :----: |
     *    |    48    |    34    |   9.1   |   15   |   10   |
     *    |    16′   |    15′   |         |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-feature-settings">MDN</a>
     */
    var fontFeatureSettings: FontFeatureSettings?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | normal | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   33   |   32    |    9    |   79   | No  |
     *    |        |         |    6′   |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-kerning">MDN</a>
     */
    var fontKerning: FontKerning?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `normal | <string>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   143   |   34    |   No   |   143   | No  |
     *    |         |    4′   |        |         |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-language-override">MDN</a>
     */
    var fontLanguageOverride: FontLanguageOverride?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2020.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   79   |   62    |   13.1   |   17   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-optical-sizing">MDN</a>
     */
    var fontOpticalSizing: FontOpticalSizing?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since November 2022.
     *
     * **Syntax**: `normal | light | dark | <palette-identifier> | <palette-mix()>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   101   |   107   |   15.4   |   101   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-palette">MDN</a>
     */
    var fontPalette: FontPalette?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<absolute-size> | <relative-size> | <length-percentage [0,∞]> | math`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-size">MDN</a>
     */
    var fontSize: FontSize?

    /**
     * Since July 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `none | [ ex-height | cap-height | ch-width | ic-width | ic-height ]? [ from-font | <number> ]`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   127   |    3    |   16.4   |   127   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-size-adjust">MDN</a>
     */
    var fontSizeAdjust: FontSizeAdjust?

    /**
     * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
     *
     * **Syntax**: `auto | never | always | <absolute-size> | <length>`
     *
     * **Initial value**: `auto`
     *
     *    |              Chrome              |              Firefox               |              Safari              |               Edge                | IE  |
     *    | :------------------------------: | :--------------------------------: | :------------------------------: | :-------------------------------: | :-: |
     *    |   5   _(-webkit-font-smoothing)_ |   25   _(-moz-osx-font-smoothing)_ |   4   _(-webkit-font-smoothing)_ |   79   _(-webkit-font-smoothing)_ | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-smooth">MDN</a>
     */
    var fontSmooth: FontSmooth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | italic | oblique <angle>?`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-style">MDN</a>
     */
    var fontStyle: FontStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2022.
     *
     * **Syntax**: `none | [ weight || style || small-caps || position]`
     *
     * **Initial value**: `weight style small-caps position `
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   97   |   34    |   9    |   97   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-synthesis">MDN</a>
     */
    var fontSynthesis: FontSynthesis?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   No   |   118   |   No   |  No  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-synthesis-position">MDN</a>
     */
    var fontSynthesisPosition: FontSynthesisPosition?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2023.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   97   |   111   |   16.4   |   97   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-synthesis-small-caps">MDN</a>
     */
    var fontSynthesisSmallCaps: FontSynthesisSmallCaps?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2023.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   97   |   111   |   16.4   |   97   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-synthesis-style">MDN</a>
     */
    var fontSynthesisStyle: FontSynthesisStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2023.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   97   |   111   |   16.4   |   97   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-synthesis-weight">MDN</a>
     */
    var fontSynthesisWeight: FontSynthesisWeight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> || stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) || [ small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps ] || <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero || <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant">MDN</a>
     */
    var fontVariant: FontVariant?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2023.
     *
     * **Syntax**: `normal | [ stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) ]`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :-----: | :-----: | :-: |
     *    |   111   |   34    |   9.1   |   111   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant-alternates">MDN</a>
     */
    var fontVariantAlternates: FontVariantAlternates?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `normal | small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   52   |   34    |   9.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant-caps">MDN</a>
     */
    var fontVariantCaps: FontVariantCaps?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `normal | [ <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   63   |   34    |   9.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant-east-asian">MDN</a>
     */
    var fontVariantEastAsian: FontVariantEastAsian?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `normal | text | emoji | unicode`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   131   |   141   |   No   |   131   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant-emoji">MDN</a>
     */
    var fontVariantEmoji: FontVariantEmoji?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
     *
     * **Initial value**: `normal`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  | IE  |
     *    | :------: | :-----: | :-----: | :----: | :-: |
     *    |    34    |   34    |   9.1   |   79   | No  |
     *    |    31′   |         |    7′   |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant-ligatures">MDN</a>
     */
    var fontVariantLigatures: FontVariantLigatures?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `normal | [ <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero ]`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   52   |   34    |   9.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant-numeric">MDN</a>
     */
    var fontVariantNumeric: FontVariantNumeric?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `normal | sub | super`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari  | Edge | IE  |
     *    | :----: | :-----: | :-----: | :--: | :-: |
     *    |   No   |   34    |   9.1   |  No  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variant-position">MDN</a>
     */
    var fontVariantPosition: FontVariantPosition?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2018.
     *
     * **Syntax**: `normal | [ <string> <number> ]#`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   62   |   62    |   11   |   17   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-variation-settings">MDN</a>
     */
    var fontVariationSettings: FontVariationSettings?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<font-weight-absolute> | bolder | lighter`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   2    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/font-weight">MDN</a>
     */
    var fontWeight: FontWeight?

    /**
     * **Syntax**: `normal | <percentage [0,∞]> | ultra-condensed | extra-condensed | condensed | semi-condensed | semi-expanded | expanded | extra-expanded | ultra-expanded`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   No   |   No    |   18.4   |  No  | No  |
     */
    var fontWidth: FontWidth?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | none | preserve-parent-color`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |              Edge               |                 IE                  |
     *    | :----: | :-----: | :----: | :-----------------------------: | :---------------------------------: |
     *    |   89   |   113   |   No   |               79                |   10   _(-ms-high-contrast-adjust)_ |
     *    |        |         |        | 12 _(-ms-high-contrast-adjust)_ |                                     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/forced-color-adjust">MDN</a>
     */
    var forcedColorAdjust: ForcedColorAdjust?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `<track-size>+`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  |             IE              |
     *    | :----: | :-----: | :------: | :----: | :-------------------------: |
     *    |   57   |   70    |   10.1   |   16   |   10   _(-ms-grid-columns)_ |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-auto-columns">MDN</a>
     */
    var gridAutoColumns: GridAutoColumns?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `[ row | column ] || dense`
     *
     * **Initial value**: `row`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-auto-flow">MDN</a>
     */
    var gridAutoFlow: GridAutoFlow?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `<track-size>+`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  |            IE            |
     *    | :----: | :-----: | :------: | :----: | :----------------------: |
     *    |   57   |   70    |   10.1   |   16   |   10   _(-ms-grid-rows)_ |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-auto-rows">MDN</a>
     */
    var gridAutoRows: GridAutoRows?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-column-end">MDN</a>
     */
    var gridColumnEnd: GridColumnEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-column-start">MDN</a>
     */
    var gridColumnStart: GridColumnStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-row-end">MDN</a>
     */
    var gridRowEnd: GridRowEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `<grid-line>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-row-start">MDN</a>
     */
    var gridRowStart: GridRowStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `none | <string>+`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-template-areas">MDN</a>
     */
    var gridTemplateAreas: GridTemplateAreas?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  |             IE              |
     *    | :----: | :-----: | :------: | :----: | :-------------------------: |
     *    |   57   |   52    |   10.1   |   16   |   10   _(-ms-grid-columns)_ |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-template-columns">MDN</a>
     */
    var gridTemplateColumns: GridTemplateColumns?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  |            IE            |
     *    | :----: | :-----: | :------: | :----: | :----------------------: |
     *    |   57   |   52    |   10.1   |   16   |   10   _(-ms-grid-rows)_ |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/grid-template-rows">MDN</a>
     */
    var gridTemplateRows: GridTemplateRows?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | [ first || [ force-end | allow-end ] || last ]`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari | Edge | IE  |
     *    | :----: | :-----: | :----: | :--: | :-: |
     *    |   No   |   No    |   10   |  No  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/hanging-punctuation">MDN</a>
     */
    var hangingPunctuation: HangingPunctuation?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage [0,∞]> | min-content | max-content | fit-content | fit-content(<length-percentage [0,∞]>) | <calc-size()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/height">MDN</a>
     */
    var height: Height?

    /**
     * Since September 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto | <string>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox |  Safari   |   Edge   | IE  |
     *    | :-----: | :-----: | :-------: | :------: | :-: |
     *    |   106   |   98    |    17     |   106    | No  |
     *    |    6′   |         |    5.1′   |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/hyphenate-character">MDN</a>
     */
    var hyphenateCharacter: HyphenateCharacter?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ auto | <integer> ]{1,3}`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   109   |   137   |   No   |   109   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/hyphenate-limit-chars">MDN</a>
     */
    var hyphenateLimitChars: HyphenateLimitChars?

    /**
     * Since September 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `none | manual | auto`
     *
     * **Initial value**: `manual`
     *
     *    |  Chrome  | Firefox |  Safari   |  Edge  |      IE      |
     *    | :------: | :-----: | :-------: | :----: | :----------: |
     *    |    55    |   43    |    17     |   79   |       10′    |
     *    |    13′   |    6′   |    5.1′   |        |              |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/hyphens">MDN</a>
     */
    var hyphens: Hyphens?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2020.
     *
     * **Syntax**: `from-image | <angle> | [ <angle>? flip ]`
     *
     * **Initial value**: `from-image`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   81   |   26    |   13.1   |   81   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/image-orientation">MDN</a>
     */
    var imageOrientation: ImageOrientation?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | crisp-edges | pixelated | smooth`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   13   |   3.6   |   6    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/image-rendering">MDN</a>
     */
    var imageRendering: ImageRendering?

    /**
     * The **`image-resolution`** CSS property specifies the intrinsic resolution of all raster images used in or on the element. It affects content images such as replaced elements and generated content, and decorative images such as `background-image` images.
     *
     * **Syntax**: `[ from-image || <resolution> ] && snap?`
     *
     * **Initial value**: `1dppx`
     */
    var imageResolution: ImageResolution?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `normal | [ <number> <integer>? ]`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox |   Safari    |  Edge   | IE  |
     *    | :-----: | :-----: | :---------: | :-----: | :-: |
     *    |   110   |   No    |       9′    |   110   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/initial-letter">MDN</a>
     */
    var initialLetter: InitialLetter?

    /**
     * **Syntax**: `[ auto | alphabetic | hanging | ideographic ]`
     *
     * **Initial value**: `auto`
     */
    var initialLetterAlign: InitialLetterAlign?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'width'>`
     *
     * **Initial value**: `auto`
     *
     *    |           Chrome            | Firefox |            Safari             |  Edge  | IE  |
     *    | :-------------------------: | :-----: | :---------------------------: | :----: | :-: |
     *    |             57              |   41    |             12.1              |   79   | No  |
     *    | 8 _(-webkit-logical-width)_ |         | 5.1 _(-webkit-logical-width)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/inline-size">MDN</a>
     */
    var inlineSize: InlineSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   87   |   63    |   14.1   |   87   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/inset-block-end">MDN</a>
     */
    var insetBlockEnd: InsetBlockEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   87   |   63    |   14.1   |   87   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/inset-block-start">MDN</a>
     */
    var insetBlockStart: InsetBlockStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   87   |   63    |   14.1   |   87   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/inset-inline-end">MDN</a>
     */
    var insetInlineEnd: InsetInlineEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<'top'>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   87   |   63    |   14.1   |   87   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/inset-inline-start">MDN</a>
     */
    var insetInlineStart: InsetInlineStart?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `numeric-only | allow-keywords`
     *
     * **Initial value**: `numeric-only`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   129   |   No    |   No   |   129   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/interpolate-size">MDN</a>
     */
    var interpolateSize: InterpolateSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | isolate`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   41   |   36    |   8    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/isolation">MDN</a>
     */
    var isolation: Isolation?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
     *
     * **Initial value**: `normal`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :------: | :-----: | :-----: | :----: | :----: |
     *    |    29    |   20    |    9    |   12   |   11   |
     *    |    21′   |         |    7′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/justify-content">MDN</a>
     */
    var justifyContent: JustifyContent?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2016.
     *
     * **Syntax**: `normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ] | legacy | legacy && [ left | right | center ] | anchor-center`
     *
     * **Initial value**: `legacy`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   52   |   20    |   9    |   12   |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/justify-items">MDN</a>
     */
    var justifyItems: JustifyItems?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ] | anchor-center`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  |   IE   |
     *    | :----: | :-----: | :------: | :----: | :----: |
     *    |   57   |   45    |   10.1   |   16   |   10   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/justify-self">MDN</a>
     */
    var justifySelf: JustifySelf?

    /**
     * **Syntax**: `[ normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ] ]#`
     *
     * **Initial value**: `normal`
     */
    var justifyTracks: JustifyTracks?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage> | <anchor()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/left">MDN</a>
     */
    var left: Left?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | <length>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/letter-spacing">MDN</a>
     */
    var letterSpacing: LetterSpacing?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `white`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   5    |    3    |   6    |   12   |   ≤11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/lighting-color">MDN</a>
     */
    var lightingColor: LightingColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `auto | loose | normal | strict | anywhere`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE    |
     *    | :-----: | :-----: | :-----: | :----: | :-----: |
     *    |   58    |   69    |   11    |   14   |   5.5   |
     *    |    1′   |         |    3′   |        |         |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/line-break">MDN</a>
     */
    var lineBreak: LineBreak?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | <number> | <length> | <percentage>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/line-height">MDN</a>
     */
    var lineHeight: LineHeight?

    /**
     * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     */
    var lineHeightStep: LineHeightStep?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<image> | none`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/list-style-image">MDN</a>
     */
    var listStyleImage: ListStyleImage?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `inside | outside`
     *
     * **Initial value**: `outside`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/list-style-position">MDN</a>
     */
    var listStylePosition: ListStylePosition?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<counter-style> | <string> | none`
     *
     * **Initial value**: `disc`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/list-style-type">MDN</a>
     */
    var listStyleType: ListStyleType?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'margin-top'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-block-end">MDN</a>
     */
    var marginBlockEnd: MarginBlockEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'margin-top'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-block-start">MDN</a>
     */
    var marginBlockStart: MarginBlockStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage> | auto | <anchor-size()>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-bottom">MDN</a>
     */
    var marginBottom: MarginBottom?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'margin-top'>`
     *
     * **Initial value**: `0`
     *
     *    |          Chrome          |        Firefox        |          Safari          |  Edge  | IE  |
     *    | :----------------------: | :-------------------: | :----------------------: | :----: | :-: |
     *    |            69            |          41           |           12.1           |   79   | No  |
     *    | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ | 3 _(-webkit-margin-end)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-inline-end">MDN</a>
     */
    var marginInlineEnd: MarginInlineEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'margin-top'>`
     *
     * **Initial value**: `0`
     *
     *    |           Chrome           |         Firefox         |           Safari           |  Edge  | IE  |
     *    | :------------------------: | :---------------------: | :------------------------: | :----: | :-: |
     *    |             69             |           41            |            12.1            |   79   | No  |
     *    | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ | 3 _(-webkit-margin-start)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-inline-start">MDN</a>
     */
    var marginInlineStart: MarginInlineStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage> | auto | <anchor-size()>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-left">MDN</a>
     */
    var marginLeft: MarginLeft?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage> | auto | <anchor-size()>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-right">MDN</a>
     */
    var marginRight: MarginRight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage> | auto | <anchor-size()>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-top">MDN</a>
     */
    var marginTop: MarginTop?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | in-flow | all`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   No   |   No    |   16.4   |  No  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/margin-trim">MDN</a>
     */
    var marginTrim: MarginTrim?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `none | <url>`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/marker">MDN</a>
     */
    var marker: Marker?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `none | <url>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/marker-end">MDN</a>
     */
    var markerEnd: MarkerEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `none | <url>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/marker-mid">MDN</a>
     */
    var markerMid: MarkerMid?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `none | <url>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/marker-start">MDN</a>
     */
    var markerStart: MarkerStart?

    /**
     * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
     *
     * **Syntax**: `luminance | alpha`
     *
     * **Initial value**: `alpha`
     */
    var maskBorderMode: MaskBorderMode?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ <length> | <number> ]{1,4}`
     *
     * **Initial value**: `0`
     *
     *    |                 Chrome                  | Firefox |                Safari                 |                   Edge                   | IE  |
     *    | :-------------------------------------: | :-----: | :-----------------------------------: | :--------------------------------------: | :-: |
     *    |   1   _(-webkit-mask-box-image-outset)_ |   No    |                 17.2                  |   79   _(-webkit-mask-box-image-outset)_ | No  |
     *    |                                         |         | 3.1 _(-webkit-mask-box-image-outset)_ |                                          |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-border-outset">MDN</a>
     */
    var maskBorderOutset: MaskBorderOutset?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
     *
     * **Initial value**: `stretch`
     *
     *    |                 Chrome                  | Firefox |                Safari                 |                   Edge                   | IE  |
     *    | :-------------------------------------: | :-----: | :-----------------------------------: | :--------------------------------------: | :-: |
     *    |   1   _(-webkit-mask-box-image-repeat)_ |   No    |                 17.2                  |   79   _(-webkit-mask-box-image-repeat)_ | No  |
     *    |                                         |         | 3.1 _(-webkit-mask-box-image-repeat)_ |                                          |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-border-repeat">MDN</a>
     */
    var maskBorderRepeat: MaskBorderRepeat?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `<number-percentage>{1,4} fill?`
     *
     * **Initial value**: `0`
     *
     *    |                 Chrome                 | Firefox |                Safari                |                  Edge                   | IE  |
     *    | :------------------------------------: | :-----: | :----------------------------------: | :-------------------------------------: | :-: |
     *    |   1   _(-webkit-mask-box-image-slice)_ |   No    |                 17.2                 |   79   _(-webkit-mask-box-image-slice)_ | No  |
     *    |                                        |         | 3.1 _(-webkit-mask-box-image-slice)_ |                                         |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-border-slice">MDN</a>
     */
    var maskBorderSlice: MaskBorderSlice?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | <image>`
     *
     * **Initial value**: `none`
     *
     *    |                 Chrome                  | Firefox |                Safari                 |                   Edge                   | IE  |
     *    | :-------------------------------------: | :-----: | :-----------------------------------: | :--------------------------------------: | :-: |
     *    |   1   _(-webkit-mask-box-image-source)_ |   No    |                 17.2                  |   79   _(-webkit-mask-box-image-source)_ | No  |
     *    |                                         |         | 3.1 _(-webkit-mask-box-image-source)_ |                                          |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-border-source">MDN</a>
     */
    var maskBorderSource: MaskBorderSource?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
     *
     * **Initial value**: `auto`
     *
     *    |                 Chrome                 | Firefox |                Safari                |                  Edge                   | IE  |
     *    | :------------------------------------: | :-----: | :----------------------------------: | :-------------------------------------: | :-: |
     *    |   1   _(-webkit-mask-box-image-width)_ |   No    |                 17.2                 |   79   _(-webkit-mask-box-image-width)_ | No  |
     *    |                                        |         | 3.1 _(-webkit-mask-box-image-width)_ |                                         |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-border-width">MDN</a>
     */
    var maskBorderWidth: MaskBorderWidth?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `[ <coord-box> | no-clip ]#`
     *
     * **Initial value**: `border-box`
     *
     *    | Chrome  | Firefox |  Safari  |   Edge   | IE  |
     *    | :-----: | :-----: | :------: | :------: | :-: |
     *    |   120   |   53    |   15.4   |   120    | No  |
     *    |    1′   |         |    4′    |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-clip">MDN</a>
     */
    var maskClip: MaskClip?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<compositing-operator>#`
     *
     * **Initial value**: `add`
     *
     *    | Chrome  | Firefox |  Safari  | Edge  | IE  |
     *    | :-----: | :-----: | :------: | :---: | :-: |
     *    |   120   |   53    |   15.4   | 18-79 | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-composite">MDN</a>
     */
    var maskComposite: MaskComposite?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<mask-reference>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  | Edge  | IE  |
     *    | :-----: | :-----: | :------: | :---: | :-: |
     *    |   120   |   53    |   15.4   | 16-79 | No  |
     *    |    1′   |         |    4′    |       |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-image">MDN</a>
     */
    var maskImage: MaskImage?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<masking-mode>#`
     *
     * **Initial value**: `match-source`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   120   |   53    |   15.4   |   120   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-mode">MDN</a>
     */
    var maskMode: MaskMode?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<coord-box>#`
     *
     * **Initial value**: `border-box`
     *
     *    | Chrome  | Firefox |  Safari  |   Edge   | IE  |
     *    | :-----: | :-----: | :------: | :------: | :-: |
     *    |   120   |   53    |   15.4   |   120    | No  |
     *    |    1′   |         |    4′    |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-origin">MDN</a>
     */
    var maskOrigin: MaskOrigin?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<position>#`
     *
     * **Initial value**: `0% 0%`
     *
     *    | Chrome  | Firefox |  Safari   | Edge  | IE  |
     *    | :-----: | :-----: | :-------: | :---: | :-: |
     *    |   120   |   53    |   15.4    | 18-79 | No  |
     *    |    1′   |         |    3.1′   |       |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-position">MDN</a>
     */
    var maskPosition: MaskPosition?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<repeat-style>#`
     *
     * **Initial value**: `repeat`
     *
     *    | Chrome  | Firefox |  Safari   | Edge  | IE  |
     *    | :-----: | :-----: | :-------: | :---: | :-: |
     *    |   120   |   53    |   15.4    | 18-79 | No  |
     *    |    1′   |         |    3.1′   |       |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-repeat">MDN</a>
     */
    var maskRepeat: MaskRepeat?

    /**
     * Since December 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<bg-size>#`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox |  Safari  | Edge  | IE  |
     *    | :-----: | :-----: | :------: | :---: | :-: |
     *    |   120   |   53    |   15.4   | 18-79 | No  |
     *    |    4′   |         |    4′    |       |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-size">MDN</a>
     */
    var maskSize: MaskSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `luminance | alpha`
     *
     * **Initial value**: `luminance`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   24   |   35    |   7    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mask-type">MDN</a>
     */
    var maskType: MaskType?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `[ pack | next ] || [ definite-first | ordered ]`
     *
     * **Initial value**: `pack`
     */
    var masonryAutoFlow: MasonryAutoFlow?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto-add | add(<integer>) | <integer>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   109   |   117   |   No   |   109   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/math-depth">MDN</a>
     */
    var mathDepth: MathDepth?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `normal | compact`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   109   |   No    |   No   |   109   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/math-shift">MDN</a>
     */
    var mathShift: MathShift?

    /**
     * Since August 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `normal | compact`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   109   |   117   |   14.1   |   109   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/math-style">MDN</a>
     */
    var mathStyle: MathStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'max-width'>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/max-block-size">MDN</a>
     */
    var maxBlockSize: MaxBlockSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `none | <length-percentage [0,∞]> | min-content | max-content | fit-content | fit-content(<length-percentage [0,∞]>) | <calc-size()> | <anchor-size()>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |    1    |   1.3   |   12   |   7   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/max-height">MDN</a>
     */
    var maxHeight: MaxHeight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'max-width'>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |   Safari   |  Edge  | IE  |
     *    | :----: | :-----: | :--------: | :----: | :-: |
     *    |   57   |   41    |    12.1    |   79   | No  |
     *    |        |         |    10.1′   |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/max-inline-size">MDN</a>
     */
    var maxInlineSize: MaxInlineSize?

    /**
     * **Syntax**: `none | <integer>`
     *
     * **Initial value**: `none`
     */
    var maxLines: MaxLines?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `none | <length-percentage [0,∞]> | min-content | max-content | fit-content | fit-content(<length-percentage [0,∞]>) | <calc-size()> | <anchor-size()>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   7   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/max-width">MDN</a>
     */
    var maxWidth: MaxWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'min-width'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/min-block-size">MDN</a>
     */
    var minBlockSize: MinBlockSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage [0,∞]> | min-content | max-content | fit-content | fit-content(<length-percentage [0,∞]>) | <calc-size()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |    3    |   1.3   |   12   |   7   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/min-height">MDN</a>
     */
    var minHeight: MinHeight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'min-width'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/min-inline-size">MDN</a>
     */
    var minInlineSize: MinInlineSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage [0,∞]> | min-content | max-content | fit-content | fit-content(<length-percentage [0,∞]>) | <calc-size()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   7   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/min-width">MDN</a>
     */
    var minWidth: MinWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<blend-mode> | plus-darker | plus-lighter`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   41   |   32    |   8    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/mix-blend-mode">MDN</a>
     */
    var mixBlendMode: MixBlendMode?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `<length-percentage>`
     *
     * **Initial value**: `0`
     *
     *    |         Chrome         | Firefox | Safari |  Edge  | IE  |
     *    | :--------------------: | :-----: | :----: | :----: | :-: |
     *    |           55           |   72    |   16   |   79   | No  |
     *    | 46 _(motion-distance)_ |         |        |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-distance">MDN</a>
     */
    var motionDistance: OffsetDistance?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `none | <offset-path> || <coord-box>`
     *
     * **Initial value**: `none`
     *
     *    |       Chrome       | Firefox |  Safari  |  Edge  | IE  |
     *    | :----------------: | :-----: | :------: | :----: | :-: |
     *    |         55         |   72    |   15.4   |   79   | No  |
     *    | 46 _(motion-path)_ |         |          |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-path">MDN</a>
     */
    var motionPath: OffsetPath?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `[ auto | reverse ] || <angle>`
     *
     * **Initial value**: `auto`
     *
     *    |         Chrome         | Firefox | Safari |  Edge  | IE  |
     *    | :--------------------: | :-----: | :----: | :----: | :-: |
     *    |           56           |   72    |   16   |   79   | No  |
     *    | 46 _(motion-rotation)_ |         |        |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-rotate">MDN</a>
     */
    var motionRotation: OffsetRotate?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `fill | contain | cover | none | scale-down`
     *
     * **Initial value**: `fill`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   32   |   36    |   10   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/object-fit">MDN</a>
     */
    var objectFit: ObjectFit?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<position>`
     *
     * **Initial value**: `50% 50%`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   32   |   36    |   10   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/object-position">MDN</a>
     */
    var objectPosition: ObjectPosition?

    /**
     * **Syntax**: `none | <basic-shape-rect>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   104   |   No    |   No   |   104   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/object-view-box">MDN</a>
     */
    var objectViewBox: ObjectViewBox?

    /**
     * Since August 2023, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto | <position>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   116   |   72    |   16   |   116   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-anchor">MDN</a>
     */
    var offsetAnchor: OffsetAnchor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `<length-percentage>`
     *
     * **Initial value**: `0`
     *
     *    |         Chrome         | Firefox | Safari |  Edge  | IE  |
     *    | :--------------------: | :-----: | :----: | :----: | :-: |
     *    |           55           |   72    |   16   |   79   | No  |
     *    | 46 _(motion-distance)_ |         |        |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-distance">MDN</a>
     */
    var offsetDistance: OffsetDistance?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `none | <offset-path> || <coord-box>`
     *
     * **Initial value**: `none`
     *
     *    |       Chrome       | Firefox |  Safari  |  Edge  | IE  |
     *    | :----------------: | :-----: | :------: | :----: | :-: |
     *    |         55         |   72    |   15.4   |   79   | No  |
     *    | 46 _(motion-path)_ |         |          |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-path">MDN</a>
     */
    var offsetPath: OffsetPath?

    /**
     * Since January 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `normal | auto | <position>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   116   |   122   |   16   |   116   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-position">MDN</a>
     */
    var offsetPosition: OffsetPosition?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `[ auto | reverse ] || <angle>`
     *
     * **Initial value**: `auto`
     *
     *    |         Chrome         | Firefox | Safari |  Edge  | IE  |
     *    | :--------------------: | :-----: | :----: | :----: | :-: |
     *    |           56           |   72    |   16   |   79   | No  |
     *    | 46 _(motion-rotation)_ |         |        |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-rotate">MDN</a>
     */
    var offsetRotate: OffsetRotate?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `[ auto | reverse ] || <angle>`
     *
     * **Initial value**: `auto`
     *
     *    |         Chrome         | Firefox | Safari |  Edge  | IE  |
     *    | :--------------------: | :-----: | :----: | :----: | :-: |
     *    |           56           |   72    |   16   |   79   | No  |
     *    | 46 _(motion-rotation)_ |         |        |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/offset-rotate">MDN</a>
     */
    var offsetRotation: OffsetRotate?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<opacity-value>`
     *
     * **Initial value**: `1`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   2    |   12   |   9   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/opacity">MDN</a>
     */
    var opacity: Opacity?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<integer>`
     *
     * **Initial value**: `0`
     *
     *    |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
     *    | :------: | :-----: | :-----: | :----: | :------: |
     *    |    29    |   20    |    9    |   12   |    11    |
     *    |    21′   |         |    7′   |        |    10′   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/order">MDN</a>
     */
    var order: Order?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `<integer>`
     *
     * **Initial value**: `2`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   25   |   No    |   1.3   |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/orphans">MDN</a>
     */
    var orphans: Orphans?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <color>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |   1.5   |   1.2   |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/outline-color">MDN</a>
     */
    var outlineColor: OutlineColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   1    |   1.5   |   1.2   |   15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/outline-offset">MDN</a>
     */
    var outlineOffset: OutlineOffset?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <outline-line-style>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |   1.5   |   1.2   |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/outline-style">MDN</a>
     */
    var outlineStyle: OutlineStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<line-width>`
     *
     * **Initial value**: `medium`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |   1.5   |   1.2   |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/outline-width">MDN</a>
     */
    var outlineWidth: OutlineWidth?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |   Safari    |  Edge  | IE  |
     *    | :----: | :-----: | :---------: | :----: | :-: |
     *    |   56   |   66    |   preview   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overflow-anchor">MDN</a>
     */
    var overflowAnchor: OverflowAnchor?

    /**
     * Since September 2025, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   135   |   69    |   26   |   135   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overflow-block">MDN</a>
     */
    var overflowBlock: Overflow?

    /**
     * **Syntax**: `padding-box | content-box`
     *
     * **Initial value**: `padding-box`
     */
    var overflowClipBox: OverflowClipBox?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `<visual-box> || <length [0,∞]>`
     *
     * **Initial value**: `0px`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   90   |   102   |   No   |   90   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overflow-clip-margin">MDN</a>
     */
    var overflowClipMargin: OverflowClipMargin?

    /**
     * Since September 2025, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   135   |   69    |   26   |   135   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overflow-inline">MDN</a>
     */
    var overflowInline: Overflow?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2018.
     *
     * **Syntax**: `normal | break-word | anywhere`
     *
     * **Initial value**: `normal`
     *
     *    |     Chrome      |      Firefox      |     Safari      |       Edge       |          IE           |
     *    | :-------------: | :---------------: | :-------------: | :--------------: | :-------------------: |
     *    |       23        |        49         |        7        |        18        |   5.5   _(word-wrap)_ |
     *    | 1 _(word-wrap)_ | 3.5 _(word-wrap)_ | 1 _(word-wrap)_ | 12 _(word-wrap)_ |                       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overflow-wrap">MDN</a>
     */
    var overflowWrap: OverflowWrap?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `visible`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |   3.5   |   3    |   12   |   5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overflow-x">MDN</a>
     */
    var overflowX: Overflow?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `visible | hidden | clip | scroll | auto`
     *
     * **Initial value**: `visible`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |   3.5   |   3    |   12   |   5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overflow-y">MDN</a>
     */
    var overflowY: Overflow?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | auto`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   117   |   No    |   No   |   117   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overlay">MDN</a>
     */
    var overlay: Overlay?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   77   |   73    |   16   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overscroll-behavior-block">MDN</a>
     */
    var overscrollBehaviorBlock: OverscrollBehavior?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   77   |   73    |   16   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overscroll-behavior-inline">MDN</a>
     */
    var overscrollBehaviorInline: OverscrollBehavior?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   63   |   59    |   16   |   18   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overscroll-behavior-x">MDN</a>
     */
    var overscrollBehaviorX: OverscrollBehavior?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `contain | none | auto`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   63   |   59    |   16   |   18   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/overscroll-behavior-y">MDN</a>
     */
    var overscrollBehaviorY: OverscrollBehavior?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'padding-top'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-block-end">MDN</a>
     */
    var paddingBlockEnd: PaddingBlockEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'padding-top'>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   41    |   12.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-block-start">MDN</a>
     */
    var paddingBlockStart: PaddingBlockStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-bottom">MDN</a>
     */
    var paddingBottom: PaddingBottom?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'padding-top'>`
     *
     * **Initial value**: `0`
     *
     *    |          Chrome           |        Firefox         |          Safari           |  Edge  | IE  |
     *    | :-----------------------: | :--------------------: | :-----------------------: | :----: | :-: |
     *    |            69             |           41           |           12.1            |   79   | No  |
     *    | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ | 3 _(-webkit-padding-end)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-inline-end">MDN</a>
     */
    var paddingInlineEnd: PaddingInlineEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<'padding-top'>`
     *
     * **Initial value**: `0`
     *
     *    |           Chrome            |         Firefox          |           Safari            |  Edge  | IE  |
     *    | :-------------------------: | :----------------------: | :-------------------------: | :----: | :-: |
     *    |             69              |            41            |            12.1             |   79   | No  |
     *    | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ | 3 _(-webkit-padding-start)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-inline-start">MDN</a>
     */
    var paddingInlineStart: PaddingInlineStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-left">MDN</a>
     */
    var paddingLeft: PaddingLeft?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-right">MDN</a>
     */
    var paddingRight: PaddingRight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage [0,∞]>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/padding-top">MDN</a>
     */
    var paddingTop: PaddingTop?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since February 2023.
     *
     * **Syntax**: `auto | <custom-ident>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   85   |   110   |   1    |   85   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/page">MDN</a>
     */
    var page: Page?

    /**
     * Since March 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `normal | [ fill || stroke || markers ]`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   123   |   60    |   11   |   123   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/paint-order">MDN</a>
     */
    var paintOrder: PaintOrder?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `none | <length>`
     *
     * **Initial value**: `none`
     *
     *    |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
     *    | :------: | :------: | :-----: | :----: | :----: |
     *    |    36    |    16    |    9    |   12   |   10   |
     *    |    12′   |    10′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/perspective">MDN</a>
     */
    var perspective: Perspective?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<position>`
     *
     * **Initial value**: `50% 50%`
     *
     *    |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
     *    | :------: | :------: | :-----: | :----: | :----: |
     *    |    36    |    16    |    9    |   12   |   10   |
     *    |    12′   |    10′   |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/perspective-origin">MDN</a>
     */
    var perspectiveOrigin: PerspectiveOrigin?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | none | visiblePainted | visibleFill | visibleStroke | visible | painted | fill | stroke | all | inherit`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE   |
     *    | :----: | :-----: | :----: | :----: | :----: |
     *    |   1    |   1.5   |   4    |   12   |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/pointer-events">MDN</a>
     */
    var pointerEvents: PointerEvents?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `static | relative | absolute | sticky | fixed`
     *
     * **Initial value**: `static`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/position">MDN</a>
     */
    var position: Position?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | <anchor-name>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  |   Firefox   | Safari |  Edge   | IE  |
     *    | :-----: | :---------: | :----: | :-----: | :-: |
     *    |   125   |   preview   |   26   |   125   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/position-anchor">MDN</a>
     */
    var positionAnchor: PositionAnchor?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | <position-area>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  |   Firefox   | Safari |  Edge   | IE  |
     *    | :-----: | :---------: | :----: | :-----: | :-: |
     *    |   129   |   preview   |   26   |   129   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/position-area">MDN</a>
     */
    var positionArea: PositionArea?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | [ [<dashed-ident> || <try-tactic>] | <'position-area'> ]#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  |   Firefox   | Safari |  Edge   | IE  |
     *    | :-----: | :---------: | :----: | :-----: | :-: |
     *    |   128   |   preview   |   26   |   128   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/position-try-fallbacks">MDN</a>
     */
    var positionTryFallbacks: PositionTryFallbacks?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `normal | <try-size>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   125   |   No    |   26   |   125   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/position-try-order">MDN</a>
     */
    var positionTryOrder: PositionTryOrder?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `always | [ anchors-valid || anchors-visible || no-overflow ]`
     *
     * **Initial value**: `anchors-visible`
     *
     *    | Chrome  |   Firefox   | Safari |  Edge   | IE  |
     *    | :-----: | :---------: | :----: | :-----: | :-: |
     *    |   125   |   preview   |   No   |   125   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/position-visibility">MDN</a>
     */
    var positionVisibility: PositionVisibility?

    /**
     * Since May 2025, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `economy | exact`
     *
     * **Initial value**: `economy`
     *
     *    |  Chrome  |       Firefox       |  Safari  |   Edge   | IE  |
     *    | :------: | :-----------------: | :------: | :------: | :-: |
     *    |   136    |         97          |   15.4   |   136    | No  |
     *    |    17′   | 48 _(color-adjust)_ |    6′    |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/print-color-adjust">MDN</a>
     */
    var printColorAdjust: PrintColorAdjust?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `none | auto | [ <string> <string> ]+`
     *
     * **Initial value**: depends on user agent
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   11   |   1.5   |   9    |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/quotes">MDN</a>
     */
    var quotes: Quotes?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   43   |   69    |   9    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/r">MDN</a>
     */
    var r: R?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | both | horizontal | vertical | block | inline`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   1    |    4    |   3    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/resize">MDN</a>
     */
    var resize: Resize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage> | <anchor()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/right">MDN</a>
     */
    var right: Right?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since August 2022.
     *
     * **Syntax**: `none | <angle> | [ x | y | z | <number>{3} ] && <angle>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   104   |   72    |   14.1   |   104   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/rotate">MDN</a>
     */
    var rotate: Rotate?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2017.
     *
     * **Syntax**: `normal | <length-percentage>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   47   |   52    |   10.1   |   16   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/row-gap">MDN</a>
     */
    var rowGap: RowGap?

    /**
     * Since December 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `start | center | space-between | space-around`
     *
     * **Initial value**: `space-around`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   128   |   38    |   18.2   |   128   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/ruby-align">MDN</a>
     */
    var rubyAlign: RubyAlign?

    /**
     * **Syntax**: `separate | collapse | auto`
     *
     * **Initial value**: `separate`
     */
    var rubyMerge: RubyMerge?

    /**
     * **Syntax**: `auto | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   No   |   No    |   18.2   |  No  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/ruby-overhang">MDN</a>
     */
    var rubyOverhang: RubyOverhang?

    /**
     * Since December 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `[ alternate || [ over | under ] ] | inter-character`
     *
     * **Initial value**: `alternate`
     *
     *    | Chrome  | Firefox |  Safari  | Edge  | IE  |
     *    | :-----: | :-----: | :------: | :---: | :-: |
     *    |   84    |   38    |   18.2   | 12-79 | No  |
     *    |    1′   |         |    7′    |       |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/ruby-position">MDN</a>
     */
    var rubyPosition: RubyPosition?

    /**
     * Since March 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   43   |   69    |   17.4   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/rx">MDN</a>
     */
    var rx: Rx?

    /**
     * Since March 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   43   |   69    |   17.4   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/ry">MDN</a>
     */
    var ry: Ry?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since August 2022.
     *
     * **Syntax**: `none | [ <number> | <percentage> ]{1,3}`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   104   |   72    |   14.1   |   104   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scale">MDN</a>
     */
    var scale: Scale?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `auto | smooth`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   61   |   36    |   15.4   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-behavior">MDN</a>
     */
    var scrollBehavior: ScrollBehavior?

    /**
     * **Syntax**: `none | nearest`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   133   |   No    |   No   |   133   | No  |
     */
    var scrollInitialTarget: ScrollInitialTarget?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-block-end">MDN</a>
     */
    var scrollMarginBlockEnd: ScrollMarginBlockEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-block-start">MDN</a>
     */
    var scrollMarginBlockStart: ScrollMarginBlockStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |              Safari              |  Edge  | IE  |
     *    | :----: | :-----: | :------------------------------: | :----: | :-: |
     *    |   69   |   68    |               14.1               |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-bottom)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-bottom">MDN</a>
     */
    var scrollMarginBottom: ScrollMarginBottom?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-inline-end">MDN</a>
     */
    var scrollMarginInlineEnd: ScrollMarginInlineEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-inline-start">MDN</a>
     */
    var scrollMarginInlineStart: ScrollMarginInlineStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |             Safari             |  Edge  | IE  |
     *    | :----: | :-----: | :----------------------------: | :----: | :-: |
     *    |   69   |   68    |              14.1              |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-left)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-left">MDN</a>
     */
    var scrollMarginLeft: ScrollMarginLeft?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |             Safari              |  Edge  | IE  |
     *    | :----: | :-----: | :-----------------------------: | :----: | :-: |
     *    |   69   |   68    |              14.1               |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-right)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-right">MDN</a>
     */
    var scrollMarginRight: ScrollMarginRight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |            Safari             |  Edge  | IE  |
     *    | :----: | :-----: | :---------------------------: | :----: | :-: |
     *    |   69   |   68    |             14.1              |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-top)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-top">MDN</a>
     */
    var scrollMarginTop: ScrollMarginTop?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-block-end">MDN</a>
     */
    var scrollPaddingBlockEnd: ScrollPaddingBlockEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-block-start">MDN</a>
     */
    var scrollPaddingBlockStart: ScrollPaddingBlockStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   68    |   14.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-bottom">MDN</a>
     */
    var scrollPaddingBottom: ScrollPaddingBottom?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-inline-end">MDN</a>
     */
    var scrollPaddingInlineEnd: ScrollPaddingInlineEnd?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-inline-start">MDN</a>
     */
    var scrollPaddingInlineStart: ScrollPaddingInlineStart?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   68    |   14.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-left">MDN</a>
     */
    var scrollPaddingLeft: ScrollPaddingLeft?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   68    |   14.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-right">MDN</a>
     */
    var scrollPaddingRight: ScrollPaddingRight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `auto | <length-percentage>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   69   |   68    |   14.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-padding-top">MDN</a>
     */
    var scrollPaddingTop: ScrollPaddingTop?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `[ none | start | end | center ]{1,2}`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   69   |   68    |   11   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-snap-align">MDN</a>
     */
    var scrollSnapAlign: ScrollSnapAlign?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |              Safari              |  Edge  | IE  |
     *    | :----: | :-----: | :------------------------------: | :----: | :-: |
     *    |   69   |   68    |               14.1               |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-bottom)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-bottom">MDN</a>
     */
    var scrollSnapMarginBottom: ScrollMarginBottom?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |             Safari             |  Edge  | IE  |
     *    | :----: | :-----: | :----------------------------: | :----: | :-: |
     *    |   69   |   68    |              14.1              |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-left)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-left">MDN</a>
     */
    var scrollSnapMarginLeft: ScrollMarginLeft?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |             Safari              |  Edge  | IE  |
     *    | :----: | :-----: | :-----------------------------: | :----: | :-: |
     *    |   69   |   68    |              14.1               |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-right)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-right">MDN</a>
     */
    var scrollSnapMarginRight: ScrollMarginRight?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2021.
     *
     * **Syntax**: `<length>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |            Safari             |  Edge  | IE  |
     *    | :----: | :-----: | :---------------------------: | :----: | :-: |
     *    |   69   |   68    |             14.1              |   79   | No  |
     *    |        |         | 11 _(scroll-snap-margin-top)_ |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-margin-top">MDN</a>
     */
    var scrollSnapMarginTop: ScrollMarginTop?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2022.
     *
     * **Syntax**: `normal | always`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   75   |   103   |   15   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-snap-stop">MDN</a>
     */
    var scrollSnapStop: ScrollSnapStop?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2022.
     *
     * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |      IE      |
     *    | :----: | :-----: | :-----: | :----: | :----------: |
     *    |   69   |  39-68  |   11    |   79   |       10′    |
     *    |        |         |    9′   |        |              |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-snap-type">MDN</a>
     */
    var scrollSnapType: ScrollSnapType?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ block | inline | x | y ]#`
     *
     * **Initial value**: `block`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-timeline-axis">MDN</a>
     */
    var scrollTimelineAxis: ScrollTimelineAxis?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ none | <dashed-ident> ]#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scroll-timeline-name">MDN</a>
     */
    var scrollTimelineName: ScrollTimelineName?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | <color>{2}`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   121   |   64    |   No   |   121   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scrollbar-color">MDN</a>
     */
    var scrollbarColor: ScrollbarColor?

    /**
     * Since December 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto | stable && both-edges?`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   94   |   97    |   18.2   |   94   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scrollbar-gutter">MDN</a>
     */
    var scrollbarGutter: ScrollbarGutter?

    /**
     * Since December 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto | thin | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   121   |   64    |   18.2   |   121   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/scrollbar-width">MDN</a>
     */
    var scrollbarWidth: ScrollbarWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<opacity-value>`
     *
     * **Initial value**: `0.0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   37   |   62    |   10.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/shape-image-threshold">MDN</a>
     */
    var shapeImageThreshold: ShapeImageThreshold?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<length-percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   37   |   62    |   10.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/shape-margin">MDN</a>
     */
    var shapeMargin: ShapeMargin?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `none | [ <shape-box> || <basic-shape> ] | <image>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   37   |   62    |   10.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/shape-outside">MDN</a>
     */
    var shapeOutside: ShapeOutside?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | optimizeSpeed | crispEdges | geometricPrecision`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   1    |    3    |   4    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/shape-rendering">MDN</a>
     */
    var shapeRendering: ShapeRendering?

    /**
     * **Syntax**: `normal | spell-out || digits || [ literal-punctuation | no-punctuation ]`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   No   |   No    |   11.1   |  No  | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/speak-as">MDN</a>
     */
    var speakAs: SpeakAs?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<'color'>`
     *
     * **Initial value**: `black`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stop-color">MDN</a>
     */
    var stopColor: StopColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<'opacity'>`
     *
     * **Initial value**: `black`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stop-opacity">MDN</a>
     */
    var stopOpacity: StopOpacity?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<paint>`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke">MDN</a>
     */
    var stroke: Stroke?

    /**
     * **Syntax**: `<color>`
     *
     * **Initial value**: `transparent`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    |   No   |   No    |   11.1   |  No  | No  |
     */
    var strokeColor: StrokeColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `none | <dasharray>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke-dasharray">MDN</a>
     */
    var strokeDasharray: StrokeDasharray?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<length-percentage> | <number>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke-dashoffset">MDN</a>
     */
    var strokeDashoffset: StrokeDashoffset?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `butt | round | square`
     *
     * **Initial value**: `butt`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke-linecap">MDN</a>
     */
    var strokeLinecap: StrokeLinecap?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `miter | miter-clip | round | bevel | arcs`
     *
     * **Initial value**: `miter`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke-linejoin">MDN</a>
     */
    var strokeLinejoin: StrokeLinejoin?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<number>`
     *
     * **Initial value**: `4`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke-miterlimit">MDN</a>
     */
    var strokeMiterlimit: StrokeMiterlimit?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<'opacity'>`
     *
     * **Initial value**: `1`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke-opacity">MDN</a>
     */
    var strokeOpacity: StrokeOpacity?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since April 2017.
     *
     * **Syntax**: `<length-percentage> | <number>`
     *
     * **Initial value**: `1px`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |   1.5   |   4    |   ≤15   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/stroke-width">MDN</a>
     */
    var strokeWidth: StrokeWidth?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since August 2021.
     *
     * **Syntax**: `<integer> | <length>`
     *
     * **Initial value**: `8`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   21   |   91    |   7    |   79   | No  |
     *    |        |    4′   |        |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/tab-size">MDN</a>
     */
    var tabSize: TabSize?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | fixed`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   14   |    1    |   1    |   12   |   5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/table-layout">MDN</a>
     */
    var tableLayout: TableLayout?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `start | end | left | right | center | justify | match-parent`
     *
     * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-align">MDN</a>
     */
    var textAlign: TextAlign?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2022.
     *
     * **Syntax**: `auto | start | end | left | right | center | justify`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   47   |   49    |   16   |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-align-last">MDN</a>
     */
    var textAlignLast: TextAlignLast?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since August 2016.
     *
     * **Syntax**: `start | middle | end`
     *
     * **Initial value**: `start`
     *
     *    | Chrome | Firefox | Safari |  Edge   | IE  |
     *    | :----: | :-----: | :----: | :-----: | :-: |
     *    |   1    |    3    |   4    |   ≤14   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-anchor">MDN</a>
     */
    var textAnchor: TextAnchor?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `normal | <autospace> | auto`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   140   |   145   |   18.4   |   140   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-autospace">MDN</a>
     */
    var textAutospace: TextAutospace?

    /**
     * **Syntax**: `normal | <'text-box-trim'> || <'text-box-edge'>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   133   |   No    |   18.2   |   133   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-box">MDN</a>
     */
    var textBox: TextBox?

    /**
     * **Syntax**: `auto | <text-edge>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   133   |   No    |   18.2   |   133   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-box-edge">MDN</a>
     */
    var textBoxEdge: TextBoxEdge?

    /**
     * **Syntax**: `none | trim-start | trim-end | trim-both`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   133   |   No    |   18.2   |   133   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-box-trim">MDN</a>
     */
    var textBoxTrim: TextBoxTrim?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `none | all | [ digits <integer>? ]`
     *
     * **Initial value**: `none`
     *
     *    |           Chrome           | Firefox |            Safari            |  Edge  |                   IE                   |
     *    | :------------------------: | :-----: | :--------------------------: | :----: | :------------------------------------: |
     *    |             48             |   48    |             15.4             |   79   |   11   _(-ms-text-combine-horizontal)_ |
     *    | 9 _(-webkit-text-combine)_ |         | 5.1 _(-webkit-text-combine)_ |        |                                        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-combine-upright">MDN</a>
     */
    var textCombineUpright: TextCombineUpright?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   36    |   12.1   |   79   | No  |
     *    |        |         |    8′    |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-decoration-color">MDN</a>
     */
    var textDecorationColor: TextDecorationColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   36    |   12.1   |   79   | No  |
     *    |        |         |    8′    |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-decoration-line">MDN</a>
     */
    var textDecorationLine: TextDecorationLine?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
     *
     * **Initial value**: `objects`
     *
     *    | Chrome | Firefox |  Safari  | Edge | IE  |
     *    | :----: | :-----: | :------: | :--: | :-: |
     *    | 57-64  |   No    |   12.1   |  No  | No  |
     *    |        |         |    7′    |      |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-decoration-skip">MDN</a>
     */
    var textDecorationSkip: TextDecorationSkip?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `auto | all | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   64   |   70    |   15.4   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-decoration-skip-ink">MDN</a>
     */
    var textDecorationSkipInk: TextDecorationSkipInk?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `solid | double | dotted | dashed | wavy`
     *
     * **Initial value**: `solid`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   57   |   36    |   12.1   |   79   | No  |
     *    |        |         |    8′    |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-decoration-style">MDN</a>
     */
    var textDecorationStyle: TextDecorationStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2021.
     *
     * **Syntax**: `auto | from-font | <length> | <percentage> `
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   89   |   70    |   12.1   |   89   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-decoration-thickness">MDN</a>
     */
    var textDecorationThickness: TextDecorationThickness?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `<color>`
     *
     * **Initial value**: `currentcolor`
     *
     *    |  Chrome  | Firefox | Safari |   Edge   | IE  |
     *    | :------: | :-----: | :----: | :------: | :-: |
     *    |    99    |   46    |   7    |    99    | No  |
     *    |    25′   |         |        |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-emphasis-color">MDN</a>
     */
    var textEmphasisColor: TextEmphasisColor?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `auto | [ over | under ] && [ right | left ]?`
     *
     * **Initial value**: `auto`
     *
     *    |  Chrome  | Firefox | Safari |   Edge   | IE  |
     *    | :------: | :-----: | :----: | :------: | :-: |
     *    |    99    |   46    |   7    |    99    | No  |
     *    |    25′   |         |        |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-emphasis-position">MDN</a>
     */
    var textEmphasisPosition: TextEmphasisPosition?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2022.
     *
     * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
     *
     * **Initial value**: `none`
     *
     *    |  Chrome  | Firefox | Safari |   Edge   | IE  |
     *    | :------: | :-----: | :----: | :------: | :-: |
     *    |    99    |   46    |   7    |    99    | No  |
     *    |    25′   |         |        |    79′   |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-emphasis-style">MDN</a>
     */
    var textEmphasisStyle: TextEmphasisStyle?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `<length-percentage> && hanging? && each-line?`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   3   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-indent">MDN</a>
     */
    var textIndent: TextIndent?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | inter-character | inter-word | none`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari | Edge  |   IE   |
     *    | :----: | :-----: | :----: | :---: | :----: |
     *    |   No   |   55    |   No   | 12-79 |   11   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-justify">MDN</a>
     */
    var textJustify: TextJustify?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2020.
     *
     * **Syntax**: `mixed | upright | sideways`
     *
     * **Initial value**: `mixed`
     *
     *    |  Chrome  | Firefox |  Safari   |  Edge  | IE  |
     *    | :------: | :-----: | :-------: | :----: | :-: |
     *    |    48    |   41    |    14     |   79   | No  |
     *    |    12′   |         |    5.1′   |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-orientation">MDN</a>
     */
    var textOrientation: TextOrientation?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
     *
     * **Initial value**: `clip`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   1    |    7    |   1.3   |   12   |   6   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-overflow">MDN</a>
     */
    var textOverflow: TextOverflow?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | optimizeSpeed | optimizeLegibility | geometricPrecision`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   4    |    1    |   5    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-rendering">MDN</a>
     */
    var textRendering: TextRendering?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `none | <shadow-t>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |   IE   |
     *    | :----: | :-----: | :-----: | :----: | :----: |
     *    |   2    |   3.5   |   1.1   |   12   |   10   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-shadow">MDN</a>
     */
    var textShadow: TextShadow?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | auto | <percentage>`
     *
     * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   54   |   No    |   No   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-size-adjust">MDN</a>
     */
    var textSizeAdjust: TextSizeAdjust?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `space-all | normal | space-first | trim-start`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   123   |   No    |   No   |   123   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-spacing-trim">MDN</a>
     */
    var textSpacingTrim: TextSpacingTrim?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `none | [ capitalize | uppercase | lowercase ] || full-width || full-size-kana | math-auto`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-transform">MDN</a>
     */
    var textTransform: TextTransform?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since November 2020.
     *
     * **Syntax**: `auto | <length> | <percentage> `
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :------: | :----: | :-: |
     *    |   87   |   70    |   12.1   |   87   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-underline-offset">MDN</a>
     */
    var textUnderlineOffset: TextUnderlineOffset?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox |  Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :------: | :----: | :---: |
     *    |   33   |   74    |   12.1   |   12   |   6   |
     *    |        |         |    9′    |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-underline-position">MDN</a>
     */
    var textUnderlinePosition: TextUnderlinePosition?

    /**
     * Since October 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `wrap | nowrap`
     *
     * **Initial value**: `wrap`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   130   |   124   |   17.4   |   130   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-wrap-mode">MDN</a>
     */
    var textWrapMode: TextWrapMode?

    /**
     * Since October 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `auto | balance | stable | pretty`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   130   |   124   |   17.5   |   130   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/text-wrap-style">MDN</a>
     */
    var textWrapStyle: TextWrapStyle?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `none | <dashed-ident>#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   116   |   No    |   26   |   116   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/timeline-scope">MDN</a>
     */
    var timelineScope: TimelineScope?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage> | <anchor()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/top">MDN</a>
     */
    var top: Top?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2019.
     *
     * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |    IE    |
     *    | :----: | :-----: | :----: | :----: | :------: |
     *    |   36   |   52    |   13   |   12   |    11    |
     *    |        |         |        |        |    10′   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/touch-action">MDN</a>
     */
    var touchAction: TouchAction?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `none | <transform-list>`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  |  Firefox  |  Safari   |  Edge  |   IE    |
     *    | :-----: | :-------: | :-------: | :----: | :-----: |
     *    |   36    |    16     |     9     |   12   |   10    |
     *    |    1′   |    3.5′   |    3.1′   |        |    9′   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transform">MDN</a>
     */
    var transform: Transform?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `content-box | border-box | fill-box | stroke-box | view-box`
     *
     * **Initial value**: `view-box`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   64   |   55    |   11   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transform-box">MDN</a>
     */
    var transformBox: TransformBox?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
     *
     * **Initial value**: `50% 50% 0`
     *
     *    | Chrome  |  Firefox  | Safari  |  Edge  |   IE    |
     *    | :-----: | :-------: | :-----: | :----: | :-----: |
     *    |   36    |    16     |    9    |   12   |   10    |
     *    |    1′   |    3.5′   |    2′   |        |    9′   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transform-origin">MDN</a>
     */
    var transformOrigin: TransformOrigin?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `flat | preserve-3d`
     *
     * **Initial value**: `flat`
     *
     *    |  Chrome  | Firefox  | Safari  |  Edge  | IE  |
     *    | :------: | :------: | :-----: | :----: | :-: |
     *    |    36    |    16    |    9    |   12   | No  |
     *    |    12′   |    10′   |    4′   |        |     |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transform-style">MDN</a>
     */
    var transformStyle: TransformStyle?

    /**
     * Since August 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `<transition-behavior-value>#`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   117   |   129   |   17.4   |   117   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transition-behavior">MDN</a>
     */
    var transitionBehavior: TransitionBehavior?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<time>#`
     *
     * **Initial value**: `0s`
     *
     *    | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     *    | :-----: | :-----: | :-----: | :----: | :----: |
     *    |   26    |   16    |    9    |   12   |   10   |
     *    |    1′   |         |    4′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transition-delay">MDN</a>
     */
    var transitionDelay: TransitionDelay?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<time>#`
     *
     * **Initial value**: `0s`
     *
     *    | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     *    | :-----: | :-----: | :-------: | :----: | :----: |
     *    |   26    |   16    |     9     |   12   |   10   |
     *    |    1′   |         |    3.1′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transition-duration">MDN</a>
     */
    var transitionDuration: TransitionDuration?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `none | <single-transition-property>#`
     *
     * **Initial value**: all
     *
     *    | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     *    | :-----: | :-----: | :-------: | :----: | :----: |
     *    |   26    |   16    |     9     |   12   |   10   |
     *    |    1′   |         |    3.1′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transition-property">MDN</a>
     */
    var transitionProperty: TransitionProperty?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since September 2015.
     *
     * **Syntax**: `<easing-function>#`
     *
     * **Initial value**: `ease`
     *
     *    | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     *    | :-----: | :-----: | :-------: | :----: | :----: |
     *    |   26    |   16    |     9     |   12   |   10   |
     *    |    1′   |         |    3.1′   |        |        |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/transition-timing-function">MDN</a>
     */
    var transitionTimingFunction: TransitionTimingFunction?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since August 2022.
     *
     * **Syntax**: `none | <length-percentage> [ <length-percentage> <length>? ]?`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   104   |   72    |   14.1   |   104   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/translate">MDN</a>
     */
    var translate: Translate?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | embed | isolate | bidi-override | isolate-override | plaintext`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |   IE    |
     *    | :----: | :-----: | :-----: | :----: | :-----: |
     *    |   2    |    1    |   1.3   |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/unicode-bidi">MDN</a>
     */
    var unicodeBidi: UnicodeBidi?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `auto | text | none | all`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox |   Safari    |   Edge   |      IE      |
     *    | :-----: | :-----: | :---------: | :------: | :----------: |
     *    |   54    |   69    |       3′    |    79    |       10′    |
     *    |    1′   |    1′   |             |    12′   |              |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/user-select">MDN</a>
     */
    var userSelect: UserSelect?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `none | non-scaling-stroke | non-scaling-size | non-rotation | fixed-position`
     *
     * **Initial value**: `none`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   6    |   15    |   5.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/vector-effect">MDN</a>
     */
    var vectorEffect: VectorEffect?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `baseline | sub | super | text-top | text-bottom | middle | top | bottom | <percentage> | <length>`
     *
     * **Initial value**: `baseline`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/vertical-align">MDN</a>
     */
    var verticalAlign: VerticalAlign?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ block | inline | x | y ]#`
     *
     * **Initial value**: `block`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/view-timeline-axis">MDN</a>
     */
    var viewTimelineAxis: ViewTimelineAxis?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ [ auto | <length-percentage> ]{1,2} ]#`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/view-timeline-inset">MDN</a>
     */
    var viewTimelineInset: ViewTimelineInset?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `[ none | <dashed-ident> ]#`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   115   |   No    |   26   |   115   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/view-timeline-name">MDN</a>
     */
    var viewTimelineName: ViewTimelineName?

    /**
     * **Syntax**: `none | <custom-ident>+`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   125   |   144   |   18.2   |   125   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/view-transition-class">MDN</a>
     */
    var viewTransitionClass: ViewTransitionClass?

    /**
     * Since October 2025, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `none | <custom-ident> | match-element`
     *
     * **Initial value**: `none`
     *
     *    | Chrome  | Firefox | Safari |  Edge   | IE  |
     *    | :-----: | :-----: | :----: | :-----: | :-: |
     *    |   111   |   144   |   18   |   111   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/view-transition-name">MDN</a>
     */
    var viewTransitionName: ViewTransitionName?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `visible | hidden | collapse`
     *
     * **Initial value**: `visible`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/visibility">MDN</a>
     */
    var visibility: Visibility?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | pre | pre-wrap | pre-line | <'white-space-collapse'> || <'text-wrap-mode'>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |    1    |   1    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/white-space">MDN</a>
     */
    var whiteSpace: WhiteSpace?

    /**
     * Since March 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `collapse | preserve | preserve-breaks | preserve-spaces | break-spaces`
     *
     * **Initial value**: `collapse`
     *
     *    | Chrome  | Firefox |  Safari  |  Edge   | IE  |
     *    | :-----: | :-----: | :------: | :-----: | :-: |
     *    |   114   |   124   |   17.4   |   114   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/white-space-collapse">MDN</a>
     */
    var whiteSpaceCollapse: WhiteSpaceCollapse?

    /**
     * This feature is not Baseline because it does not work in some of the most widely-used browsers.
     *
     * **Syntax**: `<integer>`
     *
     * **Initial value**: `2`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |  IE   |
     *    | :----: | :-----: | :-----: | :----: | :---: |
     *    |   25   |   No    |   1.3   |   12   |   8   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/widows">MDN</a>
     */
    var widows: Widows?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <length-percentage [0,∞]> | min-content | max-content | fit-content | fit-content(<length-percentage [0,∞]>) | <calc-size()> | <anchor-size()>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/width">MDN</a>
     */
    var width: Width?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since January 2020.
     *
     * **Syntax**: `auto | <animateable-feature>#`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari  |  Edge  | IE  |
     *    | :----: | :-----: | :-----: | :----: | :-: |
     *    |   36   |   36    |   9.1   |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/will-change">MDN</a>
     */
    var willChange: WillChange?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | break-all | keep-all | break-word | auto-phrase`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |   IE    |
     *    | :----: | :-----: | :----: | :----: | :-----: |
     *    |   1    |   15    |   3    |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/word-break">MDN</a>
     */
    var wordBreak: WordBreak?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `normal | <length>`
     *
     * **Initial value**: `normal`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   6   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/word-spacing">MDN</a>
     */
    var wordSpacing: WordSpacing?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since October 2018.
     *
     * **Syntax**: `normal | break-word`
     *
     * **Initial value**: `normal`
     */
    var wordWrap: WordWrap?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since March 2017.
     *
     * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
     *
     * **Initial value**: `horizontal-tb`
     *
     *    | Chrome  | Firefox |  Safari   |  Edge  |  IE   |
     *    | :-----: | :-----: | :-------: | :----: | :---: |
     *    |   48    |   41    |   10.1    |   12   |   9   |
     *    |    8′   |         |    5.1′   |        |       |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/writing-mode">MDN</a>
     */
    var writingMode: WritingMode?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   42   |   69    |   9    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/x">MDN</a>
     */
    var x: X?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2020.
     *
     * **Syntax**: `<length> | <percentage>`
     *
     * **Initial value**: `0`
     *
     *    | Chrome | Firefox | Safari |  Edge  | IE  |
     *    | :----: | :-----: | :----: | :----: | :-: |
     *    |   42   |   69    |   9    |   79   | No  |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/y">MDN</a>
     */
    var y: Y?

    /**
     * This feature is well established and works across many devices and browser versions. It’s been available across browsers since July 2015.
     *
     * **Syntax**: `auto | <integer>`
     *
     * **Initial value**: `auto`
     *
     *    | Chrome | Firefox | Safari |  Edge  |  IE   |
     *    | :----: | :-----: | :----: | :----: | :---: |
     *    |   1    |    1    |   1    |   12   |   4   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/z-index">MDN</a>
     */
    var zIndex: ZIndex?

    /**
     * Since May 2024, this feature works across the latest devices and browser versions. This feature might not work in older devices or browsers.
     *
     * **Syntax**: `normal | reset | <number [0,∞]> || <percentage [0,∞]>`
     *
     * **Initial value**: `1`
     *
     *    | Chrome | Firefox | Safari  |  Edge  |   IE    |
     *    | :----: | :-----: | :-----: | :----: | :-----: |
     *    |   1    |   126   |   3.1   |   12   |   5.5   |
     *
     * @see <a href="https://developer.mozilla.org/docs/Web/CSS/Reference/Properties/zoom">MDN</a>
     */
    var zoom: Zoom?
}
