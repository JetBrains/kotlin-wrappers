// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Represents different positions for rendering a decoration in an {@link DecorationRenderOptions.overviewRulerLane overview ruler}.
 * The overview ruler supports three lanes.
 */
sealed /* enum */
external interface OverviewRulerLane {
    companion object {
        /**
         * The left lane of the overview ruler.
         */
        val Left: OverviewRulerLane // 1

        /**
         * The center lane of the overview ruler.
         */
        val Center: OverviewRulerLane // 2

        /**
         * The right lane of the overview ruler.
         */
        val Right: OverviewRulerLane // 4

        /**
         * All lanes of the overview ruler.
         */
        val Full: OverviewRulerLane // 7
    }
}
