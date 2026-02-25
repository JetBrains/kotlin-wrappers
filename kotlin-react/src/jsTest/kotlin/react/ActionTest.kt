package react

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class ActionTest {
    @Test
    fun actionTest() = runTest {
        var value = 13

        val action = Action<Int> { data ->
            value = data
        }

        action(42)

        assertEquals(42, value)
    }
}
