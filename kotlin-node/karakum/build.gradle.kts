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
            implementation("io.github.sgrishchenko:karakum:1.0.0-alpha.50")
        }
    }
}

tasks.named<ProcessResources>("jsProcessResources") {
    filesMatching("config.json") {
        expand(
            "nodeModules" to rootProject.layout.buildDirectory.dir("js/node_modules").get().asFile.path,
            "outputProject" to layout.projectDirectory.dir("..").asFile.path,
        )
    }
}
