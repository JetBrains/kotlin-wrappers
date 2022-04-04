package benchmark

import StyledElementsFactory.getCssBuilders
import measureTimeJS
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.time.Duration

class ConvertToStyled : BenchmarkBase() {
    private suspend fun convertNCssBuilders(n: Int): Duration {
        return measureTimeJS {
            val builders = getCssBuilders(n)
            assertFalse(builders.isEmpty())
        }
    }

    @Test
    fun convert100builders() = runBenchmark("convert100builders") {
        convertNCssBuilders(100)
    }

    @Test
    fun convert200builders() = runBenchmark("convert200builders") {
        convertNCssBuilders(200)
    }

    @Test
    fun convert500builders() = runBenchmark("convert500builders") {
        convertNCssBuilders(500)
    }

    @Test
    fun convert1kBuilders() = runBenchmark(name = "convert1kBuilders", repeat = 3) {
        convertNCssBuilders(1000)
    }
}
