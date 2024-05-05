// Automatically generated - do not modify!

@file:JsModule("@mui/base/Slider")

package mui.base

import web.cssom.ClassName

sealed external interface SliderClasses {
    /** Class name applied to the root element. */
    val root: ClassName

    /** Class name applied to the root element if `marks` is provided with at least one label. */
    val marked: ClassName

    /** Class name applied to the root element if `orientation="vertical"`. */
    val vertical: ClassName

    /** State class applied to the root and thumb element if `disabled={true}`. */
    val disabled: ClassName

    /** State class applied to the root if a thumb is being dragged. */
    val dragging: ClassName

    /** Class name applied to the rail element. */
    val rail: ClassName

    /** Class name applied to the track element. */
    val track: ClassName

    /** Class name applied to the root element if `track={false}`. */
    val trackFalse: ClassName

    /** Class name applied to the root element if `track="inverted"`. */
    val trackInverted: ClassName

    /** Class name applied to the thumb element. */
    val thumb: ClassName

    /** State class applied to the thumb element if it's active. */
    val active: ClassName

    /** State class applied to the thumb element if keyboard focused. */
    val focusVisible: ClassName

    /** Class name applied to the mark element. */
    val mark: ClassName

    /** Class name applied to the mark element if active (depending on the value). */
    val markActive: ClassName

    /** Class name applied to the mark label element. */
    val markLabel: ClassName

    /** Class name applied to the mark label element if active (depending on the value). */
    val markLabelActive: ClassName
}

external val sliderClasses: SliderClasses
