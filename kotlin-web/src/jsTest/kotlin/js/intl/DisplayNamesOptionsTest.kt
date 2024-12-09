package js.intl

import kotlin.test.Test
import kotlin.test.assertEquals

class DisplayNamesOptionsTest {
    @Test
    fun type() {
        val options = DisplayNamesOptions(
            type = DisplayNamesType.language
        )

        assertEquals<Any>("language", options.type)
    }
}
