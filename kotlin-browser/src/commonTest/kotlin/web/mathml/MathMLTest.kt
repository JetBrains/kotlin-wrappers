package web.mathml

import kotlin.test.assertEquals

class MathMLTest {
    fun shouldResolveNamespace() {
        assertEquals<Any>("http://www.w3.org/1998/Math/MathML", MATHML_NAMESPACE)
    }
}
