import com.moowork.gradle.node.npm.NpmTask

plugins {
    id("com.github.node-gradle.node")
}

val BUILD_NPM = "build/npm"
val PACKAGE_JSON = "package.json"

tasks {
    val processPkg = register<Copy>("processPkg") {
        from(".")
        into(BUILD_NPM)
        include(PACKAGE_JSON)
        expand(versionMap())
    }

    val prepublish = register<Copy>("prepublish") {
        from(".")
        into(BUILD_NPM)
        exclude(PACKAGE_JSON)
        exclude(BUILD_NPM)

        dependsOn(named("build"))
    }

    named<NpmTask>("npm_publish") {
        setArgs(listOf("--access", "public"))
        setWorkingDir(file(BUILD_NPM))

        dependsOn(prepublish)
        dependsOn(processPkg)
    }
}

fun versionMap(): Map<String, String> =
    sequenceOf(
        "css",
        "kotlin",
        "kotlinext",
        "mocha",
        "react",
        "react-dom",
        "react-redux",
        "react-router-dom",
        "redux",
        "styled"
    ).associate(::versionPair)
