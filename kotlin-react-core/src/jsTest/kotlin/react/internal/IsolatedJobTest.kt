package react.internal

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class IsolatedJobTest {
    @Test
    fun launch() = runTest {
        var a = 13

        isolatedJob {
            a = 42
        }

        assertEquals(42, a)
    }
}
