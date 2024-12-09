package js.intl

import kotlin.test.Test
import kotlin.test.assertEquals

class DisplayNamesOptionsTest {
    @Test
    fun type() {
        val options = DisplayNamesOptions(
            type = DisplayNamesType.region
        )

        assertEquals<Any>("region", options.type)
    }
}
