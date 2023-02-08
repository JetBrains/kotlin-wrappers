import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

kotlin {
    js {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                }
            }
        }
    }
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.time.ExperimentalTime"
}

dependencies {
    jsMainApi(project(":kotlin-extensions"))
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-css"))
    jsMainApi(project(":kotlin-react-legacy"))
    jsMainApi(project(":kotlin-react-dom-legacy"))

    jsMainApi(kotlinxHtml("js"))

    jsMainApi(npmv("inline-style-prefixer"))

    jsTestImplementation(kotlin("test-js"))
    jsTestImplementation(kotlinxCoroutines("core"))

    jsTestImplementation(devNpmv("puppeteer"))
}

val printBenchmarkResults by tasks.registering {
    doLast {
        // implicit dependency to benchmark classes names
        val fileNames = listOf(
            "AddStyledElements",
            "ConvertToStyled",
            "CssBuildersInject",
            "AddDuplicateCss",
            "DataTypeOperations",
            "InjectCssNPlusOne"
        )
        fileNames.forEach { test ->
            val report = buildDir.resolve("reports/tests/test/classes/benchmark.$test.html").readText()
            "#.*;".toRegex().findAll(report).map { it.value }.forEach { stdout ->
                val benchmarks = stdout.split(";").mapNotNull {
                    if (it.isEmpty()) {
                        null
                    } else {
                        val b = it.split(":")
                        val testName = b[0].replace("#", "")
                        val benchmarkMs = b[1].toInt()

                        testName to benchmarkMs
                    }
                }.toMap()

                benchmarks.forEach {
                    // TeamCity messages need to escape '[' and ']' using '|'
                    val testName = it.key
                        .replace("[", "|[")
                        .replace("]", "|]")
                    println("##teamcity[buildStatisticValue key='benchmark_$testName' value='${it.value}']")
                }
            }
        }
    }
}

tasks.jsIrTest {
    enabled = project.hasProperty("test") && project.property("test") == true

    if (enabled) {
        finalizedBy(printBenchmarkResults)
    }
}
