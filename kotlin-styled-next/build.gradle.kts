plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

kotlin.js {
    browser {
        testTask {
            testLogging.showStandardStreams = true
            useKarma {
                useChromeHeadless()
            }
        }
    }
}

kotlin.sourceSets.test {
    languageSettings.optIn("kotlin.time.ExperimentalTime")
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-css"))
    api(project(":kotlin-react-legacy"))
    api(project(":kotlin-react-dom-legacy"))

    api(kotlinxHtml("js"))

    api(npmv("inline-style-prefixer"))

    testImplementation(kotlin("test-js"))
    testImplementation(kotlinxCoroutines("core"))

    testImplementation(devNpmv("puppeteer"))
}


tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
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

tasks.named("test") {
    enabled = project.hasProperty("test")
    if (enabled) {
        finalizedBy(printBenchmarkResults)
    }
}
