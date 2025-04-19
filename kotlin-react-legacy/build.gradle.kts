plugins {
    id("kotlin-legacy-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
}
