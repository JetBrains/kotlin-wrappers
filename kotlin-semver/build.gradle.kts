plugins {
    id("wrappersbuild.kotlin-library-conventions")
    alias(libs.plugins.karakum)
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(npm(libs.npm.semver))
    commonMainImplementation(devNpm(libs.npm.types.semver))
}
