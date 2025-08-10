// TODO: remove suppress after canvas mixins update

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.css.painting

import web.canvas.*
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintRenderingContext2D)
 */
@ExperimentalWebApi
sealed /* final */
external class PaintRenderingContext2D :
    CanvasState,
    CanvasTransform,
    CanvasCompositing,
    CanvasImageSmoothing,
    CanvasFillStrokeStyles,
    CanvasShadowStyles,
    CanvasRect,
    CanvasDrawPath,
    CanvasDrawImage,
    CanvasPathDrawingStyles,
    CanvasPath

