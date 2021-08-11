package benchmark

import StyledElementsFactory.getCssBuilders
import styled.toStyledCss
import waitFlowCoroutine
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
class ConvertToStyled : BenchmarkBase() {
    private suspend fun convertNCssBuilders(n: Int): Duration {
        val builders = getCssBuilders(n)
        return measureTime {
            val x = builders.map { it.toStyledCss() }
            assertFalse(x.isEmpty())
            waitFlowCoroutine()
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
