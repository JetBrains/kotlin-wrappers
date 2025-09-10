plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinCssomCore)
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)

    webMainApi(devNpm(jspkg.csstype))
}
