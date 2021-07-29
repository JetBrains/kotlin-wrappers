plugins {
    kotlin("multiplatform")
    `publish-conventions`
}

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                }
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                api(project(":kotlin-extensions"))
                api(project(":kotlin-css"))
                api(project(":kotlin-react"))
                api(project(":kotlin-react-dom"))

                api(kotlinxHtml("js"))

                api(npm("css-in-js-utils", "^3.1.0"))
                api(npm("inline-style-prefixer", "^6.0.0"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")

                implementation(project(":kotlin-react"))
                implementation(project(":kotlin-react-dom"))
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
                        "CSSBuildersInject",
                        "DataTypeOperations"
                    )
                    fileNames.forEach { test ->
                        val report = buildDir.resolve("reports/tests/jsTest/classes/benchmark.$test.html").readText()
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

            tasks.named("jsTest") {
                enabled = project.hasProperty("test")
                if (enabled) {
                    finalizedBy(printBenchmarkResults)
                }
            }
        }
    }
}

