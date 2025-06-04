// Automatically generated - do not modify!

package web.cssom

import web.geometry.DOMMatrix
import web.geometry.DOMMatrixReadOnly
import kotlin.js.definedExternally

/**
 * The **`CSSMatrixComponent`** interface of the CSS Typed Object Model API represents the matrix() and matrix3d() values of the individual transform property in CSS.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMatrixComponent)
 */
open external class CSSMatrixComponent(
    matrix: DOMMatrixReadOnly,
    options: CSSMatrixComponentOptions = definedExternally,
) : CSSTransformComponent {
    /**
     * The **`matrix`** property of the See the matrix() and matrix3d() pages for examples.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMatrixComponent/matrix)
     */
    var matrix: DOMMatrix
}
