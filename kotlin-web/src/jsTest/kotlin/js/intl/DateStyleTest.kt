package js.intl

import js.intl.DateStyle.Companion.full
import kotlin.test.Test
import kotlin.test.assertEquals

class DateStyleTest {
    @Test
    fun import() {
        assertEquals<Any>("medium", DateStyle.medium)
    }

    @Test
    fun staticImport() {
        assertEquals<Any>("full", full)
    }
}
