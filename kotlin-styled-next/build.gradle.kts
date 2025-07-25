import org.gradle.api.tasks.PathSensitivity.RELATIVE

plugins {
    id("wrappersbuild.kotlin-legacy-library-conventions")
}

kotlin {
    js {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadlessNoSandbox()
                }
            }
        }
    }
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCss)
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDomLegacy)

    jsMainApi(libs.kotlinx.html)

    commonMainApi(npm(jspkg.inlineStylePrefixer))

    commonTestImplementation(libs.kotlin.test)
    jsTestImplementation(libs.coroutines.core)

    jsTestImplementation(devNpm(jspkg.puppeteer))
}

val printBenchmarkResults by tasks.registering {
    dependsOn(tasks.allTests)

    // implicit dependency to benchmark classes names
    val fileNames = listOf(
        "AddDuplicateCss",
        "AddStyledElements",
        "ConvertToStyled",
        "CssBuildersInject",
        "DataTypeOperations",
        "InjectCssNPlusOne",
    )
    val reports = objects.fileCollection().from(fileNames.map { test ->
        layout.buildDirectory.file("reports/tests/test/classes/benchmark.$test.html")
    })

    inputs.files(reports)
        .withPropertyName("reports")
        .withPathSensitivity(RELATIVE)

    doLast {
        reports.forEach { report ->
            val reportText = report.readText()
            "#.*;".toRegex().findAll(reportText).map { it.value }.forEach { stdout ->
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

tasks.allTests {
    enabled = project.findProperty("test") == true

    if (enabled) {
        finalizedBy(printBenchmarkResults)
    }
}
