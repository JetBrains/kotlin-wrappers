// Automatically generated - do not modify!

package web.cssom

import kotlin.js.definedExternally

/**
 * The **`CSSTranslate`** interface of the CSS Typed Object Model API represents the translate() value of the individual transform property in CSS. It inherits properties and methods from its parent CSSTransformValue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate)
 */
open external class CSSTranslate(
    /**
     * The **`x`** property of the CSSTranslate interface gets and sets the abscissa or x-axis of the translating vector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/x)
     */
    var x: CSSNumericValue,
    /**
     * The **`y`** property of the CSSTranslate interface gets and sets the ordinate or y-axis of the translating vector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/y)
     */
    var y: CSSNumericValue,
    /**
     * The **`z`** property of the CSSTranslate interface representing the z-component of the translating vector. A positive value moves the element towards the viewer, and a negative value farther away.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/z)
     */
    var z: CSSNumericValue = definedExternally,
) : CSSTransformComponent
