// Automatically generated - do not modify!

package mui.base

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.cssom.ClassName

@JsVirtual
sealed external interface SliderClasses {
    companion object {
        /** Class name applied to the root element. */
        @JsValue("base-Slider-root")
        val root: ClassName

        /** Class name applied to the root element if `marks` is provided with at least one label. */
        @JsValue("base-Slider-marked")
        val marked: ClassName

        /** Class name applied to the root element if `orientation="vertical"`. */
        @JsValue("base-Slider-vertical")
        val vertical: ClassName

        /** State class applied to the root and thumb element if `disabled={true}`. */
        @JsValue("base-disabled")
        val disabled: ClassName

        /** State class applied to the root if a thumb is being dragged. */
        @JsValue("base-Slider-dragging")
        val dragging: ClassName

        /** Class name applied to the rail element. */
        @JsValue("base-Slider-rail")
        val rail: ClassName

        /** Class name applied to the track element. */
        @JsValue("base-Slider-track")
        val track: ClassName

        /** Class name applied to the root element if `track={false}`. */
        @JsValue("base-Slider-trackFalse")
        val trackFalse: ClassName

        /** Class name applied to the root element if `track="inverted"`. */
        @JsValue("base-Slider-trackInverted")
        val trackInverted: ClassName

        /** Class name applied to the thumb element. */
        @JsValue("base-Slider-thumb")
        val thumb: ClassName

        /** State class applied to the thumb element if it's active. */
        @JsValue("base-active")
        val active: ClassName

        /** State class applied to the thumb element if keyboard focused. */
        @JsValue("base-focusVisible")
        val focusVisible: ClassName

        /** Class name applied to the mark element. */
        @JsValue("base-Slider-mark")
        val mark: ClassName

        /** Class name applied to the mark element if active (depending on the value). */
        @JsValue("base-Slider-markActive")
        val markActive: ClassName

        /** Class name applied to the mark label element. */
        @JsValue("base-Slider-markLabel")
        val markLabel: ClassName

        /** Class name applied to the mark label element if active (depending on the value). */
        @JsValue("base-Slider-markLabelActive")
        val markLabelActive: ClassName
    }
}
