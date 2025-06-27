package web.mathml.svg

import web.svg.SVG_NAMESPACE
import kotlin.test.assertEquals

class SVGTest {
    fun shouldResolveNamespace() {
        assertEquals<Any>("http://www.w3.org/2000/svg", SVG_NAMESPACE)
    }
}
