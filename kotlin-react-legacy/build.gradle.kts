plugins {
    id("wrappersbuild.kotlin-legacy-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
}
