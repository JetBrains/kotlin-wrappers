plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinCssomCore)
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(devNpm(jspkg.csstype))
}
