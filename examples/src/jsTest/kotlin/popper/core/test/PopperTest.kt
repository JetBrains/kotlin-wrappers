package popper.core.test

import popper.core.Popper
import popper.core.modifiers.Arrow
import kotlin.test.Test
import kotlin.test.assertEquals

class PopperTest {
    @Test
    fun popper() {
        assertEquals<Any>("popper", Popper)
    }

    @Test
    fun arrowModifier() {
        assertEquals<Any>("arrow", Arrow)
    }
}
