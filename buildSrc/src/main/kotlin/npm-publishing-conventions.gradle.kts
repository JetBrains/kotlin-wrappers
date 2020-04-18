import com.moowork.gradle.node.npm.NpmTask

plugins {
    id("com.github.node-gradle.node")
}

tasks {
    val generateNpmPackageJson = register("generateNpmPackageJson") {
        val packageJson = temporaryDir.resolve("package.json")

        outputs.file(packageJson)

        doLast {
            packageJson.writeText(generatePackageJson())
        }
    }

    val prepareNpmPublish = register<Copy>("prepareNpmPublish") {
        from(jsOutputDir)

        from(generateNpmPackageJson)

        from(".") {
            include("README.md")
        }

        into(npmBuildDir)

        dependsOn(named("build"))
    }

    named<NpmTask>("npm_publish") {
        setArgs(listOf("--access", "public"))
        setWorkingDir(npmBuildDir)

        dependsOn(prepareNpmPublish)
    }
}
