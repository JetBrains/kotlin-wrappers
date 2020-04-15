import com.moowork.gradle.node.npm.NpmTask

plugins {
    id("com.github.node-gradle.node")
}

tasks {
    val processPkg = register<Copy>("processPkg") {
        from(".")
        into("build/npm")
        include("package.json")
        expand(versionMap())
    }

    val prepublish = register<Copy>("prepublish") {
        from(".")
        into("build/npm")
        exclude("package.json")
        exclude("build/npm")

        dependsOn(named("build"))
    }

    named<NpmTask>("npm_publish") {
        setArgs(listOf("--access", "public"))
        setWorkingDir(file("build/npm"))

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
