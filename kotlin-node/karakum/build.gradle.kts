import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("io.github.turansky.seskar")
}

kotlin {
    js {
        moduleName = "kotlin-node-karakum"

        nodejs()

        compilerOptions {
            target = "es2015"
        }

        binaries.executable()
    }


    sourceSets {
        jsMain.dependencies {
            implementation(libs.npm.types.node.get().let {
                npm(
                    name = it.name,
                    version = it.version!!,
                )
            })

            implementation(projects.kotlinJs)
            implementation(projects.kotlinNode)
            implementation(projects.kotlinTypescript)

            implementation("io.github.sgrishchenko:karakum:1.0.0-alpha.50") {
                exclude(group = "org.jetbrains.kotlin-wrappers")
            }
        }
    }
}

tasks.named<NodeJsExec>("jsNodeProductionRun") {
    args(layout.projectDirectory.dir("../src/jsMain/generated").asFile.path)
}
