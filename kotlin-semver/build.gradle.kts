plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(npm(libs.npm.semver))
    jsMainImplementation(devNpm(libs.npm.types.semver))
}
