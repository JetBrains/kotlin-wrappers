// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Represents different positions for rendering a decoration in an [overview ruler][DecorationRenderOptions.overviewRulerLane].
 * The overview ruler supports three lanes.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OverviewRulerLane)
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
